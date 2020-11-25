package ise308.unver.aysebahar.homework2

open class Animal(name: String, age: Int, colour: String) {

    var name : String? = name
        private set
        get

    var age : Int? = age
        get
        private set

    open var colour : String? = "White"

    open var num: Int = 100

    private val cellType : String = "MAnimals are multicellular creatures."

    fun returncellType(password: String) : String{
        if(password == "Bahar"){
            return cellType
        }
        else{
            return "Wrong password!"
        }
    }

    init {
        println("Name is: $name")
        println("Color is: $colour")
        println("Age is: $age")
    }

    open fun classificationOfAnimals(){
        println("The animal kingdom")
    }

    open fun _class(){
        println("Parent class")
    }

}