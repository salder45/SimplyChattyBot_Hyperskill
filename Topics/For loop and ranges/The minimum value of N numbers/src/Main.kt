fun main() {
    val n: Int = readln().toInt()
    var min: Int = readln().toInt()
    for (index in 2..n) {
        val number: Int = readln().toInt()
        if (number < min) {
            min = number
        }
    }
    println(min)
}