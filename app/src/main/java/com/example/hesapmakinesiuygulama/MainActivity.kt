package com.example.hesapmakinesiuygulama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sayisec(sayisecmeislemi : View){

        if (yenioperator){
            sonuc.text = ""
        }
        yenioperator = false
        var butonsec = sayisecmeislemi as Button
        var butondeger : String = sonuc.text.toString()

        when(butonsec.id){
            sifir.id -> {butondeger += "0"}
            bir.id -> {butondeger += "1"}
            iki.id -> {butondeger += "2"}
            uc.id -> {butondeger += "3"}
            dort.id -> {butondeger += "4"}
            bes.id -> {butondeger += "5"}
            alti.id -> {butondeger += "6"}
            yedi.id -> {butondeger += "7"}
            sekiz.id -> {butondeger += "8"}
            dokuz.id -> {butondeger += "9"}

        }

        sonuc.text = butondeger
    }

    var operator = ""
    var eskisayi = ""
    var yenioperator = true

    fun islem(islemsecmeislemi : View){
        var islemsec = islemsecmeislemi as Button
        when(islemsec.id){
            carpi.id ->  {operator = "*"}
            bolu.id ->  {operator = "/"}
            topla.id ->  {operator = "+"}
            eksi.id ->  {operator = "-"}
        }
        eskisayi = sonuc.text.toString()
        yenioperator = true
    }

    fun esittir(esittir : View){
        var yenisayi = sonuc.text.toString()
        var islemsonucu : Double? = null
        when (operator){
            "*" -> {islemsonucu = eskisayi.toDouble() * yenisayi.toDouble()}
            "/" -> {islemsonucu = eskisayi.toDouble() / yenisayi.toDouble()}
            "+" -> {islemsonucu = eskisayi.toDouble() + yenisayi.toDouble()}
            "-" -> {islemsonucu = eskisayi.toDouble() - yenisayi.toDouble()}
        }
        sonuc.text = islemsonucu.toString()
        yenioperator = true
    }

    fun ac(silmeislemi : View){
        sonuc.text = "0"
        yenioperator = true
    }
}