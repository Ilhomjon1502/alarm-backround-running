package com.ilhomjon.fondaishlovchidasturlearn

import Alarm.MyBagroundProsses
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt.setOnClickListener {
            val intent = Intent(this, MyBagroundProsses::class.java)
            intent.setAction("BackgroundProcess")

            val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)
            val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

            //intervalini necha sekundda takrorlanishini qila olmadim
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, 1, 10, pendingIntent)
            finish()
        }
    }
}