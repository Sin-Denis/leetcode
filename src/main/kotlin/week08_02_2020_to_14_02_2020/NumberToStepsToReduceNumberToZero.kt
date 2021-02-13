package week08_02_2020_to_14_02_2020

fun numberOfStep(num: Int): Int {
    var n = num
    var res = 0
    while (n != 0) {
        if (n % 2 == 0) n /= 2 else n--
        ++res
    }
    return res
}

fun main() {
    println(numberOfStep(8))
}