package me.bytebeats.views.bankcard

import androidx.appcompat.widget.AppCompatEditText
import android.content.Context
import android.util.AttributeSet

/**
 * @author bytebeats || happychinapc[at]gmail[dot]com
 * @date 2015/3/25
 * @time 16:58
 */
class FormatEditText : AppCompatEditText {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(attrs, defStyleAttr)
    }

    var onVerifyBankCardListener: OnVerifyBankCardListener? = null

    private val mTextWatcher by lazy { FormatTextWatcher(this) }

    private fun init(attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.FormatEditText, defStyleAttr, 0)
        val splitterIdx = typedArray.getInt(R.styleable.FormatEditText_splitter, 0)
        mTextWatcher.splitter = Splitter.values()[splitterIdx]
        typedArray.recycle()
        addTextChangedListener(mTextWatcher)
        isFocusable = true
        isEnabled = true
        isFocusableInTouchMode = true
    }

    val splitter: Splitter
        get() = mTextWatcher.splitter

    fun trimmedBankCardNo(): String? {
        return text?.replace(Regex(splitter.splitter.toString()), "")
    }

    fun verify(onVerifyResultListener: OnVerifyResultListener?) {
        trimmedBankCardNo()?.let {
            if (verifyBankCard(it)) {
                val bankCardInfo = BankCardInfo(it)
                onVerifyResultListener?.onSuccess(bankCardInfo.cardBank, bankCardInfo.cardType)
            } else {
                onVerifyResultListener?.onFailure()
            }
        }
    }

    interface OnVerifyBankCardListener {
        fun onVerified(cardBank: String?, cardType: String?)
    }

    interface OnVerifyResultListener {
        fun onSuccess(cardBank: String?, cardType: String?)
        fun onFailure()
    }
}