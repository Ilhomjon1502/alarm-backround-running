package Alarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.time.LocalTime
import java.util.*

class MyBagroundProsses : BroadcastReceiver(){
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onReceive(context: Context?, intent: Intent?) {
        val ringtone = RingtoneManager.getRingtone(context, RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE))
        Toast.makeText(context, "Fonda ishlamoqda \n ${Calendar.getInstance().time.toString()}", Toast.LENGTH_SHORT).show()

        val dateNow = LocalTime.now()
           ringtone.play()
//        SystemClock.sleep(500)
//        ringtone.stop()
    }
}