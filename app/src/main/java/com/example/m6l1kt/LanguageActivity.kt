package com.example.m6l1kt

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.m6l1kt.Manager.LocalManager
import java.util.*

class LanguageActivity  : AppCompatActivity() {
    lateinit var context:Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.language_activity)

        initViews()

    }
    fun initViews() {
        context = this
        val btn_english = findViewById<Button>(R.id.b_english)
        btn_english.setOnClickListener(View.OnClickListener {
            //setLocale("en")
            App.localManager!!.setNewLocale(context,LocalManager.LANGUAGE_ENGLISH)
        })
        val btn_russian = findViewById<Button>(R.id.b_russian)
        btn_russian.setOnClickListener(View.OnClickListener {
            //setLocale("ru")
            App.localManager!!.setNewLocale(context,LocalManager.LANGUAGE_RUSSIAN)
        })
        val btn_uzbek = findViewById<Button>(R.id.b_uzbek)
        btn_uzbek.setOnClickListener(View.OnClickListener {
            //setLocale("uz")
            App.localManager!!.setNewLocale(context,LocalManager.LANGUAGE_UZBEK)
        })
        val btn_chinese = findViewById<Button>(R.id.b_chinese)
        btn_chinese.setOnClickListener(View.OnClickListener {
            //setLocale("zh")
            //App.localManager!!.setNewLocale(context,LocalManager.LANGUAGE_CHINESE)
        })
        val btn_japanese = findViewById<Button>(R.id.b_japanese)
        btn_japanese.setOnClickListener(View.OnClickListener {
            //setLocale("ja")
            //App.localManager!!.setNewLocale(context,LocalManager.LANGUAGE_JAPANESE)
        })
        val btn_korean = findViewById<Button>(R.id.b_korean)
        btn_korean.setOnClickListener(View.OnClickListener {
            //setLocale("ko")
            //App.localManager!!.setNewLocale(context,LocalManager.LANGUAGE_KOREAN)
        })

        /*val one = resources.getQuantityString(R.plurals.my_cats,1,1)
        val few = resources.getQuantityString(R.plurals.my_cats,2,3)
        val many = resources.getQuantityString(R.plurals.my_cats,5,10)

        Log.d("@@@ONE",one)
        Log.d("@@@FEW",few)
        Log.d("@@@MANY",many)*/
    }

    fun setLocale(language: String){
        val locale = Locale(language)
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale = locale
        baseContext.resources.updateConfiguration(config,baseContext.resources.displayMetrics)
        finish()
    }
}