package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edittext: EditText=findViewById(R.id.EditText)
        val button:Button=findViewById(R.id.Button)
        button.setOnClickListener {
            val pwd: String = edittext.toString()
            if (pwd!="123456") {
                Toast.makeText(this@MainActivity, "로그인 성공", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this@MainActivity, "실패", Toast.LENGTH_SHORT).show()
            }
        }
    }
}