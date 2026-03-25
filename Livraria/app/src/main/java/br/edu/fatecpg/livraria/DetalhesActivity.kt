package br.edu.fatecpg.livraria

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")

        val txtDetalhes = findViewById<TextView>(R.id.txtDetalhes)
        txtDetalhes.text = "Título: $titulo\nAutor: $autor"
    }
}