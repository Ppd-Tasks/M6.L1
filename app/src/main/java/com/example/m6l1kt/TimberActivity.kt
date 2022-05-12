package com.example.m6l1kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class TimberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timber)

        Timber.d("TimberActivity Created!")
    }
}