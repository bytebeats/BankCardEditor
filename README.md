# BankCardEditor
Split a band card number or a credit card number by whitespace/pound/hyphen every 4 digital.
<br>每4位使用特定字符分割银行卡号. 分割符可以是'#','-'或者空格. 它比平时见的优点就是在光标处于分隔符之前时按返回键，可以让光标自动跳过分隔符。
并且可以根据卡号查找到该银行卡的开户行, 银行编码及银行卡类别(仅限于中国大陆银行卡).

Effect Graph
-------

<img src="/media/bank_card_format.gif" width="360" height="720"/>

How to use
-------
<br>in xml files:
```
        <me.bytebeats.views.bankcard.BankCardEditText
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
        bankCardEditText.onVerifyBankCardListener = object : OnVerifyBankCardListener {
            override fun onSuccess(bankCardInfo: BankCardInfo?) {
                bankName1.text = bankCardInfo?.cardBank
                cardType1.text = bankCardInfo?.cardType
            }

            override fun onFailure() {
                bankName1.text = UNKNOWN
                cardType1.text = UNKNOWN
            }
        }

        verify.setOnClickListener {
            bankCardEditText2.verify(object : OnVerifyBankCardListener {
                override fun onSuccess(bankCardInfo: BankCardInfo?) {
                    bankName2.text = bankCardInfo?.cardBank
                    cardType2.text = bankCardInfo?.cardType
                }

                override fun onFailure() {
                    bankName2.text = UNKNOWN
                    cardType2.text = UNKNOWN
                }
            })
        }
```

## Features/特点

- 支持自动根据银行卡号获取出银行名称、银行编码、银行卡类型
- 银行相关信息都比较全，无需每次去都 xls 类型的 bin 文件
- 支持自动格式化银行卡号输入
    - 银行卡号：xxxx xxxx xxxx xxxx