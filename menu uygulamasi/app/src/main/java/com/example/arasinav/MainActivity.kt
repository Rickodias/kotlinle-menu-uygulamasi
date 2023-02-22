package com.example.arasinav

import android.content.Intent
import android.graphics.pdf.PdfDocument.Page
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //e r a y harflerinin ayri ayri image ve butonlarini tanimliyoruz
        var eharfi = findViewById<TextView>(R.id.textView9)
        var rharfi = findViewById<TextView>(R.id.textView8)
        var aharfi = findViewById<TextView>(R.id.textView7)
        var yharfi = findViewById<TextView>(R.id.textView6)
        var eimage = findViewById<ImageView>(R.id.imageView4)
        var rimage = findViewById<ImageView>(R.id.imageView5)
        var aimage = findViewById<ImageView>(R.id.imageView6)
        var yimage = findViewById<ImageView>(R.id.imageView7)
        var progress = findViewById<ProgressBar>(R.id.progress)




        eimage.visibility = View.INVISIBLE
        rimage.visibility = View.INVISIBLE
        aimage.visibility = View.INVISIBLE
        yimage.visibility = View.INVISIBLE
        progress.visibility = View.INVISIBLE
        eharfi.setOnClickListener{
            eimage.visibility = View.VISIBLE
            rharfi.setOnClickListener{
                rimage.visibility = View.VISIBLE

                aharfi.setOnClickListener{
                    aimage.visibility = View.VISIBLE
                    yharfi.setOnClickListener{
                        yimage.visibility = View.VISIBLE
                        progress.visibility = View.VISIBLE
                        Handler(Looper.getMainLooper()).postDelayed(
                            {
                                //diger sayfaya gecme kodu
                                val  intent = Intent(this,MenuSecimEkrani::class.java)
                                startActivity(intent) //zamanlayici bittikten sonra calisacak
                            },2000)
                    }
                }
            }


        }






      }

    }



