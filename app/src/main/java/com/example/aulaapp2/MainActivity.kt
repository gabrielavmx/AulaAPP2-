package com.example.aulaapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variaveis inicialização
        val edtNumeroUm: EditText = findViewById(R.id.edtNumeroUm)
        val edtNumeroDois: EditText = findViewById(R.id.edtNumeroDois)
        val btnCalcular: Button = findViewById(R.id.bntCalcular)

        /*calculo a ser realizado*/
        btnCalcular.setOnClickListener {
            val toast = Toast.makeText(this, "O botão foi clicado!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
    private fun calcular(){
            val total: Int
            total = 10 + 9
        val toast = Toast.makeText(this, total.toString(), Toast.LENGTH_SHORT)
        toast.show()
    }
}