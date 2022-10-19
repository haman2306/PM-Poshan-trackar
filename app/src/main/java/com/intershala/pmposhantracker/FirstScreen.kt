package com.intershala.pmposhantracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        val btnAdminLogin = findViewById<Button>(R.id.btnAdminLogin)
        val btnSchoolLogin=findViewById<Button>(R.id.btnSchooLogin)

        btnAdminLogin.setOnClickListener {
            val intent = Intent(this,AdminLogin::class.java)
            startActivity(intent)
        }
        btnSchoolLogin.setOnClickListener {
            val intent= Intent(this,SchoolLogin::class.java)
            startActivity(intent)
        }
    }
}