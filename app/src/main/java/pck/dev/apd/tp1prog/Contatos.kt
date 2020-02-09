package pck.dev.apd.tp1prog

import java.io.File
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class Contatos {

    var nomeArq = "contato"

    var nome: String = ""
    var telefone: String = ""
    var email: String = ""
    var cidade: String = ""

    constructor(nome: String, telefone: String, email: String, cidade: String) {
        this.nome = nome
        this.telefone = telefone
        this.email = email
        this.cidade = cidade

    }

    fun salvarContato(){
        val file = File("/data/user/0/pck.dev.apd.tp1prog/files", nomeArq)
        var contato= this.nome+","+this.telefone+","+this.email+","+this.cidade+"\n"
        file.appendText(contato)

    }
    fun ListarContatos(){

    }

}