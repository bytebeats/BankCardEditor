package me.bytebeats.views.bankcard.app

import android.app.Activity
import me.bytebeats.views.bankcard.FormatEditText
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    private val formatEditText by lazy { findViewById<FormatEditText>(R.id.format_edit_text) }
    private val formatEditText2 by lazy { findViewById<FormatEditText>(R.id.format_edit_text_2) }
    private val bankName1 by lazy { findViewById<TextView>(R.id.bank_name_1) }
    private val bankName2 by lazy { findViewById<TextView>(R.id.bank_name_2) }
    private val cardType1 by lazy { findViewById<TextView>(R.id.card_type_1) }
    private val cardType2 by lazy { findViewById<TextView>(R.id.card_type_2) }
    private val verify by lazy { findViewById<TextView>(R.id.verify) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        formatEditText.onVerifyBankCardListener = object : FormatEditText.OnVerifyBankCardListener {
            override fun onVerified(cardBank: String?, cardType: String?) {
                bankName1.text = cardBank ?: UNKNOWN
                cardType1.text = cardType ?: UNKNOWN
            }
        }

        verify.setOnClickListener {
            formatEditText2.verify(object : FormatEditText.OnVerifyResultListener {
                override fun onSuccess(cardBank: String?, cardType: String?) {
                    bankName2.text = cardBank
                    cardType2.text = cardType
                }

                override fun onFailure() {
                    bankName2.text = UNKNOWN
                    cardType2.text = UNKNOWN
                }
            })
        }
    }

    companion object {
        private const val UNKNOWN = "Unknown"
    }
}