package com.anshumemorial.satish

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

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