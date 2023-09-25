package com.manjee.viewpinchzoomhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import androidx.databinding.DataBindingUtil
import com.manjee.viewpinchzoomhelper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataBinding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        ZoomHelper.apply {
            setBasicSetting(dataBinding.ivTest)
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent?)
        = ZoomHelper.getInstance().dispatchTouchEvent(ev!!, this) || super.dispatchTouchEvent(ev)
}