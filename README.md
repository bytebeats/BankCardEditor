# CardNumFormatEditText
Splitted a band card numer or a credit card number by whitespace/pound/hyphen every 4 digitals

这是针对常见的输入银行卡号并对卡号自动分割部分工程。分割符可以量'#','-'或者空格。它比平时见的优点就是在光标处于分隔符之前时按返回键，可以让光标自动跳过分隔符。

Effect Graph
-------

<img src="/media/bank_card_format.gif" width="360" height="720"/>

How to use
-------
<br>in xml files:
```
        <me.bytebeats.views.bankcard.FormatEditText
            android:paddingStart="10dp"
            app:splitter="pound"
            android:inputType="number"
            android:id="@+id/format_edit_text"
            android:hint="splitted by pounds"
            android:gravity="start|center_vertical"
            android:layout_width="match_parent"
            android:layout_height="40dp" />

```
<br>in Kotlin:
```
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
```