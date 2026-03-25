package br.edu.fatecpg.livraria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.livraria.livro.Livro

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tituloInput = findViewById<EditText>(R.id.edt_titulo)
        val autorInput = findViewById<EditText>(R.id.edt_autor)
        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)

        btnCadastrar.setOnClickListener {
            val titulo = tituloInput.text.toString()
            val autor = autorInput.text.toString()

            // Criando objeto Livro
            val livro = Livro(titulo, autor)

            // Passando objeto para a segunda tela
            val intent = Intent(this, DetalhesActivity::class.java)
            intent.putExtra("titulo", livro.titulo)
            intent.putExtra("autor", livro.autor)
            startActivity(intent)
        }
    }
}