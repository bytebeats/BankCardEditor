package me.bytebeats.views.bankcard.app

import android.app.Activity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import me.bytebeats.views.bankcard.BankCardEditText
import me.bytebeats.views.bankcard.OnVerifyBankCardListener

class MainActivity : Activity() {
    private val bankCardEditText by lazy { findViewById<BankCardEditText>(R.id.format_edit_text) }
    private val bankCardEditText2 by lazy { findViewById<BankCardEditText>(R.id.format_edit_text_2) }
    private val bankName1 by lazy { findViewById<TextView>(R.id.bank_name_1) }
    private val bankName2 by lazy { findViewById<TextView>(R.id.bank_name_2) }
    private val cardType1 by lazy { findViewById<TextView>(R.id.card_type_1) }
    private val cardType2 by lazy { findViewById<TextView>(R.id.card_type_2) }
    private val verify by lazy { findViewById<TextView>(R.id.verify) }
    private val extra by lazy { findViewById<TextView>(R.id.extra) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bankCardEditText.onVerifyBankCardListener = object : OnVerifyBankCardListener {
            override fun onSuccess(cardBank: String?, cardType: String?) {
                bankName1.text = cardBank
                cardType1.text = cardType
            }

            override fun onFailure() {
                bankName1.text = UNKNOWN
                cardType1.text = UNKNOWN
            }
        }

        verify.setOnClickListener {
            bankCardEditText2.verify(object : OnVerifyBankCardListener {
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
        extra.text = Html.fromHtml(LUHN)
    }

    companion object {
        private const val UNKNOWN = "Unknown"
        private const val LUHN =
            "知识扩展" + "<br/>" + "<font color='#333333'><big>Luhn</big></font> <font color='#999999'><small>检验数字算法（Luhn Check Digit Algorithm），也叫做模数10公式，是一种简单的算法，用于" +
                    "验证银行卡、信用卡号码的有效性的算法。对所有大型信用卡公司发行的信用卡都起作用，这些公司包括美国Express、护照、" +
                    "万事达卡、Discover和用餐者俱乐部等。这种算法最初是在20世纪60年代由一组数学家制定，现在Luhn检验数字算法属于大众，" +
                    "任何人都可以使用它。<br/>" + "<br/>" +
                    "算法：将每个奇数加倍和使它变为单个的数字，如果必要的话通过减去9和在每个偶数上加上这些值。如果此卡要有效，那么，结果必须是10的倍数。</small></font>"
    }
}