package com.example.arasinav

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class IcindekilerMenusu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icindekiler_menusu)
        var gecenCorba = findViewById<TextView>(R.id.gecenCorba)
        var alinanSey = intent.getStringExtra("aktarilacaksey")
        var tuz = "Tuzsuz "
        var aci = "Acısız"
        gecenCorba.text = "$alinanSey Çorbası"

        var limon = findViewById<Switch>(R.id.limon)
        var sirke = findViewById<Switch>(R.id.sirke)
        var kitir = findViewById<Switch>(R.id.kitir)
        var beyin = findViewById<Switch>(R.id.beyin)
        var dil = findViewById<Switch>(R.id.dil)
        var tozBiber = findViewById<Switch>(R.id.tozBiber)
        var yag  = findViewById<Switch>(R.id.yag)
        var nane = findViewById<Switch>(R.id.nane)
        var terbiye = findViewById<Switch>(R.id.terbiye)
        var krema = findViewById<Switch>(R.id.krema)
        var kasar = findViewById<Switch>(R.id.kasar)
        var sarimsak = findViewById<Switch>(R.id.sarimsak)
        var istek = findViewById<TextView>(R.id.textView14)
        var istekk = findViewById<EditText>(R.id.istek)
        var tuzSeek = findViewById<SeekBar>(R.id.seekBar)
        var aciSeek = findViewById<SeekBar>(R.id.seekBar2)
        var siparisVer = findViewById<Button>(R.id.button2)
        val uyari = AlertDialog.Builder(this)
        val alert = AlertDialog.Builder(this)
        var naneSwitch = ""
        var tozbiberwitch = ""
        var kitirswitch = ""
        var limonswitch = ""
        var yagswitch = ""
        var beyinswitch = ""
        var sarimsakswitch = ""
        var kremaswitch = ""
        var kasarswitch = ""
        var terbiyeswitch = ""
        var sirkeswitch = ""
        var dilswitch = ""

        istek.setText(alinanSey)

        limon.visibility = View.INVISIBLE
        sirke.visibility = View.INVISIBLE
        kitir.visibility = View.INVISIBLE
        beyin.visibility = View.INVISIBLE
        dil.visibility = View.INVISIBLE
        tozBiber.visibility = View.INVISIBLE
        yag.visibility = View.INVISIBLE
        nane.visibility = View.INVISIBLE
        terbiye.visibility = View.INVISIBLE
        krema.visibility = View.INVISIBLE
        kasar.visibility = View.INVISIBLE
        sarimsak.visibility = View.INVISIBLE

        if(istek.text.toString() == "Ezogelin"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE

            }

        if(istek.text.toString() == "Düğün"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE

        }
        if(istek.text.toString()=="Mercimek"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE

        }
        if(istek.text.toString() == "Brokoli"){
            krema.visibility = View.VISIBLE
        }

        if(istek.text.toString()=="Kelle Paca"){
            sarimsak.visibility = View.VISIBLE
            dil.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            beyin.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE

        }

        if(istek.text.toString()=="Yayla"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
        }
        if (istek.text.toString() == "Sehriye"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE

        }

        if(istek.text.toString() == "Domates"){
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            terbiye.visibility = View.VISIBLE
            kasar.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
        }
        if(istek.text.toString() == "Tarhana"){
            yag.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
        }

        if(istek.text.toString()=="Mantar"){
            krema.visibility = View.VISIBLE
        }

        if(istek.text.toString() == "Iskembe"){
            yag.visibility = View.VISIBLE
            tozBiber.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            sarimsak.visibility = View.VISIBLE
        }
        if(istek.text.toString()=="Tavuk"){
            krema.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
        }




        tuzSeek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {


            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {

                when (tuzSeek.progress) {
                    0->{
                        tuz = "Tuzsuz"
                    }

                    1 -> {
                         tuz = "Orta Tuzlu"

                    }
                    2 -> {
                         tuz = "Bol Tuzlu"
                        uyari.setTitle("Uyari !")
                        uyari.setMessage("Bu Kadar Tuzlu Istediginize Emin Misiniz?")
                        uyari.setIcon(R.drawable.tuz)
                        uyari.setCancelable(false)
                        uyari.setPositiveButton("Evet"){ DialogInterface,i ->
                        }
                        uyari.setNegativeButton("Hayir"){ DialogInterface , i ->
                            tuzSeek.progress = 1
                            Toast.makeText(applicationContext,"Tekrar Secim Yapiniz",Toast.LENGTH_SHORT).show()
                        }
                        uyari.create().show()

                        Toast.makeText(applicationContext,"Bol Tuzlu Corba", Toast.LENGTH_SHORT).show()
                    }

                }



            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {


            }
        })
        aciSeek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                when(aciSeek.progress){
                    0 ->{
                        aci = "Acısız"
                    }
                    1 ->{
                        aci = "Orta Acılı"
                    }
                    2 -> {
                        aci = "Bol Acılı"
                        uyari.setTitle("Uyari !")
                        uyari.setMessage("Bu Kadar Acı Istediginize Emin Misiniz?")
                        uyari.setIcon(R.drawable.biber)
                        uyari.setCancelable(false)
                        uyari.setPositiveButton("Evet"){
                                DialogInterface,i ->
                        }
                        uyari.setNegativeButton("Hayir"){
                                DialogInterface , i ->
                            aciSeek.progress = 1
                            Toast.makeText(applicationContext,"Tekrar Secim Yapiniz",Toast.LENGTH_SHORT).show()
                        }


                        uyari.create().show()

                        Toast.makeText(applicationContext,"Bol Acılı Corba", Toast.LENGTH_SHORT).show()
                    }
                }


            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {


            }
        })

        siparisVer.setOnClickListener {
            var ekstraIstek = istekk.text.toString()
            alert.setTitle("Siparisinizin Durumu")
            alert.setMessage("Siparisiniz Hazirlanacak.Devam Etmek Istiyor Musunuz?")
            alert.setIcon(R.drawable.logo)
            alert.setCancelable(false)
            alert.setPositiveButton("Evet"){
                DialogInterface, i->
                Handler(Looper.getMainLooper()).postDelayed(
                    {
                        //diger sayfaya gecme kodu
                        val  intent = Intent(this,SonEkran::class.java)
                        if (nane.isChecked){
                            naneSwitch = "Nane ,"

                        }
                        if (tozBiber.isChecked){
                            tozbiberwitch = "Toz Biber ,"

                        }
                        if (kitir.isChecked){
                            kitirswitch = "Kıtır ,"


                        }
                        if (limon.isChecked){
                            limonswitch = "Limon ,"


                        }
                        if (yag.isChecked){
                            yagswitch = "Yag ,"


                        }
                        if (beyin.isChecked){
                            beyinswitch = "Beyin ,"


                        }
                        if (sarimsak.isChecked){
                            sarimsakswitch = "Sarimsak ,"


                        }
                        if (krema.isChecked){
                            kremaswitch = "Krema ,"


                        }
                        if (kasar.isChecked){
                            kasarswitch = "Kasar ,"

                        }
                        if (terbiye.isChecked){
                            terbiyeswitch = "Terbiye ,"



                        }
                        if (sirke.isChecked){
                            sirkeswitch = "Sirke ,"


                        }
                        if (dil.isChecked){
                            dilswitch = "Dil ,"
                        }
                        intent.putExtra("aktarilacaksey",alinanSey)
                        intent.putExtra("aktarilacakSey",tuz)
                        intent.putExtra("aktarilacakaci",aci)
                        intent.putExtra("aktarilacakekstra",ekstraIstek)
                        intent.putExtra("aktarilacakDil",dilswitch)
                        intent.putExtra("aktarilacakSirke",sirkeswitch)
                        intent.putExtra("aktarilacakTerbiye",terbiyeswitch)
                        intent.putExtra("aktarilacakKrema",kremaswitch)
                        intent.putExtra("aktarilacakKasar",kasarswitch)
                        intent.putExtra("aktarilacakSarimsak",sarimsakswitch)
                        intent.putExtra("aktarilacakBeyin",beyinswitch)
                        intent.putExtra("aktarilacakYag",yagswitch)
                        intent.putExtra("aktarilacakLimon",limonswitch)
                        intent.putExtra("aktarilacakKitir",kitirswitch)
                        intent.putExtra("aktarilacakTozbiber",tozbiberwitch)
                        intent.putExtra("aktarilacakNane",naneSwitch)


                        startActivity(intent) //zamanlayici bittikten sonra calisacak
                    },2000)
            }

            alert.setNeutralButton("Tekrar Kontrol Etmek Istiyorum"){
                DialogInterface,i ->

            }
                alert.create().show()
        }




    }

}