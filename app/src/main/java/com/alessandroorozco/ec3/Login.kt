package com.alessandroorozco.ec3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import androidx.core.widget.addTextChangedListener
import com.alessandroorozco.ec3.databinding.ActivityLoginBinding


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    class Login : AppCompatActivity() {
        private lateinit var binding: ActivityLoginBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityLoginBinding.inflate(layoutInflater)
            setContentView(binding.root)
            setupView()
        }

        private fun setupView() {
            binding.tilEmail.editText?.addTextChangedListener { text ->
                binding.btnLogin.isEnabled = validateInputs(
                    text.toString(),
                    binding.tilPassword.editText?.text.toString()
                )
            }
            binding.tilPassword.editText?.addTextChangedListener { text ->
                binding.btnLogin.isEnabled = validateInputs(
                    binding.tilEmail.editText?.text.toString(),
                    text.toString()
                )
            }
            binding.btnLogin.setOnClickListener {
                val email = binding.tilEmail.editText?.text.toString()
                val password = binding.tilPassword.editText?.text.toString()

                if (validateInputs(email, password) && email == "ejemplo@idat.edu.pe" && password == "123456") {
                    // Inicio de sesión exitoso
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    // Credenciales incorrectas
                    // Mostrar mensaje de error o tomar alguna otra acción
                }
            }
        }

        private fun validateInputs(email: String, password: String): Boolean {
            val isEmailOk = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
            val isPasswordOk = password.length >= 6
            return isPasswordOk && isEmailOk
        }
}
}
