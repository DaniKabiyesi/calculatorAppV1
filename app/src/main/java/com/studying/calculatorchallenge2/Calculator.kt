package com.studying.calculatorchallenge2

class Calculator {

    var numberOne: Float = 0.0f
    var numberTwo: Float = 0.0f
    private var result: Float = 0.0f
    var clearAll: String = ""


    fun plusOperator() {
        result = numberOne + numberTwo
    }
    fun minusOperator() {
        result = numberOne - numberTwo
    }
    fun multiplyOperator() {
        result = numberOne * numberTwo

    }
    fun divideOperator() {
        result = numberOne / numberTwo
    }
    fun showResult() : String {
        return result.toString()
    }
    fun clearAll() : String {
        return clearAll
    }
}