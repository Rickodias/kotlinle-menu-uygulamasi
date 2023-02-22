package com.example.arasinav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityCompat
import pl.droidsonroids.gif.GifImageButton
import pl.droidsonroids.gif.GifImageView
import kotlin.system.exitProcess

class SonEkran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_son_ekran)
        var corba = findViewById<TextView>(R.id.textView5)
        var icindekiler = findViewById<TextView>(R.id.textView11)
        var ekstraIstek = findViewById<TextView>(R.id.textView13)
        var cikis = findViewById<ImageView>(R.id.imageView9)
        var alinancorba = intent.getStringExtra("aktarilacaksey")
        var atilanTuz = intent.getStringExtra("aktarilacakSey")
        var atilanaci = intent.getStringExtra("aktarilacakaci")
        var gecenistek = intent.getStringExtra("aktarilacakekstra")
        var gelenNane = intent.getStringExtra("aktarilacakNane")
        var gelenTozbiber = intent.getStringExtra("aktarilacakTozbiber")
        var gelenDil = intent.getStringExtra("aktarilacakDil")
        var gelenSarimsak = intent.getStringExtra("aktarilacakSarimsak")
        var gelenKitir = intent.getStringExtra("aktarilacakKitir")
        var gelenLimon = intent.getStringExtra("aktarilacakLimon")
        var gelenYag = intent.getStringExtra("aktarilacakYag")
        var gelenBeyin= intent.getStringExtra("aktarilacakBeyin")
        var gelenKrema = intent.getStringExtra("aktarilacakKrema")
        var gelenTerbiye = intent.getStringExtra("aktarilacakTerbiye")
        var gelenKasar = intent.getStringExtra("aktarilacakKasar")
        var gelenSirke = intent.getStringExtra("aktarilacakSirke")


        var yeni = findViewById<GifImageButton>(R.id.yeni)

        corba.text = "Bir $alinancorba Corbasi çeeek, $atilanTuz ve $atilanaci Olsun."
        icindekiler.text = "$gelenNane $gelenTozbiber $gelenDil $gelenBeyin $gelenKasar $gelenKitir $gelenSarimsak $gelenYag $gelenLimon $gelenKrema $gelenTerbiye $gelenSirke"
        ekstraIstek.text = "Ekstra Istek : $gecenistek"

        yeni.setOnClickListener{

            Handler(Looper.getMainLooper()).postDelayed(
                {
                    //diger sayfaya gecme kodu
                    val  intent = Intent(this,MenuSecimEkrani::class.java)
                    startActivity(intent) //zamanlayici bittikten sonra calisacak
                },1000)
        }

        cikis.setOnClickListener{
            moveTaskToBack(true)
            exitProcess(-1)

        }




    }
}