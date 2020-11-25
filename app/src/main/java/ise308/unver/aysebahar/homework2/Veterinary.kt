package ise308.unver.aysebahar.homework2

class Veterinary {


    var name : String? = null
    var age : Int? = null


    constructor(nameInput:String, ageInput:Int){
        this.name = nameInput
        this.age = ageInput
        println("Veterinary created")
    }

    init{
        println("İnit")
    }

}