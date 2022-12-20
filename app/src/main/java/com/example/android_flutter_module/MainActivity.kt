package com.example.android_flutter_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.android.FlutterActivityLaunchConfigs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // get reference to button
        val btnClickMe = findViewById(R.id.button) as Button
        // set on-click listener
        btnClickMe.setOnClickListener {
            startActivity(
                FlutterActivity
                    .withNewEngine()
                    .backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent)
                    .build(this))
        }

    }



}