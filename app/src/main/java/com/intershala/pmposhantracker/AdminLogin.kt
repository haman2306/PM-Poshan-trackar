package com.intershala.pmposhantracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AdminLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_login)

        val btnSubmitA=findViewById<Button>(R.id.btnSubmitA)
        val txtForgotPasswordA=findViewById<TextView>(R.id.txtForgotPasswordA)
        val etEmailIdA=findViewById<EditText>(R.id.etEmailIdA)
        val etPasswordA=findViewById<EditText>(R.id.etPaswwordA)

        btnSubmitA.setOnClickListener {
            val intent = Intent(this,AdminDashboard::class.java)
            startActivity(intent)
        }

        txtForgotPasswordA.setOnClickListener {
            val toast = Toast.makeText(applicationContext,"We're working on it :)", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}