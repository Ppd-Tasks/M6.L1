package com.example.m6l1kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }
    fun initViews(){
        val button1 = findViewById<Button>(R.id.button1)
        //button1.setText(getString(R.string.app_name))
        button1.setOnClickListener(View.OnClickListener {
            openLanguageActivity()
        })
        val button2 = findViewById<Button>(R.id.button2)
        //button2.setText(getString(R.string.app_name))
        button2.setOnClickListener(View.OnClickListener {
            openTimberActivity()
        })
        val button3 = findViewById<Button>(R.id.button3)
        //button3.setText(getString(R.string.app_name))
        button3.setOnClickListener(View.OnClickListener {
            openLoadingActivity()
        })
        val button4 = findViewById<Button>(R.id.button4)
        //button3.setText(getString(R.string.app_name))
        button4.setOnClickListener(View.OnClickListener {
            openSharedPreferenceActivity()
        })
    }
    fun openLanguageActivity(){
        val intent = Intent(this,LanguageActivity::class.java)
        startActivity(intent)
    }
    fun openTimberActivity(){
        val intent = Intent(this,TimberActivity::class.java)
        startActivity(intent)
    }
    fun openLoadingActivity(){
        val intent = Intent(this,LoadingActivity::class.java)
        startActivity(intent)
    }
    fun openSharedPreferenceActivity(){
        val intent = Intent(this,SharedPreferenceActivity::class.java)
        startActivity(intent)
    }
}