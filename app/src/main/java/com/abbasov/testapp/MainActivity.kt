package com.abbasov.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.abbasov.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.setOnClickListener {
            Log.d("LOGGERR", "onCreate: ")
            val prefs = getSharedPreferences("test_shared_prefs", 0)
            prefs.edit().putString("test_key_main_activity", "testing_main").apply()
        }
    }
}