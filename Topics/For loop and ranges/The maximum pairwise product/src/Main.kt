fun main() {
    val times: Int = readln().toInt()
    var product: Int = 0
    if (times > 1) {
        var max: Int = 0
        var secondMax: Int = 0
        for (index in 1..times) {
            val value: Int = readln().toInt()
            if (value > max && max >= secondMax) {
                secondMax = max
                max = value
            } else if (value > secondMax) {
                secondMax = value
            }
        }
        product = secondMax * max
    } else {
        product = readln().toInt()
    }
    println(product)
}