import java.io.StringBufferInputStream
import java.util.*
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main(args: Array<String>) {

    //задание 1
    val myAge: Int = 18
    val isTeenager:Boolean = 13 <= myAge && myAge <= 19
    println(isTeenager)
    //задание 2
    val myAge: Int = 18
    val theirAge:Int = 30
    val bothTeenagers:Boolean = 13 <= myAge && myAge <= 19 && 13 <= theirAge && theirAge <= 19
    println(bothTeenagers)
    //задание 3
    val reader:String = "Timur"
    val author:String = "Richard Lucas"
    val authorIsReader = reader == author
    println(authorIsReader)
    //задание 4
    val reader:String = "Timur"
    val author:String = "Richard Lucas"
    val readerBeforeAuthor = author > reader
    println(readerBeforeAuthor)
    //задание 5
    val myAge2: Int = 18
    if (13 <= myAge2 && myAge2 <= 19)
    {
        println("Подросток")
    }
    else
        println("Не подросток")
    //6 задача
    val myAge2: Int = 18
    val answer = if (13 <= myAge2 && myAge2 <= 19)
        println ("Подросток")
    else
        println("Не подросток")
    //задание 7
    var counter:Int = 0
    while (counter < 10)
    {
        var x:Int = counter
        counter++
        println(x)
    }
    //задание 8
    var counter:Int = 0
    var roll:Int = 0
    do {
        roll = Random().nextInt(6)
        counter++
        println("После $counter бросков, roll равен $roll")
    } while (counter < 0)
    //9 задача
    val range = Random().nextInt(10)
    val count = 10
    var sum:Int = 0
    for (range in range..count) {
        println("range =$range")
        sum = range*range
        println(sum)
    }