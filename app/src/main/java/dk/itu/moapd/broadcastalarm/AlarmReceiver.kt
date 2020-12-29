package dk.itu.moapd.broadcastalarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Timer done!",
            Toast.LENGTH_LONG).show()
        val vibrator: Vibrator =
            context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            vibrator.vibrate(
                VibrationEffect.createOneShot(
                    2000, VibrationEffect.DEFAULT_AMPLITUDE
                )
            )
        else
            vibrator.vibrate(2000)
    }

}
