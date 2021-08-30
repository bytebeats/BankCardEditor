package me.bytebeats.views.bankcard

import androidx.appcompat.widget.AppCompatEditText
import android.content.Context
import android.util.AttributeSet

/**
 * @author bytebeats || happychinapc[at]gmail[dot]com
 * @date 2015/3/25
 * @time 16:58
 */
class BankCardEditText : AppCompatEditText {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(attrs, defStyleAttr)
    }

    var onVerifyBankCardListener: OnVerifyBankCardListener?
        get() = mTextWatcher.onBankCardVerifyListener
        set(value) {
            mTextWatcher.onBankCardVerifyListener = value
        }

    private val mTextWatcher by lazy { BankCardTextWatcher(this) }

    private fun init(attrs: AttributeSet?, defStyleAttr: Int) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.BankCardEditText, defStyleAttr, 0)
        val splitterIdx = typedArray.getInt(R.styleable.BankCardEditText_splitter, 0)
        mTextWatcher.splitter = Splitter.values()[splitterIdx]
        typedArray.recycle()
        addTextChangedListener(mTextWatcher)
        isFocusable = true
        isEnabled = true
        isFocusableInTouchMode = true
    }

    val splitter: Splitter
        get() = mTextWatcher.splitter

    fun trimmedBankCardNo(): String? = BankCardTextWatcher.trimmedBankCardNo(this)

    fun verify(verifyBankCardListener: OnVerifyBankCardListener?) {
        trimmedBankCardNo()?.let {
            if (verifyBankCard(it)) {
                val bankCardInfo = BankCardInfo(it)
                verifyBankCardListener?.onSuccess(bankCardInfo.cardBank, bankCardInfo.cardType)
            } else {
                verifyBankCardListener?.onFailure()
            }
        }
    }
}