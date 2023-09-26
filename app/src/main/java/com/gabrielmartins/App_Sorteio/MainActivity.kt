package com.gabrielmartins.App_Sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear(view: View){
        val textoResultado = findViewById<TextView>(R.id.text_resultado)
        val numero = java.util.Random().nextInt(10)
        textoResultado.setText("número gerado $numero")
     }

}