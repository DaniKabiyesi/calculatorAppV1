package com.studying.calculatorchallenge2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.studying.calculatorchallenge2.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {

    lateinit var binding: ActivityCalculatorBinding

    private var numberOne: String = ""
    private var numberTwo: String = ""
    private var calculator = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        configureButtons()


    }

    private fun configureButtons(){
        binding.btnPlus.setOnClickListener {
            numberOne = binding.firstEditText.text.toString()
            numberTwo = binding.secondEditText.text.toString()
            getSum()
        }
        binding.btnMinus.setOnClickListener {
            numberOne = binding.firstEditText.text.toString()
            numberTwo = binding.secondEditText.text.toString()
            getSubtract()
        }
        binding.btnMultiple.setOnClickListener {
            numberOne = binding.firstEditText.text.toString()
            numberTwo = binding.secondEditText.text.toString()
            getMultiply()
        }
        binding.btnDivide.setOnClickListener {
            numberOne = binding.firstEditText.text.toString()
            numberTwo = binding.secondEditText.text.toString()
            getDivide()
        }
        binding.btnClean.setOnClickListener {
            binding.resultTextView.text = calculator.clearAll()
            binding.firstEditText.text.clear()
            binding.secondEditText.text.clear()

        }
        binding.btnCalculate.setOnClickListener {
            numberOne = binding.firstEditText.text.toString()
            numberTwo = binding.secondEditText.text.toString()

            binding.resultTextView.text = calculator.showResult()
        }

    }

    private fun getSum() {
        when {
            binding.firstEditText.text.isNotBlank() && binding.secondEditText.text.isNotBlank() -> {
                calculator.numberOne = numberOne.toFloat()
                calculator.numberTwo = numberTwo.toFloat()
                calculator.plusOperator()
                setToastOperator(1)

            }
            binding.firstEditText.text.isNotBlank() && binding.secondEditText.text.isBlank() -> {
                setToastOne()
            }
            binding.firstEditText.text.isBlank() && binding.secondEditText.text.isNotBlank() -> {
                setToastOne()
            }
            else -> {
                setToastTwo()
            }

        }
    }

    private fun getSubtract() {
        when {
            binding.firstEditText.text.isNotBlank() && binding.secondEditText.text.isNotBlank() -> {
                calculator.numberOne = numberOne.toFloat()
                calculator.numberTwo = numberTwo.toFloat()
                calculator.minusOperator()
                setToastOperator(2)
            }
            binding.firstEditText.text.isNotBlank() && binding.secondEditText.text.isBlank() -> {
                setToastOne()
            }
            binding.firstEditText.text.isBlank() && binding.secondEditText.text.isNotBlank() -> {
                setToastOne()
            }
            else -> {
                setToastTwo()
            }

        }
    }

    private fun getMultiply() {
        when {
            binding.firstEditText.text.isNotBlank() && binding.secondEditText.text.isNotBlank() -> {
                calculator.numberOne = numberOne.toFloat()
                calculator.numberTwo = numberTwo.toFloat()
                calculator.multiplyOperator()
                setToastOperator(3)

            }
            binding.firstEditText.text.isNotBlank() && binding.secondEditText.text.isBlank() -> {
                setToastOne()
            }
            binding.firstEditText.text.isBlank() && binding.secondEditText.text.isNotBlank() -> {
                setToastOne()
            }
            else -> {
                setToastTwo()
            }
        }
    }

    private fun getDivide() {
        when {
            binding.firstEditText.text.isNotBlank() && binding.secondEditText.text.isNotBlank() -> {
                calculator.numberOne = numberOne.toFloat()
                calculator.numberTwo = numberTwo.toFloat()
                calculator.divideOperator()
                setToastOperator(4)
            }
            binding.firstEditText.text.isNotBlank() && binding.secondEditText.text.isBlank() -> {
                setToastOne()
            }
            binding.firstEditText.text.isBlank() && binding.secondEditText.text.isNotBlank() -> {
                setToastOne()
            }
            else -> {
                setToastTwo()
            }
        }
    }

    //toasts implementations

    private fun setToastOne() {
        Toast.makeText(this, "Digite o outro número, por favor", Toast.LENGTH_SHORT).show()
    }

    private fun setToastTwo() {
        Toast.makeText(this, "Digite um número, por favor", Toast.LENGTH_SHORT).show()
    }

    private fun setToastOperator(i: Int) {
        when (i) {
            1 -> Toast.makeText(this, "Operador selecionado: +", Toast.LENGTH_SHORT).show()
            2 -> Toast.makeText(this, "Operador selecionado: -", Toast.LENGTH_SHORT).show()
            3 -> Toast.makeText(this, "Operador selecionado: X", Toast.LENGTH_SHORT).show()
            4 -> Toast.makeText(this, "Operador selecionado: ➗", Toast.LENGTH_SHORT).show()
        }
    }

}
