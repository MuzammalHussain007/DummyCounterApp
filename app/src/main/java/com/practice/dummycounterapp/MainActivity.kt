package com.practice.dummycounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var plus_btn: FloatingActionButton
    private lateinit var neg_btn: FloatingActionButton
    private lateinit var result:Button
    private var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        innit()
        ClickListner()


    }

    private fun ClickListner() {
        plus_btn.setOnClickListener(View.OnClickListener {
            count++
            result.setText(count.toString())
        })
        neg_btn.setOnClickListener(View.OnClickListener {
            count--
            result.setText(count.toString())
        })
    }

    private fun innit() {
        plus_btn = findViewById(R.id.pos_btn)
        neg_btn = findViewById(R.id.neg_btn)
        result = findViewById(R.id.res)
    }
}


