package Fonksiyonlar

fun main(): Unit{

    val squareValue2 = takeSquare(2)
    val squareValue3 = takeSquare(3)
    println(squareValue3)

    reformatMessage("Message" , true,7, "tr")

    reformatMessage("Message" , size = 7 , lang = "tr")

    reformatMessage("Message" , true, 7)

    reformatMessage("Message : " , size = 7)


}

fun takeSquare(number: Int): Int{


    return number * number
}
fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String ="tr"){
    println("Message : " + message + "isUpperCase : " + isUpperCase + "Size : " + size + "lang : " + lang)
}