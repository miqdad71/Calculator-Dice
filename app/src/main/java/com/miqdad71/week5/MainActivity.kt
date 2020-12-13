package com.miqdad71.week5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.miqdad71.week5.calculator.CalculatorActivity
import com.miqdad71.week5.dice.DiceActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = getString(R.string.main_page)

        btn_dice.setOnClickListener {
            startActivity(Intent(this, DiceActivity::class.java ))
        }

        btn_calculator.setOnClickListener {
            startActivity(Intent(this, CalculatorActivity::class.java))
        }

    }
}
