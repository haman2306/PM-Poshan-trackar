package com.intershala.pmposhantracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SchoolLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_school_login)
        val btnSubmit=findViewById<Button>(R.id.btnSubmit)
        val txtForgotPpassword=findViewById<TextView>(R.id.txtForgotPassword)
        val etEmailId=findViewById<EditText>(R.id.etEmailId)
        val etPassword=findViewById<EditText>(R.id.etPaswword)

        btnSubmit.setOnClickListener {
            val intent = Intent(this,SchoolDashboard::class.java)
            startActivity(intent)
        }

        txtForgotPpassword.setOnClickListener {
            val toast =Toast.makeText(applicationContext,"Working On it",Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}