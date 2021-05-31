package Alarm

import android.app.Service
import android.content.Intent
import android.os.HandlerThread
import android.os.IBinder
import android.os.Process
import android.util.Log
import android.widget.Toast
import androidx.annotation.Nullable


//class YourService : Service() {
//
//    override fun onCreate() {
//        val thread = HandlerThread(
//            "ServiceStartArguments",
//            Process.THREAD_PRIORITY_BACKGROUND
//        )
//        thread.start()
//        Log.d("onCreate()", "After service created")
//    }
//
//    @Nullable
//    override fun onBind(intent: Intent?): IBinder? {
//        return null
//    }
//
//    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//        // do your jobs here
//        println("ishlayapti")
//        Toast.makeText(this, "Freshly Made toast!", Toast.LENGTH_SHORT).show();
//        return START_STICKY
//    }
//}