package com.miqdad71.week5.calculator

import android.widget.TextView

class Calculator(private val textResult: TextView) : Operation() {
    private var result = StringBuilder()
    private var operation: Char = ' '

    fun selectOperasional(op: Char) {
        operation = op
        firstNum = textResult.text.toString().toDouble()
        result.clear()
    }

    fun appendNumScreen(num: String){
        result.append(num)
        textResult.text = result.toString()
    }

    fun mathOperation() {
        secondNum = textResult.text.toString().toDouble()
        result.clear()

        when (operation) {
            '+' -> {
                textResult.text = plus.toString()
                result.append(plus)
            }
            '-' -> {
                textResult.text = minus.toString()
                result.append(minus)
            }
            'X' -> {
                textResult.text = times.toString()
                result.append(times)
            }
            '/' -> {
                textResult.text = dive.toString()
                result.append(dive)
            }
        }
    }

    fun clearNum() {
        val length = result.length

        if (length <= 1) {
            clearNum("0")
        } else {
            result.deleteCharAt(length - 1)
            textResult.text = result.toString()
        }
    }

    fun clearNum(defaultValue: String?) {
        result.clear()
        textResult.text = defaultValue
    }
}