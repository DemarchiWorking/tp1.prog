package pck.dev.apd.tp1prog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_context.*
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    var nomeArq = "contato"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        config()
        btnListar.setOnClickListener { View.OnClickListener{}
            intent = Intent(this, Context::class.java)
            startActivity(intent)
        }

        btnSalvar.setOnClickListener {
            View.OnClickListener {

            }
            config()
            if(edtNome.text.toString() == "" || edtTelefone.text.toString() == "" || edtEmail.text.toString() == ""  || edtCidade.text.toString() == "" ){
                txtView1.text = "Preencha todos os Campos"
                Toast.makeText(this@MainActivity,  "Preencha todos os Campos", Toast.LENGTH_LONG).show()

            }else{
                txtView1.text = edtNome.text.toString()
                val contato = Contatos(edtNome.text.toString(), edtTelefone.text.toString()
                    ,edtEmail.text.toString(), edtCidade.text.toString())
                contato.salvarContato()
            }
        }

    }

    fun config() {
        val file = File(filesDir, nomeArq)
        // se o arquivo já existe edite
        if (file.exists()) {
            txtView1.text = filesDir.toString()
            //se nao, crie
        } else {
            txtView1.text = filesDir.toString()
            file.createNewFile()
        }


    }
}