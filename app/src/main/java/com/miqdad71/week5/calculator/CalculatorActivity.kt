package com.miqdad71.week5.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.miqdad71.week5.R
import kotlinx.android.synthetic.main.activity_calculator.*

class  CalculatorActivity : AppCompatActivity() {
    private lateinit var calculator: Calculator
    private var viewNumber = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        supportActionBar?.title = getString(R.string.calculator)

        calculator = Calculator(text_result)

        btn_zero.setOnClickListener {
            viewNumber = viewNumber.append("0")
            text_result.text = viewNumber.toString()
        }

        btn_minus.setOnClickListener {

        }
    }

    fun onClickNumber(v: View?){
        when(v?.id){
            R.id.btn_zero -> {
                calculator.appendNumScreen("0")
            }
            R.id.btn_one -> {
                calculator.appendNumScreen("1")
            }
            R.id.btn_two -> {
                calculator.appendNumScreen("2")
            }
            R.id.btn_three -> {
                calculator.appendNumScreen("3")
            }
            R.id.btn_four -> {
                calculator.appendNumScreen("4")
            }
            R.id.btn_five -> {
                calculator.appendNumScreen("5")
            }
            R.id.btn_six -> {
                calculator.appendNumScreen("6")
            }
            R.id.btn_seven -> {
                calculator.appendNumScreen("7")
            }
            R.id.btn_eight -> {
                calculator.appendNumScreen("8")
            }
            R.id.btn_nine -> {
                calculator.appendNumScreen("9")
            }
            R.id.btn_dot -> {
                calculator.appendNumScreen(".")
            }
        }
    }

    fun onClickOperasional(v:View){
        when (v.id){
            R.id.btn_multiple -> {
                calculator.selectOperasional('x')
            }
            R.id.btn_dive -> {
                calculator.selectOperasional('/')
            }
            R.id.btn_plus -> {
                calculator.selectOperasional('+')
            }
            R.id.btn_minus -> {
                calculator.selectOperasional('-')
            }
        }
    }

    fun onClickFunctional(v: View) {
        when (v.id) {
            R.id.btn_ac -> {
                calculator.clearNum("0")
            }
            R.id.btn_minplus -> {
                calculator.clearNum()
            }
            R.id.btn_delete -> {
                calculator.clearNum()
            }
            R.id.btn_result -> {
                calculator.mathOperation()
            }
        }
    }


}