package com.example.kotlinappone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var sayac = 0

    lateinit var eskiClass: eskiClass  // class tiplerini belirtme önceden

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
      var eski1 =  eskiClass
        eski1.il="a"

        println("onCreate çalıştırıldı")

        birinciFonksiyon()
        ikinciFonksiyon()
        cikarma(10,15) // *5 veri tipi unit işleme izin vermez
        toplama(15,35) *5 // veri tipi int işleme izin verir
        val sonuc = cikarma(5,8) //unit veri tipinde return yok
        val digerSonuc = toplama(15,4)

        println(sonuc)
        println(digerSonuc)

        var classOne = yeniClass()
        classOne.yas = 40
        classOne.isim = "clarke"
        classOne.meslek = "news"
        var classTwo = yeniClass()
        classTwo.yas = 35
        classTwo.isim = "taylor"
        classOne.meslek = "doctor"

        var eskiClassOne = eskiClass()
        eskiClassOne.il = "Kahramanmaraş"
        eskiClassOne.ilce = "Dulkadiroğlu"
        eskiClassOne.plaka = 46
        eskiClassOne.mahalle ="AksuMahallesi"
        println(eskiClassOne.il)


       var constructorClassOne = constructorClass("selim",24,"a")
       constructorClassOne.meslek = "a"
        println(constructorClassOne.meslek)
        var newConstructorClassOne = newConstructorClass("a","b",50)
        println(newConstructorClassOne.sayi)

        var sehirConstructorOne = sehirConstructor("Ankara","Mamak",6,"mamamak mahallesi")

        println(sehirConstructorOne.il)
        println(sehirConstructorOne.ilce)


        var player1 = newConsClass("a","b",50,100)
        player1.playerConsClassScoreTwo =200
        println("${player1.playerConsClassOne}  + ${player1.playerConsClassScoreOne}" )


        //Nullability  - uygulama çökmesini önler bazı hatalarda
        val kullaniciGirdisi = "20"
        val kullaniciGirdisiInteger = kullaniciGirdisi.toIntOrNull()
        if (kullaniciGirdisiInteger != null){
            println(kullaniciGirdisiInteger*2)
        }

        val kullaniciGirdisiDouble = kullaniciGirdisi.toDoubleOrNull()


        // !!  null değil kesin
        kullaniciGirdisiDouble!!.div(2)
        if (kullaniciGirdisiDouble!=null){
            println(kullaniciGirdisiDouble/2)
        }

        // elvis operatörü  null olabilir değilse 20
        println(kullaniciGirdisiDouble?.div(2)?:20)

        // yeni nesil null olma durumu null değilse çalışır
        kullaniciGirdisiDouble.let {
            println(it)
        }

    }
    fun birinciFonksiyon(){
        sayac++
        println("birinci fonksiyon çalıştırıldı : ${sayac}")
    }
    fun ikinciFonksiyon(){
        sayac = sayac *2
        println("ikinci fonksiyon çalıştırıldı")
    }

    //girdi almak
    fun cikarma(a:Int,b:Int){
        println("Çıkarma sonucu : ${a-b}")
        println(eskiClass.il)
    }

    // çıktı vermek -> döndürmek ,return
    fun toplama(a:Int,b:Int):Int {
            println("Toplama sonucu : ${a+b}")
            return a+b
    }

}