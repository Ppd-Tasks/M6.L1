package com.example.m6l1kt.Manager

import android.content.Context
import android.content.SharedPreferences

class PrefsManager(context: Context){
    private val sharedPreferences:SharedPreferences?

    companion object{
        private var prefsManager:PrefsManager? = null
        fun getInstance(context: Context):PrefsManager?{
            if (prefsManager == null){
                prefsManager = PrefsManager(context)
            }
            return prefsManager
        }
    }

    init {
        sharedPreferences = context.getSharedPreferences("MyPref",Context.MODE_PRIVATE)
    }
    fun saveData(key:String?,value:String?){
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putString(key,value)
        prefsEditor.commit()
    }
    fun getData(key: String?):String?{
        return if (sharedPreferences != null) sharedPreferences.getString(key,"") else "en"
    }
    fun saveDataInt(key:String?,value:Int?){
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putInt(key,value!!)
        prefsEditor.commit()
    }
    fun getDataInt(key: String?):Int?{
        return if (sharedPreferences != null) sharedPreferences.getInt(key,0) else 1
    }

    fun saveDataObject(key:String?,member: Member){
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putString(key,member.fullname)
        prefsEditor.putInt(key,member.age)
        prefsEditor.commit()
    }
    fun getDataObject(key:String?):Member{
         if (sharedPreferences != null) {
             val age =sharedPreferences.getInt(key,0)
             val fullname =sharedPreferences.getString(key,"")
             return Member(fullname!!,age)
         }
        return Member("",0)
    }
/*
    fun saveDataInt(key:String?,value:Int?){
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putInt(key,value!!)
        prefsEditor.commit()
    }
    fun getDataInt(key: String?):Int?{
        return if (sharedPreferences != null) sharedPreferences.getInt(key,0) else 1
    }
    fun saveDataBoolean(key:String?,value:Boolean?){
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putBoolean(key,value!!)
        prefsEditor.commit()
    }
    fun getDataBoolean(key: String?):Boolean?{
        return if (sharedPreferences != null) sharedPreferences.getBoolean(key,false) else true
    }
    fun saveDataDouble(key:String?,value:Float?){
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putFloat(key,value!!)
        prefsEditor.commit()
    }
    fun getDataDouble(key: String?):Float?{
        return if (sharedPreferences != null) sharedPreferences.getFloat(key, 0.0F) else 1.1F
    }
    fun saveDataLong(key:String?,value:Long?){
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putLong(key,value!!)
        prefsEditor.commit()
    }
    fun getDataLong(key: String?):Long?{
        return if (sharedPreferences != null) sharedPreferences.getLong(key, 0) else 1
    }

 */
}