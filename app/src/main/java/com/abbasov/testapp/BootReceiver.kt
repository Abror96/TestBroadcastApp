package com.abbasov.testapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.preference.PreferenceManager

import android.content.SharedPreferences
import android.text.format.DateFormat


class BootReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val prefs = context.getSharedPreferences("test_shared_prefs", 0)
        prefs.edit().putString(
            "test_key",
            "testing ${convertDate(System.currentTimeMillis().toString(), "dd/MM/yyyy hh:mm:ss")}"
        ).apply()
    }

    fun convertDate(dateInMilliseconds: String, dateFormat: String?): String {
        return DateFormat.format(dateFormat, dateInMilliseconds.toLong()).toString()
    }
}