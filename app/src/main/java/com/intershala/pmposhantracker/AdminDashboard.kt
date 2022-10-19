package com.intershala.pmposhantracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AdminDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_dashboard)
        val btnTrackPMPoshan= findViewById<Button>(R.id.btnTrackPMPoshan)

        btnTrackPMPoshan.setOnClickListener {
            val intent=Intent(this,AdminDashboardTracking::class.java)
            startActivity(intent)
        }
    }
}