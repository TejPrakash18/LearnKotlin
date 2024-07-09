package ClassesAndObjects

fun main(){

//    val obj =  Constants();
    println(Constants.TIMEOUT_DURATION)
    println(Constants.BASE_URL)

}

class Constants{
    companion object {
        const val BASE_URL = "https://api.example.com/"
        const val TIMEOUT_DURATION = 30L
    }
}