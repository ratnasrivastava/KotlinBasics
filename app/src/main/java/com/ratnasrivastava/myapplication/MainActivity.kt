package com.ratnasrivastava.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var is mutable, val is immutable
        // : String just for explicitly telling
        var mantra : String = "Om Namah Shivay"
        println("Mantra is $mantra")

        val name = "Ratna"
        val age = 29
        val dob = 20071994
/*
* Multiline comment
* If u want to print variable inside quote, use $
* If u r printing only variable, u can write only variable name
* */
        println("My name is $name and age is $age")
        println(dob)

        mantra = "Jai Shankar"
        println("$mantra has been changed")
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }
}