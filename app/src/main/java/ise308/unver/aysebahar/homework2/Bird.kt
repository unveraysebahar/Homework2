package ise308.unver.aysebahar.homework2

class Bird(name: String, age: Int, colour: String) : Animal(name, age, colour) {

    fun test(){
        super.classificationOfAnimals()
    }

    fun chirp() {
        println("Bird makes sound of chirp")
    }

    override fun classificationOfAnimals()
    {
        println("Vertebrate")
    }

    override var num: Int  = 101

    override fun _class() {
        super._class()
        println("Child class")
    }

    fun num(){
        println(super.num)
    }

}