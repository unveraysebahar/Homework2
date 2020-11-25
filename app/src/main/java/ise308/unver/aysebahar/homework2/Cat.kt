package ise308.unver.aysebahar.homework2

class Cat(name: String, age: Int, colour: String) : Animal(name, age, colour) {

    fun test(){
        super.classificationOfAnimals()
    }

    fun meow() {
        println("Cat makes sound of meow")
    }

    override var colour: String? = "Black"

    override fun classificationOfAnimals()
    {
        println("Vertebrate")
    }

    override fun _class() {
        super._class()
        println("Child class")
    }

    fun num(){
        println(super.num)
    }

}