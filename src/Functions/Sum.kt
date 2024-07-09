package Functions

fun main(){
    val sum = sum(3,4);
    println(sum)
    val mul = mul(3,4)
    println(mul)

}

fun sum(a:Int, b:Int):Int{
    var add = a+b;
    return add
}

fun mul(a:Int, b:Int):Int{
    var mul = a.times(b)
    return mul
}

//higher order function
