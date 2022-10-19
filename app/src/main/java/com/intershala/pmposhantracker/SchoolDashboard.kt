package com.intershala.pmposhantracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SchoolDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.school_dashboard)
        val btnUploadAttendance = findViewById<Button>(R.id.btnUploadAttendance)
        val btnUploadBMI = findViewById<Button>(R.id.btnUploadBMI)
        val btnAddStudent = findViewById<Button>(R.id.btnAddStudent)
        val btnUploadMenu = findViewById<Button>(R.id.btnUploadMenu)
        val btnEditPhoneNo = findViewById<Button>(R.id.btnEditPhoneNo)
        val txtViewRank = findViewById<TextView>(R.id.txtViewRank)

        btnEditPhoneNo.setOnClickListener {
            val toast =Toast.makeText(applicationContext,"We're Working on it",Toast.LENGTH_LONG)
            toast.show()
        }
        btnUploadAttendance.setOnClickListener {
            val toast =Toast.makeText(applicationContext,"We're Working on it",Toast.LENGTH_LONG)
            toast.show()
        }
        btnUploadBMI.setOnClickListener {
            val toast =Toast.makeText(applicationContext,"We're Working on it",Toast.LENGTH_LONG)
            toast.show()
        }
        btnUploadMenu.setOnClickListener {
            val toast =Toast.makeText(applicationContext,"We're Working on it",Toast.LENGTH_LONG)
            toast.show()
        }
        txtViewRank.setOnClickListener {
            val toast =Toast.makeText(applicationContext,"We're Working on it",Toast.LENGTH_LONG)
            toast.show()
        }
        btnAddStudent.setOnClickListener {
            val toast =Toast.makeText(applicationContext,"We're Working on it",Toast.LENGTH_LONG)
            toast.show()
        }

    }
}