package com.anshumemorial.satish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver.OnPreDrawListener
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

//    private var dataLoaded by Delegates.notNull<Boolean>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1000)
        installSplashScreen()
        setContentView(R.layout.activity_main)
//        dataLoaded = false
////        added
//        val container = findViewById<View>(android.R.id.content)
//        container.viewTreeObserver.addOnPreDrawListener(object :OnPreDrawListener{
//            override fun onPreDraw(): Boolean {
//                if (dataLoaded){
//                    return false
//                }else{
//                    return true
//                }
//            }
//        })
    }
}