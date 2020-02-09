package pck.dev.apd.tp1prog

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_context.*
import java.io.BufferedReader
import java.io.FileReader


class Context : AppCompatActivity() {
    var nomeArq = "contato"
    var lista_contato : MutableList<String> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)

        if(lista_contato.toString()=="[]"){
            Toast.makeText(this,  "Lista Vazia", Toast.LENGTH_LONG).show()
            textView.text="lista vazia"

        }else{
            textView.text=lista_contato.toString()

        }
        var result: String? = ""
        var line: String? = ""
        var fileReader = FileReader("/data/user/0/pck.dev.apd.tp1prog/files/contato");
        val reader = BufferedReader(fileReader)
        while (reader.readLine().also { line = it } != null) {
            result += line
            lista_contato.add(line.toString())
        }

        System.out.println(lista_contato.toString())


    }
}
