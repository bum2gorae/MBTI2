package com.example.mbti2

enum class MbtiEnum(var mbtiName: Int, var mbtiDcrb: Int) {
    ESFJ(R.string.ESFJ, R.string.describe_ESFJ),
    ENFJ(R.string.ENFJ, R.string.describe_ENFJ),
    ESTJ(R.string.ESTJ, R.string.describe_ESTJ),
    ENTJ(R.string.ENTJ, R.string.describe_ENTJ),
    ESFP(R.string.ESFP, R.string.describe_ESFP),
    ENFP(R.string.ENFP, R.string.describe_ENFP),
    ESTP(R.string.ESTP, R.string.describe_ESTP),
    ENTP(R.string.ENTP, R.string.describe_ENTP),
    ISFJ(R.string.ISFJ, R.string.describe_ISFJ),
    INFJ(R.string.INFJ, R.string.describe_INFJ),
    ISTJ(R.string.ISTJ, R.string.describe_ISTJ),
    INTJ(R.string.INTJ, R.string.describe_INTJ),
    ISFP(R.string.ISFP, R.string.describe_ISFP),
    INFP(R.string.INFP, R.string.describe_INFP),
    ISTP(R.string.ISTP, R.string.describe_ISTP),
    INTP(R.string.INTP, R.string.describe_INTP);


    fun getMbtiTitle(): Int {
        this.mbtiName = mbtiName
        return mbtiName
    }

    fun getMbtiDescribe(): Int {
        this.mbtiDcrb = mbtiDcrb
        return mbtiDcrb
    }
}

open class Mbti()

class MbtiValue1(val ie:String, val sn:String, val tf:String, val jp:String):Mbti() {
    val mbtiVal: String = ie+sn+tf+jp
    val mbtiEnumStr: MbtiEnum = MbtiEnum.valueOf(mbtiVal.uppercase())
}

class MbtiValue2(val mbtiVal:String): Mbti() {
    val mbtiEnumStr = MbtiEnum.valueOf(mbtiVal.uppercase())
}

