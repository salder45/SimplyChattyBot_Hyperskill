fun main() {
    val line: String = readln()
    val number: Int = readln().toInt()
    println("Symbol # $number of the string \"$line\" is \'${line[number - 1]}\'")
}