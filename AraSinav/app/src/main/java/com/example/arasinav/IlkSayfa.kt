package com.example.arasinav

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.TypedValue
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class IlkSayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ilksayfa)
        var girisyazisi = findViewById<TextView>(R.id.girisyazisi)
        var baslangicresmi = findViewById<ImageView>(R.id.baslangicresmi)
        object : CountDownTimer (1500,1000){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                var change = Intent(applicationContext,MainActivity::class.java)
                startActivity(change)
                finish()

            }


        }.start()

        
        }

}