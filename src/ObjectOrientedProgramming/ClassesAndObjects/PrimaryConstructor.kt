package ObjectOrientedProgramming.ClassesAndObjects

class PrimaryConstructor(val name:String, val age:Int) {
    fun sayHello(){
        println("Hey my name is $name & age $age ")
    }

}

fun main(){
    val person =  PrimaryConstructor("Tej", 21);
    person.sayHello()
}