 package com.example.controledenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

 lateinit var nomeEditText: EditText
 lateinit var nota1EditText: EditText
 lateinit var nota2EditText: EditText
 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        val cancelar = findViewById(R.id.sair) as Button
        val resultado = findViewById<TextView>(R.id.resultado)

        calcular.setOnClickListener{

            nomeEditText = findViewById(R.id.nome)
            nota1EditText = findViewById(R.id.nota1)
            nota2EditText = findViewById(R.id.nota2)


            val nota1 = nota1EditText.text.toString().toInt()
            val nota2 = nota2EditText.text.toString().toInt()

            val media = calcularMedia(nota1, nota2)
            resultado.text = situacaoAluno(media)

        cancelar.setOnClickListener{

            finish()

        }

           // private fun calcularMedia(nota1: Int, nota2: Int) = (nota1 + nota2) / 2

           // val calcularMedia = { nota1: Int, nota2: Int -> (nota1 + nota2) / 2}




            fun validarCampos(): Boolean{

                var noError = true
                if(nomeEditText.text.isBlank()){
                    nomeEditText.setError("digite seu nome!")
                    noError = false
                }

                if(nota1EditText.text.isBlank()){
                    nota1EditText.setError("digite a primeira nota!")
                    noError = false
                }

                if(nota2EditText.text.isBlank()){
                    nota2EditText.setError("digite a segunda nota!")
                    noError = false
                }

                return noError

            }

        }
    }
}