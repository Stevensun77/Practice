package homework

import java.util.*
import kotlin.random.Random

fun main() {
    var scanner = Scanner(System.`in`)
    var number = 0

    while (number != -1) {
    print("請輸入年分判斷是否為閏年(輸入-1離開程式): ")
    var num = scanner.nextInt()
        if (num % 4 == 0 && num % 100 != 0) {
            println("西元${num}年為閏年!")
        } else if (number % 400 == 0) {
            println("西元${num}年為閏年!")
        } else {
            println("西元${num}年不是閏年!")
        }
        number = num
    }

    println("謝謝使用!")

}
