package com.example.arasinav

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MenuSecimEkrani : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menusecimekrani)
        var corba = findViewById<CheckBox>(R.id.corba)
        var ezogelin = findViewById<RadioButton>(R.id.ezogelin)
        var dugun = findViewById<RadioButton>(R.id.dugun)
        var mercimek = findViewById<RadioButton>(R.id.mercimek)
        var brokoli = findViewById<RadioButton>(R.id.brokoli)
        var kellePaca = findViewById<RadioButton>(R.id.kelle)
        var yayla = findViewById<RadioButton>(R.id.yayla)
        var sehriye = findViewById<RadioButton>(R.id.sehriye)
        var domates = findViewById<RadioButton>(R.id.domates)
        var tarhana = findViewById<RadioButton>(R.id.tarhana)
        var mantar = findViewById<RadioButton>(R.id.mantar)
        var iskembe = findViewById<RadioButton>(R.id.iskembe)
        var tavuk = findViewById<RadioButton>(R.id.tavuk)
        var buton = findViewById<Button>(R.id.button)
        var progress = findViewById<ProgressBar>(R.id.progressBar)

        ezogelin.visibility = View.INVISIBLE
        dugun.visibility = View.INVISIBLE
        mercimek.visibility = View.INVISIBLE
        brokoli.visibility = View.INVISIBLE
        kellePaca.visibility = View.INVISIBLE
        yayla.visibility = View.INVISIBLE
        sehriye.visibility = View.INVISIBLE
        domates.visibility = View.INVISIBLE
        tarhana.visibility = View.INVISIBLE
        mantar.visibility = View.INVISIBLE
        iskembe.visibility = View.INVISIBLE
        tavuk.visibility = View.INVISIBLE
        buton.visibility = View.INVISIBLE
        progress.visibility = View.INVISIBLE

        corba.setOnClickListener {
            ezogelin.visibility = View.VISIBLE
            dugun.visibility = View.VISIBLE
            mercimek.visibility = View.VISIBLE
            brokoli.visibility = View.VISIBLE
            kellePaca.visibility = View.VISIBLE
            yayla.visibility = View.VISIBLE
            sehriye.visibility = View.VISIBLE
            domates.visibility = View.VISIBLE
            tarhana.visibility = View.VISIBLE
            mantar.visibility = View.VISIBLE
            iskembe.visibility = View.VISIBLE
            tavuk.visibility = View.VISIBLE
            buton.visibility = View.VISIBLE
            val alert = AlertDialog.Builder(this)


            buton.setOnClickListener {

                alert.setTitle("Uyarı!!")
                alert.setMessage("Lutfen Bir Secim Yapiniz.")
                alert.setIcon(R.drawable.logo)
                alert.setCancelable(false)
                alert.setNeutralButton("Tekrar Dene"){DialogInterface,i ->

                }
                alert.create().show()

            }


            ezogelin.setOnClickListener {
                buton.setOnClickListener {

                    Toast.makeText(applicationContext,"Ezogelin Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()

                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Ezogelin"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }
            dugun.setOnClickListener {
                buton.setOnClickListener {
                    Toast.makeText(applicationContext,"Dugun Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()
                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Düğün"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }
            mercimek.setOnClickListener {

                buton.setOnClickListener {
                    Toast.makeText(applicationContext,"Mercimek Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()
                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Mercimek"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }
            brokoli.setOnClickListener {
                buton.setOnClickListener {
                    Toast.makeText(applicationContext,"Brokoli Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()
                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Brokoli"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }
            kellePaca.setOnClickListener {
                buton.setOnClickListener {
                    Toast.makeText(applicationContext,"Kelle Paca Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()
                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Kelle Paca"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }
            yayla.setOnClickListener {
                buton.setOnClickListener {
                    Toast.makeText(applicationContext,"Yayla Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()
                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Yayla"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }
            sehriye.setOnClickListener {
                buton.setOnClickListener {
                    Toast.makeText(applicationContext,"Sehriye Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()
                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Sehriye"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }
            domates.setOnClickListener {
                buton.setOnClickListener {
                    Toast.makeText(applicationContext,"Domates Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()
                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Domates"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }
            tarhana.setOnClickListener {
                buton.setOnClickListener {
                    Toast.makeText(applicationContext,"Tarhana Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()
                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Tarhana"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }
            mantar.setOnClickListener {
                buton.setOnClickListener {
                    Toast.makeText(applicationContext,"Mantar Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()
                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Mantar"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }
            iskembe.setOnClickListener {
                buton.setOnClickListener {
                    Toast.makeText(applicationContext,"Iskembe Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()
                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Iskembe"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }
            tavuk.setOnClickListener {
                buton.setOnClickListener {
                    Toast.makeText(applicationContext,"Tavuk Corbasi Guzel Secim Lutfen Bekleyiniz", Toast.LENGTH_SHORT).show()
                    progress.visibility = View.VISIBLE
                    Handler(Looper.getMainLooper()).postDelayed(
                        {
                            var name = "Tavuk"
                            //diger sayfaya gecme kodu
                            val  intent = Intent(this,IcindekilerMenusu::class.java)
                            intent.putExtra("aktarilacaksey",name)
                            startActivity(intent) //zamanlayici bittikten sonra calisacak
                        },2000)
                }

            }


        }
    }
}

