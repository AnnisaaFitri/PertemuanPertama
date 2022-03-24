fun main(args: Array<String>) {
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //konversi implisit
    println("konversi variable valInt secara implist : " +valSum)
    val valLong: Long = valInt.toLong() // konversi eksplisit
    println("konversi variable valInt secara eksplisit : " + valLong)
}