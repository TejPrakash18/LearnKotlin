package ObjectOrientedProgramming.Inheritance

open class Parent{
    open fun eat(){
        println("Eatinggg.......")
    }
}

class Child : Parent(){
    override fun eat(){
        println("Eating.....")
    }
}

fun main(){
 val obj = Child()
    obj.eat();
}
