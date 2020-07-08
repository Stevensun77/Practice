package homework
import java.util.*

fun main() {

    var scanner = Scanner(System.`in`)

    var listYear = listOf<Int>().toMutableList()
    print("Please enter star year:")
    var starYear = scanner.nextInt()

    print("Please enter end year:")
    var endYear = scanner.nextInt()


    println("請輸入年分判斷是否為閏年: ")

    for (i in starYear..endYear) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
//            println("西元${i}年為閏年!")
            listYear.add(i)
        }
//        else {
//            println("西元${i}年不是閏年!")
//        }
    }
    println("你輸入的區間閏年為:"+listYear)


}
//-------------------------------------------------------------------------------


//fun autoFill(): Int {
//    var number = 0
//    var i = 1
//    while (i < 21)
//    if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
//        i += 1
//    }
//    return number
//}
//
//fun checkYear(number : Int) {
//    if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
//
//    }
//}
//
//fun ifYear() {
//    var number = 0
//    var year = listOf<Int> ().toMutableList()
//    for ()
//    if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0)
//
//}



