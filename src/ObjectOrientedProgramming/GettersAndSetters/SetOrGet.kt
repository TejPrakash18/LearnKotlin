package ObjectOrientedProgramming.GettersAndSetters

class Person(val name:String){
    val upparCaseName:String
        get() = name.toUpperCase()
}

class Persion1{
     var name:String =""
        get() = field
        set(value){
            field = value.plus(" Upadhyay")
        }

     var age:Int=0
         get() = field
         set(value) {
             if (value > 0){
                 field = value
             }
             else{
                 println("Invalid")
             }
         }

}
fun main(){
    val c = Person("tej")
    println(c.upparCaseName)

    val obj = Persion1()
    obj.name = "Tej"
    println(obj.name)
    obj.age =21
    print(obj.age)

}