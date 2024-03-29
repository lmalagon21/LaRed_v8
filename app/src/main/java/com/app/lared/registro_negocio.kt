package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro_negocio.*

class registro_negocio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_negocio)

        val registroNuevoNegocio : Button = findViewById(R.id.continuar_reg_neg2)
        registroNuevoNegocio.setOnClickListener {
            val nombre_negocio = this.nombrenegocio.getText().toString()
            val tipo_negocio = this.tipo_negocio.getText().toString()
            if (nombre_negocio.equals("")) {
                Toast.makeText(this, "Debe ingresar el nombre de su negocio",
                    Toast.LENGTH_LONG).show();
            } else {
                if (tipo_negocio.equals("")) {
                    Toast.makeText(
                        this, "Debe escoger el tipo de negocio",
                        Toast.LENGTH_LONG
                    ).show();
                }else {
                    val intent = Intent(this, registro_negocio2::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
