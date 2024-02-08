fun main(){
    comperisionOperators();

}

fun comperisionOperators(){
    val numOne = 20;
    val numTwo = 10;
    val numThree = 10;
    
    print("EqualTo => ")
    val res = (numTwo == numThree)
    println(res)

    print("Not Equal To => ")
    val res1 = (numOne == numThree)
    println(res1)
    print(" Greater then ")
    val res2 = (numTwo > numThree)
    println(res2)
    print("Less then => ")
    val res3 = (numTwo < numOne)
    println(res3)
    print("less then EqualTo => ")
    val res4 = (numTwo >= numThree)
    println(res4)

    print("greter then EqualTo => ")
    val res5 = (numTwo == numThree)
    println(res5)
}