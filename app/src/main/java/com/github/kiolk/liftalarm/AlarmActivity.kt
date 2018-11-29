package com.github.kiolk.liftalarm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric




class AlarmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)
        Fabric.with(this, Crashlytics())
        val text = findViewById<TextView>(R.id.text)
        text.text = BuildConfig.GitHash
    }
}
