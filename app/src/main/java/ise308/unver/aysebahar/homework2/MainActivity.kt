package ise308.unver.aysebahar.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vet = Veterinary(nameInput = "Şevval", ageInput = 50)
        // vet.age = 25
        // vet.name = "Ayşe"
        // vet.name = "Emel"
        // vet.age = 60

        println(vet.age.toString())
        println(vet.name)

        var an= Animal(name = "Kola", age = 55, colour = "Grey")
        println(an.age.toString())
        println(an.returncellType(password = "Ayşe"))
        println(an.returncellType(password = "Bahar"))

        var num = NumberOfAnimals()
        println(num.sum())
        println(num.sum(x = 3, y = 4))
        println(num.sum(x = 3, y = 4, z = 5))

        val d = Dog(name = "Gazoz", age = 4, colour =  "Black")
        d.woof()
        d.classificationOfAnimals()
        println("${d.colour}")
        d._class()
        d.num()

        val c = Cat(name = "Haziran", age = 1, colour = "White")
        c.meow()
        c.classificationOfAnimals()
        println("${c.colour}")
        c._class()
        c.num()

    }
}