/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */
fun plusMinus(arr: Array<Int>): Unit {
    val size = arr.size.toDouble()
    arrayOf(
        arr.count { it > 0 }.toDouble() / size,
        arr.count { it < 0 }.toDouble() / size,
        arr.count { it == 0 }.toDouble() / size
    ).forEach { println("%.6f".format(it)) }
}