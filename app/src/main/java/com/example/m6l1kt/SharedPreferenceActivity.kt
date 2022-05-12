package com.example.m6l1kt

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts.SettingsColumns.KEY
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.m6l1kt.Manager.Member
import com.example.m6l1kt.Manager.PrefsManager
import com.google.gson.Gson

class SharedPreferenceActivity : AppCompatActivity() {
    private var prefsManager:PrefsManager? = null
    private var PREFERENCES_NAME = ""
    private var KEY:String = "Key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        initViews()
    }

    fun initViews(){
        val et_fullname = findViewById<EditText>(R.id.et_fullname)
        val et_email = findViewById<EditText>(R.id.et_email)
        val et_password = findViewById<EditText>(R.id.et_password)
        val et_confirm = findViewById<EditText>(R.id.et_confirm)
        val b_save = findViewById<Button>(R.id.b_save)
        val gson = Gson()
        val sharedPreferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE)


        b_save.setOnClickListener(View.OnClickListener {
            val fullname = et_fullname.text.toString()
            val age = et_email.text.toString()
            val string = et_fullname.text.toString()
            val member = Member("string",19)
            val editor = sharedPreferences.edit()
            val jsonstring = gson.toJson(member)
            editor.putString("KEY",jsonstring)
            editor.apply()
           // val password = et_password.text.toString()
           // val confirm = et_confirm.text.toString()
         /*   //saveEmail(email)
            ///PrefsManager(this).saveData("email",email)
            //PrefsManager(this).saveDataInt("fullname",email.toInt())
           // PrefsManager(this).saveDataBoolean("email",email.toBoolean())
            //PrefsManager(this).saveDataDouble("email",email.toFloat())
            //PrefsManager(this).saveData("fullname",fullname)
            //PrefsManager(this).saveData("email",email)
            //PrefsManager(this).saveData("password",password)
            //PrefsManager(this).saveData("confirm",confirm) */

        })
        val b_load = findViewById<Button>(R.id.b_load)
        b_load.setOnClickListener(View.OnClickListener {
          /*  //val email = et_email.text.toString()
            //loadEmail()
            //et_email.setText(PrefsManager(this).getData("email"))
            //et_email.setText(PrefsManager(this).getDataInt("email").toString())
            //et_email.setText(PrefsManager(this).getDataBoolean("email").toString())
            //et_email.setText(PrefsManager(this).getDataDouble("email").toString())
            //et_fullname.setText(PrefsManager(this).getData("fullname"))
            //et_email.setText(PrefsManager(this).getData("email"))
            //et_password.setText(PrefsManager(this).getData("password"))
            //et_confirm.setText(PrefsManager(this).getData("confirm")) */
            et_fullname.setText(PrefsManager(this).getDataObject("object").fullname)
            et_email.setText(PrefsManager(this).getDataObject("object").age.toString())
        })
    }


    fun saveEmail(email:String?){
        val prefs = applicationContext.getSharedPreferences("MyPref", MODE_PRIVATE)
        val editor = prefs.edit()
        editor.putString("email",email)
        editor.apply()
    }
    fun loadEmail():String?{
        val prefs = applicationContext.getSharedPreferences("MyPref", MODE_PRIVATE)
        return prefs.getString("email","pdp@gmail.com")
    }
    fun removeEmail(){
        val prefs = applicationContext.getSharedPreferences("MyPref", MODE_PRIVATE)
        val editor = prefs.edit()
        editor.remove("email")
        editor.apply()
    }
    fun clearAll(){
        val prefs = applicationContext.getSharedPreferences("MyPref", MODE_PRIVATE)
        val editor = prefs.edit()
        editor.clear()
        editor.apply()
    }

}