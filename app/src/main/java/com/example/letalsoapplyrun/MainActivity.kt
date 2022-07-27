package com.example.letalsoapplyrun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var number: Int? = null
    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Let biasanya untuk pengecekan null, di bawah contohnya

        if (number != null) {
            //kita ga tau apakah ada thread lain yang mengakses variable ini, takutnya kerubah
            val number2 = number + 1
            //jika pake !! , kalau null bakalan kosong
        }

        //solusinya


        //kenapa let bisa ? hanya di eksekusi jika nomber ini tidak sama dengan null
        val x = number?.let {
            val number2 = it + 1
            number2
            //di bawah ini sama dengan else
        } ?: 3

        //run return nya ke unit ,, kaya action = "" atau this context

        //apply untuk membuat banyak perubahan dalam objeck yang spesifik


        //bisa startactivity dengan intent di bawah
        val intent = Intent().run {
            putExtra("","")
            action = ""
        }


    }

    fun getSquaredI() = (i + i).also {
        i++
    }

    //also mereturn object, kaya ketika kita membuat function, lalu kita juga mau ngapain gitu ke function nya




}