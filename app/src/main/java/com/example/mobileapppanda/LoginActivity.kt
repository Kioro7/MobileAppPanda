package com.example.mobileapppanda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnEnterApp: Button = findViewById(R.id.btnEnterApp)
        btnEnterApp.setOnClickListener {
            val editTextEmail: EditText = findViewById(R.id.editTextEmailAddress)
            val editTextPassword: EditText = findViewById(R.id.editTextPassword)

            if (AuthUtil.loginValidation(editTextEmail.text.toString(), editTextPassword.text.toString())) {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }

        val textViewReg: TextView = findViewById(R.id.textViewRegistration)
        textViewReg.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }

    }

    object AuthUtil {
        internal fun loginValidation(email: String, password: String): Boolean {
            // Проверяем, соответствуют ли введенные данные заданным значениям
            return email == "ilzam@mail.ru" && password == "Aa123456!"
        }
    }
}