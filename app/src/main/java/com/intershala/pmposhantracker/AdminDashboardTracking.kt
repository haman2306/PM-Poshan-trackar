package com.intershala.pmposhantracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class AdminDashboardTracking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_dashboard_tracking)

        val btnTrackAttendance=findViewById<Button>(R.id.btnTrackAttendance)
        val btnTrackCognitiveGrowth= findViewById<Button>(R.id.btnTrackCognitiveGrowth)

        btnTrackAttendance.setOnClickListener {
            val toast =Toast.makeText(applicationContext,"Be patience, we're working :)",Toast.LENGTH_LONG)
            toast.show()
        }
        btnTrackCognitiveGrowth.setOnClickListener {
            val toast =Toast.makeText(applicationContext,"Be patience, we're working :)",Toast.LENGTH_LONG)
            toast.show()
        }

    }
}