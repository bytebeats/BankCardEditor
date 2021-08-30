package me.bytebeats.views.bankcard

/**
 * @Author bytebeats
 * @Email <happychinapc@gmail.com>
 * @Github https://github.com/bytebeats
 * @Created on 2021/8/30 18:23
 * @Version 1.0
 * @Description To check bank card is valid
 */

interface OnVerifyBankCardListener {
    fun onSuccess(bankCardInfo: BankCardInfo?)
    fun onFailure()
}