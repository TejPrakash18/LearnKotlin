package ClassesAndObjects

class Classes{
    var name:String ="";

    fun namePrint():String{
        name = "Tej"
        return name
    }

    fun namePrint1(name:String):String{
        this.name= name
        return name
    }

    constructor(name:String){
        this.name = name
        println(this.name)
    }
}
fun main(){
    val name = Classes("TP")
    val result:String = name.namePrint();
    println(result)
    val result1:String = name.namePrint1("Neha");
    println(result1)

}