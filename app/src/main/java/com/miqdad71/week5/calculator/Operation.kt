package com.miqdad71.week5.calculator

open class Operation {
    protected var firstNum: Double = 0.0
    protected var secondNum: Double = 0.0

    val plus: Double
        get() = firstNum + secondNum

    val minus: Double
        get() = firstNum - secondNum

    val dive: Double
        get() = firstNum / secondNum

    val times: Double
        get() = firstNum * secondNum

    val percent: Double
        get() = firstNum / 100
}