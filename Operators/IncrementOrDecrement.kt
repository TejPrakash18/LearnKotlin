fun main(){

    postIncrement()
    preIncrement()

    postDecrement()
    preDecrement()
}

fun postIncrement(){
    print("PostIncrement ")
    var x = 5;
    x++
    println(x)
}

fun preIncrement(){
    print("PreIncrement ")
    var x = 5;
    ++x
    println(x)
}

fun postDecrement(){
    print("PostIncrement ")
    var x = 5;
    x--
    println(x)
}

fun preDecrement(){
    print("PostIncrement ")
    var x = 5;
    --x
    println(x)
}

