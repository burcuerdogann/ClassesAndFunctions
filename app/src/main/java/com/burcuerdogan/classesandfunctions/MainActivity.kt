package com.burcuerdogan.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

// var name = ""

class MainActivity : AppCompatActivity() {

    var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testFunction()

        // Void - Unit

        // mySum(10,20)

        // Return

        val result = myMultiply(10,20)
        // textView.text = "Result: ${result}"

        /*
        button.setOnClickListener() {
            println("Clicked")
        }
         */

        // Class

        // Object - Instance

        val homer = Simpson("Homer Simpson",50,"Nuclear")

        // homer.age = 60
        // homer.name = "Homer"
        // homer.job = "Nuclear"

        homer.hairColor = "Blonde"

        println(homer.age)

        // Nullability

        // Nullable -> ? && Non-null
        // !! vs ?

        var myString : String? = null
        var myAge : Int? = null

        // If we are sure that our object is initialized, we can use -> !!

        // 1-Null Safety

        if (myAge != null) {
            println(myAge * 10)
        } else {
            println("myAge null")
        }

        // 2-Safe Call

        println(myAge?.compareTo(2))

        // 3-Elvis

        val myResult = myAge?.compareTo(2) ?: -100
        println(myResult)

    }

    fun testFunction() {
        println("Test Function")
    }

    // Input & Return

    /*
    fun mySum(a: Int,b: Int) {
        textView.text = "Result: ${a + b}"
    }
     */

    fun myMultiply(x:Int,y:Int) : Int {
        return x * y
    }

    fun makeSimpson (view: View) {

        name = nameText.text.toString()
        var age = ageText.text.toString().toIntOrNull()
        if (age == null) {
            age = 0
        }
        val job = jobText.text.toString()

        val simpson = Simpson(name,age,job)

        resultText.text = "Name : ${simpson.name}, Age : ${simpson.age}, Job : ${simpson.job}"

    }

    fun scopeExample(view: View) {

        // Scope

        println(name)

    }









    






}

