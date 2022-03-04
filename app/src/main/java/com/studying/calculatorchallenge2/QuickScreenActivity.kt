package com.studying.calculatorchallenge2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.studying.calculatorchallenge2.databinding.ActivityQuickScreenBinding

class QuickScreenActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuickScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuickScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startCalculatorApp()
    }

        private fun startCalculatorApp(){
            Handler().postDelayed({
                val intent = Intent(this@QuickScreenActivity, CalculatorActivity::class.java)

                startActivity(intent)
                finish()
            }, 1600)
        }
}