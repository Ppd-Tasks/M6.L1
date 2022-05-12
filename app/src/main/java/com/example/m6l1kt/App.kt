package com.example.m6l1kt

import android.app.Application
import android.nfc.Tag
import android.os.Debug
import com.example.m6l1kt.Manager.LocalManager
import timber.log.Timber

class App:Application() {

    companion object{
        val TAG = App::class.java.simpleName
        var instance:App? = null
        var localManager:LocalManager? = null
    }

    override fun onCreate() {
        super.onCreate()
        /*Timber.plant(object : Timber.DebugTree(){
            override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                super.log(priority, "global_tag_$tag", message, t)
            }
            override fun createStackElementTag(element: StackTraceElement): String {
                return String.format(
                    "%s:%s",
                    element.methodName,
                    element.lineNumber,
                    super.createStackElementTag(element)
                )
            }
        })
        Timber.d("App Created!")*/

        instance = this
        localManager = LocalManager(this)
        localManager!!.setLocale(this)
    }
}