package me.bytebeats.views.bankcard

import java.util.regex.Pattern

/**
 * @Author bytebeats
 * @Email <happychinapc@gmail.com>
 * @Github https://github.com/bytebeats
 * @Created on 2021/8/27 19:54
 * @Version 1.0
 * @Description TO-DO
 */

class BankCardInfo(private val cardNo: String) {

    val cardBank: String
        get() = getBankName(cardNo)

    val cardType: String
        get() = getCardType(cardNo)

    companion object {

        fun getCardType(bankNo: String): String {
            return if (Pattern.matches(s1, bankNo) || Pattern.matches(s2, bankNo) || Pattern.matches(
                    s4,
                    bankNo
                ) || Pattern.matches(s5, bankNo) || Pattern.matches(s6, bankNo) || Pattern.matches(
                    s7,
                    bankNo
                )
                || Pattern.matches(s14, bankNo) || Pattern.matches(s15, bankNo) || Pattern.matches(
                    s16,
                    bankNo
                )
                || Pattern.matches(s19, bankNo) || Pattern.matches(s20, bankNo) || Pattern.matches(
                    s26,
                    bankNo
                ) || Pattern.matches(s27, bankNo) || Pattern.matches(s28, bankNo)
                || Pattern.matches(s34, bankNo) || Pattern.matches(s35, bankNo) || Pattern.matches(
                    s36,
                    bankNo
                ) || Pattern.matches(s41, bankNo) || Pattern.matches(s42, bankNo) || Pattern.matches(
                    s43,
                    bankNo
                )
                || Pattern.matches(s47, bankNo) || Pattern.matches(s50, bankNo) || Pattern.matches(
                    s51,
                    bankNo
                ) || Pattern.matches(s52, bankNo) || Pattern.matches(s53, bankNo)
                || Pattern.matches(s55, bankNo) || Pattern.matches(s56, bankNo) || Pattern.matches(
                    s59,
                    bankNo
                ) || Pattern.matches(s61, bankNo) || Pattern.matches(s62, bankNo)
                || Pattern.matches(s65, bankNo) || Pattern.matches(s66, bankNo) || Pattern.matches(
                    s67,
                    bankNo
                ) || Pattern.matches(s70, bankNo) || Pattern.matches(s71, bankNo)
                || Pattern.matches(s73, bankNo) || Pattern.matches(s74, bankNo) || Pattern.matches(
                    s79,
                    bankNo
                ) || Pattern.matches(s80, bankNo)
                || Pattern.matches(s83, bankNo) || Pattern.matches(s84, bankNo) || Pattern.matches(
                    s85,
                    bankNo
                ) || Pattern.matches(s87, bankNo) || Pattern.matches(s89, bankNo) || Pattern.matches(
                    s90,
                    bankNo
                )
                || Pattern.matches(s92, bankNo) || Pattern.matches(s93, bankNo) || Pattern.matches(
                    s95,
                    bankNo
                ) || Pattern.matches(s97, bankNo) || Pattern.matches(s98, bankNo)
                || Pattern.matches(s100, bankNo) || Pattern.matches(s102, bankNo) || Pattern.matches(
                    s104,
                    bankNo
                ) || Pattern.matches(s105, bankNo) || Pattern.matches(s106, bankNo)
                || Pattern.matches(s108, bankNo) || Pattern.matches(s110, bankNo) || Pattern.matches(
                    s112,
                    bankNo
                ) || Pattern.matches(s115, bankNo) || Pattern.matches(s116, bankNo) || Pattern.matches(
                    s117,
                    bankNo
                )
                || Pattern.matches(s118, bankNo) || Pattern.matches(s120, bankNo) || Pattern.matches(
                    s121,
                    bankNo
                ) || Pattern.matches(s123, bankNo) || Pattern.matches(s124, bankNo)
                || Pattern.matches(s125, bankNo) || Pattern.matches(s126, bankNo) || Pattern.matches(
                    s128,
                    bankNo
                ) || Pattern.matches(s130, bankNo) || Pattern.matches(s131, bankNo) || Pattern.matches(
                    s132,
                    bankNo
                )
                || Pattern.matches(s133, bankNo) || Pattern.matches(s134, bankNo) or Pattern.matches(
                    s135,
                    bankNo
                ) or Pattern.matches(s136, bankNo) || Pattern.matches(s138, bankNo) || Pattern.matches(
                    s139,
                    bankNo
                )
                || Pattern.matches(s140, bankNo) || Pattern.matches(s141, bankNo) || Pattern.matches(
                    s144,
                    bankNo
                ) || Pattern.matches(s145, bankNo) || Pattern.matches(s146, bankNo)
                || Pattern.matches(s147, bankNo) || Pattern.matches(s148, bankNo) || Pattern.matches(
                    s150,
                    bankNo
                ) || Pattern.matches(s151, bankNo) || Pattern.matches(s152, bankNo)
                || Pattern.matches(s153, bankNo) || Pattern.matches(s154, bankNo) || Pattern.matches(
                    s155,
                    bankNo
                ) || Pattern.matches(s156, bankNo) || Pattern.matches(s157, bankNo) || Pattern.matches(
                    s159,
                    bankNo
                )
                || Pattern.matches(s160, bankNo) || Pattern.matches(s162, bankNo) || Pattern.matches(
                    s164,
                    bankNo
                ) || Pattern.matches(s166, bankNo) || Pattern.matches(s167, bankNo)
                || Pattern.matches(s169, bankNo) || Pattern.matches(s170, bankNo) || Pattern.matches(
                    s171,
                    bankNo
                ) || Pattern.matches(s172, bankNo) || Pattern.matches(s173, bankNo) || Pattern.matches(
                    s174,
                    bankNo
                ) || Pattern.matches(s175, bankNo)
                || Pattern.matches(s176, bankNo) || Pattern.matches(s178, bankNo) || Pattern.matches(
                    s179,
                    bankNo
                ) || Pattern.matches(s180, bankNo) || Pattern.matches(s181, bankNo) || Pattern.matches(
                    s182,
                    bankNo
                )
                || Pattern.matches(s183, bankNo) || Pattern.matches(s184, bankNo) || Pattern.matches(
                    s185,
                    bankNo
                ) || Pattern.matches(s186, bankNo) || Pattern.matches(s187, bankNo) || Pattern.matches(
                    s188,
                    bankNo
                )
                || Pattern.matches(s189, bankNo) || Pattern.matches(s192, bankNo) || Pattern.matches(
                    s193,
                    bankNo
                ) || Pattern.matches(s194, bankNo) || Pattern.matches(s197, bankNo) || Pattern.matches(
                    s198,
                    bankNo
                )
                || Pattern.matches(s201, bankNo) || Pattern.matches(s202, bankNo) || Pattern.matches(
                    s203,
                    bankNo
                ) || Pattern.matches(s205, bankNo) || Pattern.matches(s206, bankNo) || Pattern.matches(
                    s208,
                    bankNo
                )
                || Pattern.matches(s209, bankNo) || Pattern.matches(s210, bankNo) || Pattern.matches(
                    s212,
                    bankNo
                ) || Pattern.matches(s217, bankNo) || Pattern.matches(s219, bankNo)
                || Pattern.matches(s221, bankNo) || Pattern.matches(s222, bankNo) || Pattern.matches(
                    s224,
                    bankNo
                ) || Pattern.matches(s225, bankNo) || Pattern.matches(s226, bankNo) || Pattern.matches(
                    s229,
                    bankNo
                )
                || Pattern.matches(s231, bankNo) || Pattern.matches(s233, bankNo) || Pattern.matches(
                    s235,
                    bankNo
                ) || Pattern.matches(s238, bankNo) || Pattern.matches(s240, bankNo) || Pattern.matches(
                    s242,
                    bankNo
                )
                || Pattern.matches(s244, bankNo) || Pattern.matches(s245, bankNo) || Pattern.matches(
                    s246,
                    bankNo
                ) || Pattern.matches(s247, bankNo) || Pattern.matches(s249, bankNo) || Pattern.matches(
                    s251,
                    bankNo
                )
                || Pattern.matches(s253, bankNo) || Pattern.matches(s256, bankNo) || Pattern.matches(
                    s257,
                    bankNo
                ) || Pattern.matches(s259, bankNo) || Pattern.matches(s262, bankNo) || Pattern.matches(
                    s264,
                    bankNo
                )
                || Pattern.matches(s267, bankNo) || Pattern.matches(s268, bankNo) || Pattern.matches(
                    s270,
                    bankNo
                ) || Pattern.matches(s271, bankNo) || Pattern.matches(s273, bankNo) || Pattern.matches(
                    s275,
                    bankNo
                ) || Pattern.matches(s277, bankNo)
                || Pattern.matches(s279, bankNo) || Pattern.matches(s280, bankNo) || Pattern.matches(
                    s282,
                    bankNo
                ) || Pattern.matches(s284, bankNo) || Pattern.matches(s285, bankNo) || Pattern.matches(
                    s286,
                    bankNo
                )
                || Pattern.matches(s287, bankNo) || Pattern.matches(s288, bankNo) || Pattern.matches(
                    s289,
                    bankNo
                ) || Pattern.matches(s290, bankNo) || Pattern.matches(s291, bankNo) || Pattern.matches(
                    s292,
                    bankNo
                )
                || Pattern.matches(s293, bankNo) || Pattern.matches(s294, bankNo) || Pattern.matches(
                    s295,
                    bankNo
                ) || Pattern.matches(s296, bankNo) || Pattern.matches(s298, bankNo) || Pattern.matches(
                    s299,
                    bankNo
                ) || Pattern.matches(s300, bankNo)
                || Pattern.matches(s302, bankNo) || Pattern.matches(s304, bankNo) || Pattern.matches(
                    s305,
                    bankNo
                ) || Pattern.matches(s308, bankNo) || Pattern.matches(s309, bankNo)
                || Pattern.matches(s312, bankNo) || Pattern.matches(s314, bankNo)) {
                "储蓄卡"
            } else if (Pattern.matches(s3, bankNo) || Pattern.matches(s8, bankNo) || Pattern.matches(
                    s9,
                    bankNo
                ) || Pattern.matches(s10, bankNo) || Pattern.matches(s17, bankNo) || Pattern.matches(
                    s21,
                    bankNo
                )
                || Pattern.matches(s29, bankNo) || Pattern.matches(s30, bankNo) || Pattern.matches(
                    s31,
                    bankNo
                ) || Pattern.matches(s37, bankNo) || Pattern.matches(s38, bankNo)
                || Pattern.matches(s44, bankNo) || Pattern.matches(s45, bankNo) || Pattern.matches(
                    s48,
                    bankNo
                ) || Pattern.matches(s49, bankNo) || Pattern.matches(s54, bankNo)
                || Pattern.matches(s57, bankNo) || Pattern.matches(s58, bankNo) || Pattern.matches(
                    s60,
                    bankNo
                ) || Pattern.matches(s63, bankNo) || Pattern.matches(s68, bankNo) || Pattern.matches(
                    s72,
                    bankNo
                )
                || Pattern.matches(s75, bankNo) || Pattern.matches(s81, bankNo) || Pattern.matches(
                    s82,
                    bankNo
                ) || Pattern.matches(s86, bankNo) || Pattern.matches(s88, bankNo)
                || Pattern.matches(s91, bankNo) || Pattern.matches(s94, bankNo) || Pattern.matches(
                    s96,
                    bankNo
                ) || Pattern.matches(s99, bankNo) || Pattern.matches(
                    s101,
                    bankNo
                ) || Pattern.matches(s103, bankNo)
                || Pattern.matches(s107, bankNo) || Pattern.matches(s109, bankNo) || Pattern.matches(
                    s111,
                    bankNo
                ) || Pattern.matches(s113, bankNo) || Pattern.matches(s114, bankNo) || Pattern.matches(
                    s119,
                    bankNo
                )
                || Pattern.matches(s122, bankNo) || Pattern.matches(s127, bankNo) || Pattern.matches(
                    s129,
                    bankNo
                ) or Pattern.matches(s137, bankNo) || Pattern.matches(s142, bankNo)
                || Pattern.matches(s158, bankNo) || Pattern.matches(s161, bankNo) || Pattern.matches(
                    s163,
                    bankNo
                ) || Pattern.matches(s165, bankNo) || Pattern.matches(s167, bankNo)
                || Pattern.matches(s177, bankNo) || Pattern.matches(s191, bankNo) || Pattern.matches(
                    s190,
                    bankNo
                ) || Pattern.matches(s195, bankNo) || Pattern.matches(s199, bankNo)
                || Pattern.matches(s204, bankNo) || Pattern.matches(s207, bankNo) || Pattern.matches(
                    s211,
                    bankNo
                ) || Pattern.matches(s214, bankNo) || Pattern.matches(s216, bankNo)
                || Pattern.matches(s218, bankNo) || Pattern.matches(s220, bankNo) || Pattern.matches(
                    s223,
                    bankNo
                ) || Pattern.matches(s228, bankNo) || Pattern.matches(s230, bankNo) || Pattern.matches(
                    s232,
                    bankNo
                )
                || Pattern.matches(s234, bankNo) || Pattern.matches(s236, bankNo) || Pattern.matches(
                    s237,
                    bankNo
                ) || Pattern.matches(s239, bankNo) || Pattern.matches(s241, bankNo) || Pattern.matches(
                    s243,
                    bankNo
                )
                || Pattern.matches(s248, bankNo) || Pattern.matches(s250, bankNo) || Pattern.matches(
                    s252,
                    bankNo
                ) || Pattern.matches(s254, bankNo) || Pattern.matches(ss254, bankNo) || Pattern.matches(
                    s255,
                    bankNo
                )
                || Pattern.matches(s258, bankNo) || Pattern.matches(s260, bankNo) || Pattern.matches(
                    s261,
                    bankNo
                ) || Pattern.matches(s263, bankNo) || Pattern.matches(s265, bankNo) || Pattern.matches(
                    s266,
                    bankNo
                )
                || Pattern.matches(s269, bankNo) || Pattern.matches(s272, bankNo) || Pattern.matches(
                    s274,
                    bankNo
                ) || Pattern.matches(s276, bankNo) || Pattern.matches(s278, bankNo) || Pattern.matches(
                    s281,
                    bankNo
                )
                || Pattern.matches(s283, bankNo) || Pattern.matches(s297, bankNo) || Pattern.matches(
                    s301,
                    bankNo
                ) || Pattern.matches(s303, bankNo) || Pattern.matches(s306, bankNo)
                || Pattern.matches(s313, bankNo)) {
                "信用卡(贷记卡)"
            } else if (Pattern.matches(s11, bankNo) || Pattern.matches(
                    s18,
                    bankNo
                ) || Pattern.matches(s22, bankNo) || Pattern.matches(s23, bankNo) || Pattern.matches(
                    s32,
                    bankNo
                ) || Pattern.matches(s33, bankNo)
                || Pattern.matches(s39, bankNo) || Pattern.matches(s76, bankNo) || Pattern.matches(
                    s196,
                    bankNo
                ) || Pattern.matches(s213, bankNo) || Pattern.matches(s215, bankNo)
                || Pattern.matches(s227, bankNo)) {
                "准贷记卡"
            } else if (Pattern.matches(s12, bankNo) || Pattern.matches(
                    s13,
                    bankNo
                ) || Pattern.matches(s24, bankNo) || Pattern.matches(s25, bankNo) || Pattern.matches(
                    s40,
                    bankNo
                )
                || Pattern.matches(s46, bankNo) || Pattern.matches(s64, bankNo) || Pattern.matches(
                    s69,
                    bankNo
                ) || Pattern.matches(s77, bankNo) || Pattern.matches(s143, bankNo)
                || Pattern.matches(s149, bankNo) || Pattern.matches(s200, bankNo) || Pattern.matches(
                    s307,
                    bankNo
                ) || Pattern.matches(s310, bankNo) || Pattern.matches(s311, bankNo)) {
                "预付费卡"
            } else {
                "未知"
            }
        }

        fun getBankName(bankNo: String): String {
            return if (Pattern.matches(s1, bankNo) || Pattern.matches(s2, bankNo) || Pattern.matches(
                    s3,
                    bankNo
                )) {
                "邮储银行"
            } else if (Pattern.matches(s4, bankNo) || Pattern.matches(s5, bankNo) || Pattern.matches(
                    s6,
                    bankNo
                ) || Pattern.matches(s7, bankNo) || Pattern.matches(s8, bankNo) || Pattern.matches(
                    s9,
                    bankNo
                ) || Pattern.matches(s10, bankNo) || Pattern.matches(s11, bankNo) || Pattern.matches(
                    s12,
                    bankNo
                ) || Pattern.matches(s13, bankNo)) {
                "工商银行"
            } else if (Pattern.matches(s14, bankNo) || Pattern.matches(
                    s15,
                    bankNo
                ) || Pattern.matches(s16, bankNo) || Pattern.matches(s17, bankNo) || Pattern.matches(
                    s18,
                    bankNo
                )) {
                "农业银行"
            } else if (Pattern.matches(s19, bankNo) || Pattern.matches(
                    s20,
                    bankNo
                ) || Pattern.matches(s21, bankNo) || Pattern.matches(s22, bankNo) || Pattern.matches(
                    s23,
                    bankNo
                ) || Pattern.matches(s24, bankNo) || Pattern.matches(s25, bankNo)) {
                "中国银行"
            } else if (Pattern.matches(s26, bankNo) || Pattern.matches(
                    s27,
                    bankNo
                ) || Pattern.matches(s28, bankNo) || Pattern.matches(s29, bankNo) || Pattern.matches(
                    s30,
                    bankNo
                ) || Pattern.matches(s31, bankNo) || Pattern.matches(s32, bankNo) || Pattern.matches(
                    s33,
                    bankNo
                )) {
                "建设银行"
            } else if (Pattern.matches(s34, bankNo) || Pattern.matches(
                    s35,
                    bankNo
                ) || Pattern.matches(s36, bankNo) || Pattern.matches(s37, bankNo) || Pattern.matches(
                    s38,
                    bankNo
                ) || Pattern.matches(s39, bankNo) || Pattern.matches(s40, bankNo)) {
                "交通银行"
            } else if (Pattern.matches(s41, bankNo) || Pattern.matches(
                    s42,
                    bankNo
                ) || Pattern.matches(s43, bankNo) || Pattern.matches(s44, bankNo) || Pattern.matches(
                    s45,
                    bankNo
                ) || Pattern.matches(s46, bankNo)) {
                "招商银行"
            } else if (Pattern.matches(s47, bankNo) || Pattern.matches(
                    s48,
                    bankNo
                ) || Pattern.matches(s49, bankNo)) {
                "民生银行"
            } else if (Pattern.matches(s50, bankNo) || Pattern.matches(
                    s51,
                    bankNo
                ) || Pattern.matches(s52, bankNo) || Pattern.matches(s53, bankNo) || Pattern.matches(
                    s54,
                    bankNo
                )) {
                "光大银行"
            } else if (Pattern.matches(s55, bankNo) || Pattern.matches(
                    s56,
                    bankNo
                ) || Pattern.matches(s57, bankNo) || Pattern.matches(s58, bankNo)) {
                "中信银行"
            } else if (Pattern.matches(s59, bankNo) || Pattern.matches(s60, bankNo)) {
                "华夏银行"
            } else if (Pattern.matches(s61, bankNo) || Pattern.matches(
                    s62,
                    bankNo
                ) || Pattern.matches(s63, bankNo) || Pattern.matches(s64, bankNo)) {
                "平安银行"
            } else if (Pattern.matches(s65, bankNo) || Pattern.matches(
                    s66,
                    bankNo
                ) || Pattern.matches(s67, bankNo) || Pattern.matches(s68, bankNo) || Pattern.matches(
                    s69,
                    bankNo
                )) {
                "兴业银行"
            } else if (Pattern.matches(s70, bankNo) || Pattern.matches(
                    s71,
                    bankNo
                ) || Pattern.matches(s72, bankNo)) {
                "上海银行"
            } else if (Pattern.matches(s73, bankNo) || Pattern.matches(
                    s74,
                    bankNo
                ) || Pattern.matches(s75, bankNo) || Pattern.matches(s76, bankNo) || Pattern.matches(
                    s77,
                    bankNo
                )) {
                "浦发银行"
            } else if (Pattern.matches(s79, bankNo) || Pattern.matches(
                    s80,
                    bankNo
                ) || Pattern.matches(s81, bankNo) || Pattern.matches(s82, bankNo)) {
                "广发银行"
            } else if (Pattern.matches(s83, bankNo)) {
                "渤海银行"
            } else if (Pattern.matches(s84, bankNo)) {
                "广州银行"
            } else if (Pattern.matches(s85, bankNo) || Pattern.matches(s86, bankNo)) {
                "金华银行"
            } else if (Pattern.matches(s87, bankNo) || Pattern.matches(s88, bankNo)) {
                "温州银行"
            } else if (Pattern.matches(s89, bankNo) || Pattern.matches(
                    s90,
                    bankNo
                ) || Pattern.matches(s91, bankNo)) {
                "徽商银行"
            } else if (Pattern.matches(s92, bankNo) || Pattern.matches(
                    s93,
                    bankNo
                ) || Pattern.matches(s94, bankNo)) {
                "江苏银行"
            } else if (Pattern.matches(s95, bankNo) || Pattern.matches(s96, bankNo)) {
                "南京银行"
            } else if (Pattern.matches(s97, bankNo) || Pattern.matches(
                    s98,
                    bankNo
                ) || Pattern.matches(s99, bankNo)) {
                "宁波银行"
            } else if (Pattern.matches(s100, bankNo) || Pattern.matches(s101, bankNo)) {
                "北京银行"
            } else if (Pattern.matches(s102, bankNo) || Pattern.matches(s103, bankNo)) {
                "北京农村商业银行"
            } else if (Pattern.matches(s104, bankNo) || Pattern.matches(s105, bankNo) || Pattern.matches(
                    s106,
                    bankNo
                ) || Pattern.matches(s107, bankNo)) {
                "汇丰银行"
            } else if (Pattern.matches(s108, bankNo) || Pattern.matches(s109, bankNo)) {
                "渣打银行"
            } else if (Pattern.matches(s110, bankNo) || Pattern.matches(s111, bankNo)) {
                "花旗银行"
            } else if (Pattern.matches(s112, bankNo) || Pattern.matches(s113, bankNo) || Pattern.matches(
                    s114,
                    bankNo
                )) {
                "东亚银行"
            } else if (Pattern.matches(s115, bankNo)) {
                "广东华兴银行"
            } else if (Pattern.matches(s116, bankNo)) {
                "深圳农村商业银行"
            } else if (Pattern.matches(s117, bankNo)) {
                "广州农村商业银行"
            } else if (Pattern.matches(s118, bankNo) || Pattern.matches(s119, bankNo)) {
                "东莞农村商业银行"
            } else if (Pattern.matches(s120, bankNo) || Pattern.matches(s121, bankNo) || Pattern.matches(
                    s122,
                    bankNo
                )) {
                "东莞市商业银行"
            } else if (Pattern.matches(s123, bankNo) || Pattern.matches(s124, bankNo)) {
                "广东省农村信用社联合社"
            } else if (Pattern.matches(s125, bankNo) || Pattern.matches(s126, bankNo) || Pattern.matches(
                    s127,
                    bankNo
                )) {
                "大新银行"
            } else if (Pattern.matches(s128, bankNo) || Pattern.matches(s129, bankNo)) {
                "永享银行"
            } else if (Pattern.matches(s130, bankNo) || Pattern.matches(s131, bankNo) || Pattern.matches(
                    s132,
                    bankNo
                )) {
                "星展银行香港有限公司"
            } else if (Pattern.matches(s133, bankNo) || Pattern.matches(s134, bankNo)) {
                "恒丰银行"
            } else if (Pattern.matches(s136, bankNo) || Pattern.matches(s135, bankNo) or Pattern.matches(
                    s137,
                    bankNo
                )) {
                "天津市商业银行"
            } else if (Pattern.matches(s138, bankNo) || Pattern.matches(s139, bankNo)) {
                "浙商银行"
            } else if (Pattern.matches(s140, bankNo) || Pattern.matches(s141, bankNo) || Pattern.matches(
                    s142,
                    bankNo
                ) || Pattern.matches(s143, bankNo)) {
                "南洋商业银行"
            } else if (Pattern.matches(s144, bankNo) || Pattern.matches(s145, bankNo) || Pattern.matches(
                    s146,
                    bankNo
                )) {
                "厦门银行"
            } else if (Pattern.matches(s147, bankNo) || Pattern.matches(s148, bankNo) || Pattern.matches(
                    s149,
                    bankNo
                )) {
                "福建海峡银行"
            } else if (Pattern.matches(s150, bankNo) || Pattern.matches(s151, bankNo) || Pattern.matches(
                    s152,
                    bankNo
                )) {
                "吉林银行"
            } else if (Pattern.matches(s153, bankNo) || Pattern.matches(s154, bankNo)) {
                "汉口银行"
            } else if (Pattern.matches(s155, bankNo) || Pattern.matches(s156, bankNo) || Pattern.matches(
                    s157,
                    bankNo
                ) || Pattern.matches(s158, bankNo)) {
                "盛京银行"
            } else if (Pattern.matches(s159, bankNo) || Pattern.matches(s160, bankNo) || Pattern.matches(
                    s161,
                    bankNo
                )) {
                "大连银行"
            } else if (Pattern.matches(s162, bankNo) || Pattern.matches(s163, bankNo)) {
                "河北银行"
            } else if (Pattern.matches(s164, bankNo) || Pattern.matches(s165, bankNo)) {
                "乌鲁木齐商业银行"
            } else if (Pattern.matches(s166, bankNo) || Pattern.matches(s167, bankNo) || Pattern.matches(
                    s168,
                    bankNo
                )) {
                "绍兴银行"
            } else if (Pattern.matches(s169, bankNo)) {
                "成都商业银行"
            } else if (Pattern.matches(s170, bankNo) || Pattern.matches(s171, bankNo) || Pattern.matches(
                    s172,
                    bankNo
                )) {
                "抚顺银行"
            } else if (Pattern.matches(s173, bankNo) || Pattern.matches(s174, bankNo) || Pattern.matches(
                    s175,
                    bankNo
                )) {
                "郑州银行"
            } else if (Pattern.matches(s176, bankNo) || Pattern.matches(s177, bankNo)) {
                "宁夏银行"
            } else if (Pattern.matches(s178, bankNo) || Pattern.matches(s179, bankNo)) {
                "重庆银行"
            } else if (Pattern.matches(s180, bankNo) || Pattern.matches(s181, bankNo) || Pattern.matches(
                    s182,
                    bankNo
                )) {
                "哈尔滨银行"
            } else if (Pattern.matches(s183, bankNo) || Pattern.matches(s184, bankNo)) {
                "兰州银行"
            } else if (Pattern.matches(s185, bankNo) || Pattern.matches(s186, bankNo)) {
                "青岛银行"
            } else if (Pattern.matches(s187, bankNo) || Pattern.matches(s188, bankNo)) {
                "秦皇岛市商业银行"
            } else if (Pattern.matches(s189, bankNo) || Pattern.matches(s190, bankNo) || Pattern.matches(
                    s191,
                    bankNo
                )) {
                "青海银行"
            } else if (Pattern.matches(s192, bankNo) || Pattern.matches(s193, bankNo) || Pattern.matches(
                    s194,
                    bankNo
                ) || Pattern.matches(s195, bankNo) || Pattern.matches(s196, bankNo)) {
                "台州银行"
            } else if (Pattern.matches(s197, bankNo) || Pattern.matches(s198, bankNo) || Pattern.matches(
                    s199,
                    bankNo
                ) || Pattern.matches(s200, bankNo)) {
                "长沙银行"
            } else if (Pattern.matches(s201, bankNo) || Pattern.matches(s202, bankNo) || Pattern.matches(
                    s203,
                    bankNo
                ) || Pattern.matches(s204, bankNo)) {
                "泉州银行"
            } else if (Pattern.matches(s205, bankNo) || Pattern.matches(s206, bankNo) || Pattern.matches(
                    s207,
                    bankNo
                )) {
                "包商银行"
            } else if (Pattern.matches(s208, bankNo) || Pattern.matches(s209, bankNo) || Pattern.matches(
                    s210,
                    bankNo
                ) || Pattern.matches(s211, bankNo)) {
                "龙江银行"
            } else if (Pattern.matches(s212, bankNo) || Pattern.matches(s213, bankNo) || Pattern.matches(
                    s214,
                    bankNo
                )) {
                "上海农商银行"
            } else if (Pattern.matches(s215, bankNo) || Pattern.matches(s216, bankNo)) {
                "浙江泰隆商业银行"
            } else if (Pattern.matches(s217, bankNo) || Pattern.matches(s218, bankNo)) {
                "内蒙古银行"
            } else if (Pattern.matches(s219, bankNo) || Pattern.matches(s220, bankNo)) {
                "广西北部湾银行"
            } else if (Pattern.matches(s221, bankNo) || Pattern.matches(s222, bankNo) || Pattern.matches(
                    s223,
                    bankNo
                )) {
                "桂林银行"
            } else if (Pattern.matches(s224, bankNo) || Pattern.matches(s225, bankNo) || Pattern.matches(
                    s226,
                    bankNo
                ) || Pattern.matches(s227, bankNo) || Pattern.matches(s228, bankNo)) {
                "龙江银行"
            } else if (Pattern.matches(s229, bankNo) || Pattern.matches(s230, bankNo)) {
                "成都农村商业银行"
            } else if (Pattern.matches(s231, bankNo) || Pattern.matches(s232, bankNo)) {
                "福建省农村信用社联合社"
            } else if (Pattern.matches(s233, bankNo) || Pattern.matches(s234, bankNo)) {
                "天津农村商业银行"
            } else if (Pattern.matches(s235, bankNo) || Pattern.matches(s236, bankNo)) {
                "江苏省农村信用社联合社"
            } else if (Pattern.matches(s237, bankNo)) {
                "湖南省农村信用社联合社"
            } else if (Pattern.matches(s238, bankNo) || Pattern.matches(s239, bankNo)) {
                "江西省农村信用社联合社"
            } else if (Pattern.matches(s240, bankNo) || Pattern.matches(s241, bankNo)) {
                "商丘市商业银行"
            } else if (Pattern.matches(s242, bankNo) || Pattern.matches(s243, bankNo)) {
                "华融湘江银行"
            } else if (Pattern.matches(s244, bankNo)) {
                "衡水市商业银行"
            } else if (Pattern.matches(s245, bankNo)) {
                "重庆南川石银村镇银行"
            } else if (Pattern.matches(s246, bankNo)) {
                "湖南省农村信用社联合社"
            } else if (Pattern.matches(s247, bankNo)) {
                "邢台银行"
            } else if (Pattern.matches(s248, bankNo)) {
                "临汾市尧都区农村信用合作联社"
            } else if (Pattern.matches(s249, bankNo) || Pattern.matches(s250, bankNo)) {
                "东营银行"
            } else if (Pattern.matches(s251, bankNo) || Pattern.matches(s252, bankNo)) {
                "上饶银行"
            } else if (Pattern.matches(s253, bankNo) || Pattern.matches(s254, bankNo)) {
                "德州银行"
            } else if (Pattern.matches(ss254, bankNo)) {
                "承德银行"
            } else if (Pattern.matches(s255, bankNo)) {
                "云南农村信用社"
            } else if (Pattern.matches(s257, bankNo) || Pattern.matches(s258, bankNo) || Pattern.matches(
                    s256,
                    bankNo
                )) {
                "柳州银行"
            } else if (Pattern.matches(s259, bankNo) || Pattern.matches(s260, bankNo)) {
                "威海市商业银行"
            } else if (Pattern.matches(s261, bankNo)) {
                "湖州银行"
            } else if (Pattern.matches(s262, bankNo) || Pattern.matches(s263, bankNo)) {
                "潍坊银行"
            } else if (Pattern.matches(s264, bankNo) || Pattern.matches(s265, bankNo)) {
                "赣州银行"
            } else if (Pattern.matches(s266, bankNo)) {
                "日照银行"
            } else if (Pattern.matches(s267, bankNo) || Pattern.matches(s268, bankNo) || Pattern.matches(
                    s269,
                    bankNo
                )) {
                "南昌银行"
            } else if (Pattern.matches(s270, bankNo) || Pattern.matches(s271, bankNo) || Pattern.matches(
                    s272,
                    bankNo
                )) {
                "贵阳银行"
            } else if (Pattern.matches(s273, bankNo) || Pattern.matches(s274, bankNo)) {
                "锦州银行"
            } else if (Pattern.matches(s275, bankNo) || Pattern.matches(s276, bankNo)) {
                "齐商银行"
            } else if (Pattern.matches(s277, bankNo) || Pattern.matches(s278, bankNo)) {
                "珠海华润银行"
            } else if (Pattern.matches(s279, bankNo)) {
                "葫芦岛市商业银行"
            } else if (Pattern.matches(s280, bankNo) || Pattern.matches(s281, bankNo)) {
                "宜昌市商业银行"
            } else if (Pattern.matches(s282, bankNo) || Pattern.matches(s283, bankNo)) {
                "杭州商业银行"
            } else if (Pattern.matches(s284, bankNo)) {
                "苏州市商业银行"
            } else if (Pattern.matches(s285, bankNo)) {
                "辽阳银行"
            } else if (Pattern.matches(s286, bankNo)) {
                "洛阳银行"
            } else if (Pattern.matches(s287, bankNo) || Pattern.matches(s288, bankNo)) {
                "焦作市商业银行"
            } else if (Pattern.matches(s289, bankNo)) {
                "镇江市商业银行"
            } else if (Pattern.matches(s290, bankNo)) {
                "法国兴业银行"
            } else if (Pattern.matches(s291, bankNo)) {
                "大华银行"
            } else if (Pattern.matches(s292, bankNo)) {
                "企业银行"
            } else if (Pattern.matches(s293, bankNo)) {
                "华侨银行"
            } else if (Pattern.matches(s294, bankNo) || Pattern.matches(s295, bankNo) || Pattern.matches(
                    s296,
                    bankNo
                ) || Pattern.matches(s297, bankNo)) {
                "恒生银行"
            } else if (Pattern.matches(s298, bankNo)) {
                "临沂商业银行"
            } else if (Pattern.matches(s299, bankNo)) {
                "烟台商业银行"
            } else if (Pattern.matches(s300, bankNo) || Pattern.matches(s301, bankNo)) {
                "齐鲁银行"
            } else if (Pattern.matches(s302, bankNo) || Pattern.matches(s303, bankNo)) {
                "BC卡公司"
            } else if (Pattern.matches(s304, bankNo) || Pattern.matches(s305, bankNo) || Pattern.matches(
                    s306,
                    bankNo
                ) || Pattern.matches(s307, bankNo)) {
                "集友银行"
            } else if (Pattern.matches(s308, bankNo) || Pattern.matches(s309, bankNo) || Pattern.matches(
                    s310,
                    bankNo
                ) || Pattern.matches(s311, bankNo)) {
                "大丰银行"
            } else if (Pattern.matches(s312, bankNo) || Pattern.matches(s313, bankNo)) {
                "AEON信贷财务亚洲有限公司"
            } else if (Pattern.matches(s314, bankNo)) {
                "澳门BDA"
            } else {
                "未知"
            }
        }

        private const val s1 =
            "^(621096|621098|622150|622151|622181|622188|622199|955100|621095|620062|621285|621798|621799|621797|620529|621622|621599|621674|623218|623219)\\d{13}$"
        private const val s2 = "^(62215049|62215050|62215051|62218850|62218851|62218849)\\d{11}$"
        private const val s3 = "^(622812|622810|622811|628310|625919)\\d{10}$"

        private const val s4 =
            "^(620200|620302|620402|620403|620404|620406|620407|620409|620410|620411|620412|620502|620503|620405|620408|620512|620602|620604|620607|620611|620612|620704|620706|620707|620708|620709|620710|620609|620712|620713|620714|620802|620711|620904|620905|621001|620902|621103|621105|621106|621107|621102|621203|621204|621205|621206|621207|621208|621209|621210|621302|621303|621202|621305|621306|621307|621309|621311|621313|621211|621315|621304|621402|621404|621405|621406|621407|621408|621409|621410|621502|621317|621511|621602|621603|621604|621605|621608|621609|621610|621611|621612|621613|621614|621615|621616|621617|621607|621606|621804|621807|621813|621814|621817|621901|621904|621905|621906|621907|621908|621909|621910|621911|621912|621913|621915|622002|621903|622004|622005|622006|622007|622008|622010|622011|622012|621914|622015|622016|622003|622018|622019|622020|622102|622103|622104|622105|622013|622111|622114|622017|622110|622303|622304|622305|622306|622307|622308|622309|622314|622315|622317|622302|622402|622403|622404|622313|622504|622505|622509|622513|622517|622502|622604|622605|622606|622510|622703|622715|622806|622902|622903|622706|623002|623006|623008|623011|623012|622904|623015|623100|623202|623301|623400|623500|623602|623803|623901|623014|624100|624200|624301|624402|623700|624000)\\d{12}$"
        private const val s5 =
            "^(622200|622202|622203|622208|621225|620058|621281|900000|621558|621559|621722|621723|620086|621226|621618|620516|621227|621288|621721|900010|623062|621670|621720|621379|621240|621724|621762|621414|621375|622926|622927|622928|622929|622930|622931|621733|621732|621372|621369|621763)\\d{13}$"
        private const val s6 =
            "^(402791|427028|427038|548259|621376|621423|621428|621434|621761|621749|621300|621378|622944|622949|621371|621730|621734|621433|621370|621764|621464|621765|621750|621377|621367|621374|621731|621781)\\d{10}$"
        private const val s7 = "^(9558)\\d{15}$"
        private const val s8 = "^(370246|370248|370249|370247|370267|374738|374739)\\d{9}$"
        private const val s9 =
            "^(427010|427018|427019|427020|427029|427030|427039|438125|438126|451804|451810|451811|458071|489734|489735|489736|510529|427062|524091|427064|530970|530990|558360|524047|525498|622230|622231|622232|622233|622234|622235|622237|622239|622240|622245|622238|451804|451810|451811|458071|628288|628286|622206|526836|513685|543098|458441|622246|544210|548943|356879|356880|356881|356882|528856|625330|625331|625332|622236|524374|550213|625929|625927|625939|625987|625930|625114|622159|625021|625022|625932|622889|625900|625915|625916|622171|625931|625113|625928|625914|625986|625925|625921|625926|625942|622158|625917|625922|625934|625933|625920|625924|625017|625018|625019)\\d{10}$"
        private const val s10 = "^(45806|53098|45806|53098)\\d{11}$"
        private const val s11 =
            "^(622210|622211|622212|622213|622214|622220|622223|622225|622229|622215|622224)\\d{10}$"
        private const val s12 =
            "^(620054|620142|620184|620030|620050|620143|620149|620124|620183|620094|620186|620148|620185)\\d{10}$"
        private const val s13 = "^(620114|620187|620046)\\d{13}$"

        private const val s14 =
            "^(622841|622824|622826|622848|620059|621282|622828|622823|621336|621619|622821|622822|622825|622827|622845|622849|623018|623206|621671|622840|622843|622844|622846|622847|620501)\\d{13}$"
        private const val s15 = "^(95595|95596|95597|95598|95599)\\d{14}$"
        private const val s16 = "^(103)\\d{16}$"
        private const val s17 =
            "^(403361|404117|404118|404119|404120|404121|463758|519412|519413|520082|520083|552599|558730|514027|622836|622837|628268|625996|625998|625997|622838|625336|625826|625827|544243|548478|628269)\\d{10}$"
        private const val s18 = "^(622820|622830)\\d{10}$"

        private const val s19 =
            "^(621660|621661|621662|621663|621665|621667|621668|621669|621666|456351|601382|621256|621212|621283|620061|621725|621330|621331|621332|621333|621297|621568|621569|621672|623208|621620|621756|621757|621758|621759|621785|621786|621787|621788|621789|621790|622273|622274|622771|622772|622770|621741|621041)\\d{13}$"
        private const val s20 =
            "^(621293|621294|621342|621343|621364|621394|621648|621248|621215|621249|621231|621638|621334|621395|623040|622348)\\d{10}$"
        private const val s21 =
            "^(625908|625910|625909|356833|356835|409665|409666|409668|409669|409670|409671|409672|512315|512316|512411|512412|514957|409667|438088|552742|553131|514958|622760|628388|518377|622788|628313|628312|622750|622751|625145|622479|622480|622789|625140|622346|622347)\\d{10}$"
        private const val s22 =
            "^(518378|518379|518474|518475|518476|524865|525745|525746|547766|558868|622752|622753|622755|524864|622757|622758|622759|622761|622762|622763|622756|622754|622764|622765|558869|625905|625906|625907|625333)\\d{10}$"
        private const val s23 = "^(53591|49102|377677)\\d{11}$"
        private const val s24 =
            "^(620514|620025|620026|620210|620211|620019|620035|620202|620203|620048|620515|920000)\\d{10}$"
        private const val s25 = "^(620040|620531|620513|921000|620038)\\d{13}$"

        private const val s26 =
            "^(621284|436742|589970|620060|621081|621467|621598|621621|621700|622280|622700|623211|623668)\\d{13}$"
        private const val s27 =
            "^(421349|434061|434062|524094|526410|552245|621080|621082|621466|621488|621499|622966|622988|622382|621487|621083|621084|620107)\\d{10}$"
        private const val s28 = "^(436742193|622280193)\\d{10}$"
        private const val s29 = "^(553242)\\d{12}$"
        private const val s30 =
            "^(625362|625363|628316|628317|356896|356899|356895|436718|436738|436745|436748|489592|531693|532450|532458|544887|552801|557080|558895|559051|622166|622168|622708|625964|625965|625966|628266|628366|622381|622675|622676|622677)\\d{10}$"
        private const val s31 = "^(5453242|5491031|5544033)\\d{11}$"
        private const val s32 = "^(622725|622728|436728|453242|491031|544033|622707|625955|625956)\\d{10}$"
        private const val s33 = "^(53242|53243)\\d{11}$"

        private const val s34 = "^(622261|622260|622262|621002|621069|621436|621335)\\d{13}$"
        private const val s35 = "^(620013)\\d{10}$"
        private const val s36 = "^(405512|601428|405512|601428|622258|622259|405512|601428)\\d{11}$"
        private const val s37 = "^(49104|53783)\\d{11}$"
        private const val s38 =
            "^(434910|458123|458124|520169|522964|552853|622250|622251|521899|622253|622656|628216|622252|955590|955591|955592|955593|628218|625028|625029)\\d{10}$"
        private const val s39 = "^(622254|622255|622256|622257|622284)\\d{10}$"
        private const val s40 = "^(620021|620521)\\d{13}$"

        private const val s41 =
            "^(402658|410062|468203|512425|524011|622580|622588|622598|622609|95555|621286|621483|621485|621486|621299)(\\d{10}|\\d{11})$"
        private const val s42 = "^(690755)\\d{9}$"
        private const val s43 = "^(690755)\\d{12}$"
        private const val s44 =
            "^(356885|356886|356887|356888|356890|439188|439227|479228|479229|521302|356889|545620|545621|545947|545948|552534|552587|622575|622576|622577|622578|622579|545619|622581|622582|545623|628290|439225|518710|518718|628362|439226|628262|625802|625803)\\d{10}$"
        private const val s45 = "^(370285|370286|370287|370289)\\d{9}$"
        private const val s46 = "^(620520)\\d{13}$"

        //民生银行
        private const val s47 =
            "^(622615|622616|622618|622622|622617|622619|415599|421393|421865|427570|427571|472067|472068|622620)\\d{10}$"
        private const val s48 =
            "^(545392|545393|545431|545447|356859|356857|407405|421869|421870|421871|512466|356856|528948|552288|622600|622601|622602|517636|622621|628258|556610|622603|464580|464581|523952|545217|553161|356858|622623|625912|625913|625911)\\d{10}$"
        private const val s49 = "^(377155|377152|377153|377158)\\d{9}$"

        private const val s50 = "^(303)\\d{13}$"
        private const val s51 = "^(90030)\\d{11}$"
        private const val s52 = "^(620535)\\d{13}$"
        private const val s53 =
            "^(620085|622660|622662|622663|622664|622665|622666|622667|622669|622670|622671|622672|622668|622661|622674|622673|620518|621489|621492)\\d{10}$"
        private const val s54 =
            "^(356837|356838|486497|622657|622685|622659|622687|625978|625980|625981|625979|356839|356840|406252|406254|425862|481699|524090|543159|622161|622570|622650|622655|622658|625975|625977|628201|628202|625339|625976)\\d{10}$"

        private const val s55 =
            "^(433670|433680|442729|442730|620082|622690|622691|622692|622696|622698|622998|622999|433671|968807|968808|968809|621771|621767|621768|621770|621772|621773|622453|622456)\\d{10}$"
        private const val s56 = "^(622459)\\d{11}$"
        private const val s57 = "^(376968|376969|376966)\\d{9}$"
        private const val s58 =
            "^(400360|403391|403392|404158|404159|404171|404172|404173|404174|404157|433667|433668|433669|514906|403393|520108|433666|558916|622678|622679|622680|622688|622689|628206|556617|628209|518212|628208|356390|356391|356392|622916|622918|622919)\\d{10}$"

        private const val s59 = "^(622630|622631|622632|622633|999999|621222|623020|623021|623022|623023)\\d{10}$"
        private const val s60 =
            "^(523959|528709|539867|539868|622637|622638|628318|528708|622636|625967|625968|625969)\\d{10}$"

        private const val s61 = "^(621626|623058)\\d{13}$"
        private const val s62 =
            "^(602907|622986|622989|622298|627069|627068|627066|627067|412963|415752|415753|622535|622536|622538|622539|998800|412962|622983)\\d{10}$"
        private const val s63 =
            "^(531659|622157|528020|622155|622156|526855|356869|356868|625360|625361|628296|435744|435745|483536|622525|622526|998801|998802)\\d{10}$"
        private const val s64 = "^(620010)\\d{10}$"

        //兴业银行
        private const val s65 = "^(438589)\\d{12}$"
        private const val s66 = "^(90592)\\d{11}$"
        private const val s67 = "^(966666|622909|438588|622908)\\d{12}$"
        private const val s68 =
            "^(461982|486493|486494|486861|523036|451289|527414|528057|622901|622902|622922|628212|451290|524070|625084|625085|625086|625087|548738|549633|552398|625082|625083|625960|625961|625962|625963)\\d{10}$"
        private const val s69 = "^(620010)\\d{10}$"

        private const val s70 =
            "^(621050|622172|622985|622987|620522|622267|622278|622279|622468|622892|940021)\\d{12}$"
        private const val s71 = "^(438600)\\d{10}$"
        private const val s72 =
            "^(356827|356828|356830|402673|402674|486466|519498|520131|524031|548838|622148|622149|622268|356829|622300|628230|622269|625099|625953)\\d{10}$"

        private const val s73 =
            "^(622516|622517|622518|622521|622522|622523|984301|984303|621352|621793|621795|621796|621351|621390|621792|621791)\\d{10}$"
        private const val s74 =
            "^(84301|84336|84373|84385|84390|87000|87010|87030|87040|84380|84361|87050|84342)\\d{11}$"
        private const val s75 =
            "^(356851|356852|404738|404739|456418|498451|515672|356850|517650|525998|622177|622277|628222|622500|628221|622176|622276|622228|625957|625958|625993|625831)\\d{10}$"
        private const val s76 = "^(622520|622519)\\d{10}$"
        private const val s77 = "^(620530)\\d{13}$"

        //    String s78 = "^(622516|622517|622518|622521|622522|622523|984301|984303|621352|621793|621795|621796|621351|621390|621792|621791)\\d{10}$";
        private const val s79 = "^(622568|6858001|6858009|621462)\\d{13}$"
        private const val s80 = "^(9111)\\d{15}$"
        private const val s81 =
            "^(406365|406366|428911|436768|436769|436770|487013|491032|491033|491034|491035|491036|491037|491038|436771|518364|520152|520382|541709|541710|548844|552794|493427|622555|622556|622557|622558|622559|622560|528931|558894|625072|625071|628260|628259|625805|625806|625807|625808|625809|625810)\\d{10}$"
        private const val s82 = "^(685800|6858000)\\d{13}$"

        private const val s83 = "^(621268|622684|622884|621453)\\d{10}$"
        private const val s84 = "^(603445|622467|940016|621463)\\d{13}$"

        private const val s85 = "^(622449|940051)\\d{10}$"
        private const val s86 = "^(622450|628204)\\d{10}$"

        //温州银行
        private const val s87 = "^(621977)\\d{10}$"
        private const val s88 = "^(622868|622899|628255)\\d{10}$"

        private const val s89 = "^(622877|622879|621775|623203)\\d{13}$"
        private const val s90 = "^(603601|622137|622327|622340|622366)\\d{11}$"
        private const val s91 = "^(628251|622651|625828)\\d{10}$"

        private const val s92 = "^(621076|622173|622131|621579|622876)\\d{13}$"
        private const val s93 = "^(504923|622422|622447|940076)\\d{10}$"
        private const val s94 = "^(628210|622283|625902)\\d{10}$"

        //南京银行
        private const val s95 = "^(621777|622305|621259)\\d{10}$"
        private const val s96 = "^(622303|628242|622595|622596)\\d{10}$"

        private const val s97 = "^(621279|622281|622316|940022)\\d{10}$"
        private const val s98 = "^(621418)\\d{13}$"
        private const val s99 = "^(625903|622778|628207|512431|520194|622282|622318)\\d{10}$"
        private const val s100 = "^(625903|622778|628207|512431|520194|622282|622318)\\d{10}$"

        //北京银行
        private const val s101 = "^(522001|622163|622853|628203|622851|622852)\\d{10}$"

        private const val s102 = "^(620088|621068|622138|621066|621560)\\d{13}$"
        private const val s103 = "^(625526|625186|628336)\\d{10}$"

        private const val s104 = "^(622946)\\d{10}$"
        private const val s105 = "^(622406|621442)\\d{11}$"
        private const val s106 = "^(622407|621443)\\d{13}$"
        private const val s107 = "^(622360|622361|625034|625096|625098)\\d{10}$"

        //渣打银行
        private const val s108 = "^(622948|621740|622942|622994)\\d{10}$"
        private const val s109 = "^(622482|622483|622484)\\d{10}$"

        private const val s110 = "^(621062|621063)\\d{10}$"
        private const val s111 = "^(625076|625077|625074|625075|622371|625091)\\d{10}$"

        //东亚银行
        private const val s112 = "^(622933|622938|623031|622943|621411)\\d{13}$"
        private const val s113 = "^(622372|622471|622472|622265|622266|625972|625973)\\d{10}$"
        private const val s114 = "^(622365)\\d{11}$"

        private const val s115 = "^(621469|621625)\\d{13}$"
        private const val s116 = "^(622128|622129|623035)\\d{10}$"
        private const val s117 = "^(909810|940035|621522|622439)\\d{12}$"

        private const val s118 = "^(622328|940062|623038)\\d{13}$"
        private const val s119 = "^(625288|625888)\\d{10}$"

        private const val s120 = "^(622333|940050)\\d{10}$"
        private const val s121 = "^(621439|623010)\\d{13}$"
        private const val s122 = "^(622888)\\d{10}$"

        private const val s123 = "^(622302)\\d{10}$"
        private const val s124 = "^(622477|622509|622510|622362|621018|621518)\\d{13}$"

        private const val s125 = "^(622297|621277)\\d{10}$"
        private const val s126 = "^(622375|622489)\\d{11}$"
        private const val s127 = "^(622293|622295|622296|622373|622451|622294|625940)\\d{10}$"

        private const val s128 = "^(622871|622958|622963|622957|622861|622932|622862|621298)\\d{10}$"
        private const val s129 = "^(622798|625010|622775|622785)\\d{10}$"

        private const val s130 = "^(621016|621015)\\d{13}$"
        private const val s131 = "^(622487|622490|622491|622492)\\d{10}$"
        private const val s132 = "^(622487|622490|622491|622492|621744|621745|621746|621747)\\d{11}$"

        private const val s133 = "^(623078)\\d{13}$"
        private const val s134 = "^(622384|940034)\\d{11}$"

        private const val s135 = "^(940015|622331)\\d{12}$"
        private const val s136 = "^(6091201)\\d{11}$"
        private const val s137 = "^(622426|628205)\\d{10}$"

        private const val s138 = "^(621019|622309|621019)\\d{13}$"
        private const val s139 =
            "^(6223091100|6223092900|6223093310|6223093320|6223093330|6223093370|6223093380|6223096510|6223097910)\\d{9}$"

        private const val s140 = "^(621213|621289|621290|621291|621292|621042|621743)\\d{13}$"
        private const val s141 = "^(623041|622351)\\d{10}$"
        private const val s142 = "^(625046|625044|625058|622349|622350)\\d{10}$"
        private const val s143 = "^(620208|620209|625093|625095)\\d{10}$"

        //厦门银行
        private const val s144 = "^(622393|940023)\\d{10}$"
        private const val s145 = "^(6886592)\\d{11}$"
        private const val s146 = "^(623019|621600|)\\d{13}$"

        private const val s147 = "^(622388)\\d{10}$"
        private const val s148 = "^(621267|623063)\\d{12}$"
        private const val s149 = "^(620043|)\\d{12}$"

        private const val s150 = "^(622865|623131)\\d{13}$"
        private const val s151 = "^(940012)\\d{10}$"
        private const val s152 = "^(622178|622179|628358)\\d{10}$"

        //汉口银行
        private const val s153 = "^(990027)\\d{12}$"
        private const val s154 = "^(622325|623105|623029)\\d{10}$"

        private const val s155 = "^(566666)\\d{12}$"
        private const val s156 = "^(622455|940039)\\d{13}$"
        private const val s157 = "^(623108|623081)\\d{10}$"
        private const val s158 = "^(622466|628285)\\d{10}$"

        private const val s159 = "^(603708)\\d{11}$"
        private const val s160 = "^(622993|623069|623070|623172|623173)\\d{13}$"
        private const val s161 = "^(622383|622385|628299)\\d{10}$"

        private const val s162 = "^(622498|622499|623000|940046)\\d{13}$"
        private const val s163 = "^(622921|628321)\\d{10}$"

        //乌鲁木齐商业银行
        private const val s164 = "^(621751|622143|940001|621754)\\d{13}$"
        private const val s165 = "^(622476|628278)\\d{10}$"

        private const val s166 = "^(622486)\\d{10}$"
        private const val s167 = "^(603602|623026|623086)\\d{12}$"
        private const val s168 = "^(628291)\\d{10}$"

        private const val s169 = "^(622152|622154|622996|622997|940027|622153|622135|621482|621532)\\d{13}$"
        private const val s170 = "^(622442)\\d{11}$"
        private const val s171 = "^(940053)\\d{12}$"
        private const val s172 = "^(622442|623099)\\d{13}$"

        private const val s173 = "^(622421)\\d{13}$"
        private const val s174 = "^(940056)\\d{11}$"
        private const val s175 = "^(96828)\\d{11}$"

        //宁夏银行
        private const val s176 = "^(621529|622429|621417|623089|623200)\\d{13}$"
        private const val s177 = "^(628214|625529|622428)\\d{10}$"

        private const val s178 = "^(9896)\\d{12}$"
        private const val s179 = "^(622134|940018|623016)\\d{10}$"

        private const val s180 = "^(621577|622425)\\d{13}$"
        private const val s181 = "^(940049)\\d{12}$"
        private const val s182 = "^(622425)\\d{11}$"

        private const val s183 = "^(622139|940040|628263)\\d{10}$"
        private const val s184 = "^(621242|621538|621496)\\d{13}$"

        private const val s185 = "^(621252|622146|940061|628239)\\d{10}$"
        private const val s186 = "^(621419|623170)\\d{13}$"

        private const val s187 = "^(62249802|94004602)\\d{11}$"
        private const val s188 = "^(621237|623003)\\d{13}$"

        //青海银行
        private const val s189 = "^(622310|940068)\\d{11}$"
        private const val s190 = "^(622817|628287|625959)\\d{10}$"
        private const val s191 = "^(62536601)\\d{8}$"

        private const val s192 = "^(622427)\\d{10}$"
        private const val s193 = "^(940069)\\d{11}$"
        private const val s194 = "^(623039)\\d{13}$"
        private const val s195 = "^(622321|628273)\\d{10}$"
        private const val s196 = "^(625001)\\d{10}$"

        private const val s197 = "^(694301)\\d{12}$"
        private const val s198 = "^(940071|622368|621446)\\d{13}$"
        private const val s199 = "^(625901|622898|622900|628281|628282|622806|628283)\\d{10}$"
        private const val s200 = "^(620519)\\d{13}$"

        private const val s201 = "^(683970|940074)\\d{12}$"
        private const val s202 = "^(622370)\\d{13}$"
        private const val s203 = "^(621437)\\d{13}$"
        private const val s204 = "^(628319)\\d{10}$"

        private const val s205 = "^(622336|621760)\\d{11}$"
        private const val s206 = "^(622165)\\d{10}$"
        private const val s207 = "^(622315|625950|628295)\\d{10}$"

        private const val s208 = "^(621037|621097|621588|622977)\\d{13}$"
        private const val s209 = "^(62321601)\\d{11}$"
        private const val s210 = "^(622860)\\d{10}$"
        private const val s211 = "^(622644|628333)\\d{10}$"

        private const val s212 = "^(622478|940013|621495)\\d{10}$"
        private const val s213 = "^(625500)\\d{10}$"
        private const val s214 = "^(622611|622722|628211|625989)\\d{10}$"

        private const val s215 = "^(622717)\\d{10}$"
        private const val s216 = "^(628275|622565|622287)\\d{10}$"

        //内蒙古银行
        private const val s217 = "^(622147|621633)\\d{13}$"
        private const val s218 = "^(628252)\\d{10}$"

        private const val s219 = "^(623001)\\d{10}$"
        private const val s220 = "^(628227)\\d{10}$"

        private const val s221 = "^(621456)\\d{11}$"
        private const val s222 = "^(621562)\\d{13}$"
        private const val s223 = "^(628219)\\d{10}$"

        private const val s224 = "^(621037|621097|621588|622977)\\d{13}$"
        private const val s225 = "^(62321601)\\d{11}$"
        private const val s226 = "^(622475|622860)\\d{10}$"
        private const val s227 = "^(625588)\\d{10}$"
        private const val s228 = "^(622270|628368|625090|622644|628333)\\d{10}$"

        private const val s229 = "^(623088)\\d{13}$"
        private const val s230 = "^(622829|628301|622808|628308)\\d{10}$"

        private const val s231 = "^(622127|622184|621701|621251|621589|623036)\\d{13}$"
        private const val s232 = "^(628232|622802|622290)\\d{10}$"

        private const val s233 = "^(622531|622329)\\d{13}$"
        private const val s234 = "^(622829|628301)\\d{10}$"

        private const val s235 = "^(621578|623066|622452|622324)\\d{13}$"
        private const val s236 = "^(622815|622816|628226)\\d{10}$"
        private const val s237 = "^(622906|628386|625519|625506)\\d{10}$"

        private const val s238 = "^(621592)\\d{10}$"
        private const val s239 = "^(628392)\\d{10}$"

        //商丘市商业银行
        private const val s240 = "^(621748)\\d{13}$"
        private const val s241 = "^(628271)\\d{10}$"

        private const val s242 = "^(621366|621388)\\d{13}$"
        private const val s243 = "^(628328)\\d{10}$"

        private const val s244 = "^(621239|623068)\\d{13}$"
        private const val s245 = "^(621653004)\\d{10}$"
        private const val s246 = "^(622169|621519|621539|623090)\\d{13}$"
        private const val s247 = "^(621238|620528)\\d{13}$"
        private const val s248 = "^(628382|625158)\\d{10}$"

        private const val s249 = "^(621004)\\d{12}$"
        private const val s250 = "^(628217)\\d{10}$"

        private const val s251 = "^(621416)\\d{10}$"
        private const val s252 = "^(628217)\\d{10}$"

        //德州银行
        private const val s253 = "^(622937)\\d{13}$"
        private const val s254 = "^(628397)\\d{10}$"

        //德州银行
        private const val ss254 = "^(628397)\\d{10}$"

        //云南农村信用社
        private const val s255 = "^(622469|628307)\\d{10}$"

        //柳州银行
        private const val s256 = "^(622292|622291|621412)\\d{12}$"
        private const val s257 = "^(622880|622881)\\d{10}$"
        private const val s258 = "^(62829)\\d{10}$"

        private const val s259 = "^(623102)\\d{10}$"
        private const val s260 = "^(628234)\\d{10}$"

        private const val s261 = "^(628306)\\d{10}$"

        private const val s262 = "^(622391|940072)\\d{10}$"
        private const val s263 = "^(628391)\\d{10}$"

        private const val s264 = "^(622967|940073)\\d{13}$"
        private const val s265 = "^(628233)\\d{10}$"
        private const val s266 = "^(628257)\\d{10}$"

        private const val s267 = "^(621269|622275)\\d{10}$"
        private const val s268 = "^(940006)\\d{11}$"
        private const val s269 = "^(628305)\\d{11}$"

        //贵阳银行
        private const val s270 = "^(622133|621735)\\d{13}$"
        private const val s271 = "^(888)\\d{13}$"
        private const val s272 = "^(628213)\\d{10}$"

        private const val s273 = "^(622990|940003)\\d{11}$"
        private const val s274 = "^(628261)\\d{10}$"

        private const val s275 = "^(622311|940057)\\d{11}$"
        private const val s276 = "^(628311)\\d{10}$"

        private const val s277 = "^(622363|940048)\\d{13}$"
        private const val s278 = "^(628270)\\d{10}$"

        //    葫芦岛市商业银行
        private const val s279 = "^(622398|940054)\\d{10}$"

        private const val s280 = "^(940055)\\d{11}$"
        private const val s281 = "^(622397)\\d{11}$"

        private const val s282 = "^(603367|622878)\\d{12}$"
        private const val s283 = "^(622397)\\d{11}$"

        private const val s284 = "^(603506)\\d{13}$"

        private const val s285 = "^(622399|940043)\\d{11}$"

        private const val s286 = "^(622420|940041)\\d{11}$"

        private const val s287 = "^(622338)\\d{13}$"
        private const val s288 = "^(940032)\\d{10}$"

        private const val s289 = "^(622394|940025)\\d{10}$"

        private const val s290 = "^(621245)\\d{10}$"

        private const val s291 = "^(621328)\\d{13}$"

        private const val s292 = "^(621651)\\d{13}$"

        private const val s293 = "^(621077)\\d{10}$"

        private const val s294 = "^(622409|621441)\\d{13}$"
        private const val s295 = "^(622410|621440)\\d{11}$"
        private const val s296 = "^(622950|622951)\\d{10}$"
        private const val s297 = "^(625026|625024|622376|622378|622377|625092)\\d{10}$"

        private const val s298 = "^(622359|940066)\\d{13}$"

        private const val s299 = "^(622886)\\d{10}$"

        private const val s300 = "^(940008|622379)\\d{13}"
        private const val s301 = "^(628379)\\d{10}$"

        private const val s302 =
            "^(620011|620027|620031|620039|620103|620106|620120|620123|620125|620220|620278|620812|621006|621011|621012|621020|621023|621025|621027|621031|620132|621039|621078|621220|621003)\\d{10}$"
        private const val s303 =
            "^(625003|625011|625012|625020|625023|625025|625027|625031|621032|625039|625078|625079|625103|625106|625006|625112|625120|625123|625125|625127|625131|625032|625139|625178|625179|625220|625320|625111|625132|625244)\\d{10}$"

        private const val s304 = "^(622355|623042)\\d{10}$"
        private const val s305 = "^(621043|621742)\\d{13}$"
        private const val s306 = "^(622352|622353|625048|625053|625060)\\d{10}$"
        private const val s307 = "^(620206|620207)\\d{10}$"

        private const val s308 = "^(622547|622548|622546)\\d{13}$"
        private const val s309 = "^(625198|625196|625147)\\d{10}$"
        private const val s310 = "^(620072)\\d{13}$"
        private const val s311 = "^(620204|620205)\\d{10}$"

        private const val s312 = "^(621064|622941|622974)\\d{10}$"
        private const val s313 = "^(622493)\\d{10}$"

        private const val s314 = "^(621274|621324)\\d{13}$"

    }
}