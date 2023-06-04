package com.example.empregaeu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class TelaLogin : AppCompatActivity() {
    private lateinit var nomeUsuario: EditText
    private lateinit var senhaUsuario: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        nomeUsuario = findViewById(R.id.nomeUsuario)
        senhaUsuario = findViewById(R.id.senhaUsuario)
    }

    fun onLoginButtonClick(view: View) {
        val username = nomeUsuario.text.toString()
        val password = senhaUsuario.text.toString()

        if (username.isNotEmpty() && password.isNotEmpty()) {
            if (username == "usuario" && password == "senha") {
                Toast.makeText(this, "Autenticação bem-sucedida", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Credenciais inválidas", Toast.LENGTH_SHORT).show()

            }
        } else {
            Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
        }
    }
}
