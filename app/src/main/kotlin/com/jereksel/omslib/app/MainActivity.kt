package com.jereksel.omslib.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.jereksel.omslib.OMSLib

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val oms = OMSLib.getOMS();

        var map = oms.getAllOverlays(0)

        Log.d("Print", "Print")

    }
}
