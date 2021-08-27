package me.bytebeats.views.bankcard

fun verifyBankCard(trimmedBankCard: String?): Boolean {
    if (trimmedBankCard.isNullOrEmpty()) return false
    val bit = bankCardVerifyCode(trimmedBankCard.substring(0, trimmedBankCard.lastIndex))
    return if (bit == 'N') false
    else trimmedBankCard.last() == bit
}

fun bankCardVerifyCode(unverifiedBankCard: String?): Char {
    if (unverifiedBankCard.isNullOrEmpty() || unverifiedBankCard.length !in 16..19
        || !unverifiedBankCard.matches(Regex("\\d+"))) return 'N'
    val chs = unverifiedBankCard.toCharArray()
    var luhm = 0
    var i = chs.lastIndex
    var j = 0
    while (i >= 0) {
        var k = chs[i] - '0'
        if (j and 1 == 0) {
            k *= 2
            k = k / 10 + k % 10
        }
        luhm += k
        i--
        j++
    }
    return if (luhm % 10 == 0) '0' else '0' + (10 - luhm % 10)
}

