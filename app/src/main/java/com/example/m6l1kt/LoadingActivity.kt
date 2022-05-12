package com.example.m6l1kt

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

//import com.github.razir.progressbutton.*
//import io.rmiri.buttonloading.ButtonLoading
//import io.rmiri.buttonloading.ButtonLoading.OnButtonLoadingListener

class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        initViews()
    }

    fun initViews() {
        //var button = findViewById<ButtonLoading>(R.id.button)
        /*button.setOnButtonLoadingListener(object : OnButtonLoadingListener {
            override fun onClick() {

                //...
            }

            override fun onStart() {

                //...
            }

            override fun onFinish() {

                //...
            }
        })*/

        //val layout = findViewById<ConstraintLayout>(R.id.root);
        //val loading_button =findViewById<ButtonLoading>(R.id.loadingbutton);
        /*val myButton = findViewById<Button>(R.id.button)
        bindProgressButton(myButton)

        // (Optional) Enable fade In / Fade out animations
        myButton.attachTextChangeAnimator()

        // Show progress with "Loading" text
        myButton.showProgress {
            buttonTextRes = R.string.loading
            progressColor = Color.WHITE
        }

        // Hide progress and show "Submit" text instead
        myButton.hideProgress(R.string.submit)

        val animatedDrawable = ContextCompat.getDrawable(this, R.drawable.animated_check)
//Defined bounds are required for your drawable
        animatedDrawable?.setBounds(0, 0, 40, 40)

        myButton.showDrawable(animatedDrawable!!) {
            buttonTextRes = R.string.submit
        }*/

    }
}