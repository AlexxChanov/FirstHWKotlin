package com.example.firsthwkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        goButton.setOnClickListener{
            val figure: Int = (since.text.toString().toInt()..to.text.toString().toInt()).random()

            textView.setText("${figure}")
        }
    }
}
