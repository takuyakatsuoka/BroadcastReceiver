package jp.techacademy.takuya.katuoka.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.widget.Toast
import android.content.Intent

class TimezoneBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "タイムゾーンが変化しました", Toast.LENGTH_LONG).show()
    }
}