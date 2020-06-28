package homework

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
//    var number = 0
    while (true) {
//    while (number != -1) {
        print("請輸入年分判斷是否為閏年(輸入-1離開程式): ")
        var number = scanner.nextInt()
        if (number == -1) {
            break
        } else
        if (number % 4 == 0 && number % 100 != 0 ) {
            println("此年為閏年!")
        } else if (number % 400 == 0) {
            println("此年為閏年!")
        } else {
            println("此年不是閏年!")
        }
//        else if (number % 4 != 0 || number % 400 != 0) {
//            println("此年不是閏年!")
//        }
    }
    println("謝謝使用!")
}