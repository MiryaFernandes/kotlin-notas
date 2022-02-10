 package com.example.controledenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        val sair = findViewById<EditText>(R.id.sair)

        calcular.setOnClickListener{

            val nota1 = findViewById<EditText>(R.id.nota1).text.toString().toInt()
            val nota2 = findViewById<EditText>(R.id.nota2).text.toString().toInt()
            val resultado = findViewById<EditText>(R.id.resultado)

            val media = (nota1 + nota2) / 2

            if (media >= 5){
                resultado.text = "aprovado"
                resultado.setTextColor(Color.GREEN)
            } else {

                resultado.text = "reprovado"
                resultado.setTextColor(Color.RED)
            }

        sair.setOnClickListener{

            finish()

        }

        }
    }
}