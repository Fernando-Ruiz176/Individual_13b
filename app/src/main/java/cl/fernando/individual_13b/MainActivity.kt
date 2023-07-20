package cl.fernando.individual_13b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

data class heroe(
    val superHero: String,
    val publisher: String,
    val realName: String,
    val photo: String
)

fun main(){
    var cant: Int = 1
    var heroes = mutableListOf<heroe>()

    while (cant == 1) {
        print("Nombre: ")
        var nombre = readln()
        print("Publisher: ")
        var publisher = readln()
        print("Nombre real: ")
        var realName = readln()
        print("Foto: ")
        var photo = readln()

        heroes.add(heroe(nombre, publisher, realName, photo)) //i = i.inc() // O se puede hacer con i++
        print("Ingrese 1 para seguir: ")
        cant = readln().toInt()
    }

    for (h in heroes){
        println(h)
    }

}