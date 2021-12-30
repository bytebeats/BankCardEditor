# BankCardEditor
Split a band card number or a credit card number by whitespace/pound/hyphen every 4 digital.
<br>每4位使用特定字符分割银行卡号. 分割符可以是'#','-'或者空格. 它比平时见的优点就是在光标处于分隔符之前时按返回键，可以让光标自动跳过分隔符。
并且可以根据卡号查找到该银行卡的开户行, 银行编码及银行卡类别(仅限于中国大陆银行卡).

Effect Graph
-------

<img src="/media/bank_card_format.gif" width="360" height="800"/>

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
    

PS: 因为代码提供的数据源有限, 所有存在一些银行查找不通过的情况. 但是根据网上搜索的资料, 不少项目多少都存在这些问题. 没有办法这些属于动态资源, 也请能够提供 PR 多添加些数据源.


## MIT License

    Copyright (c) 2021 Chen Pan

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
