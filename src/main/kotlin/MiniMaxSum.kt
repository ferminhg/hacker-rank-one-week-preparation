fun miniMaxSum(arr: Array<Int>): String {
    val sum = arr.map { it.toLong() }.sum()
    var max: Long = 0
    var min: Long = sum
    arr.forEach { item ->
        if ((sum - item) > max)  max = sum - item
        if ((sum - item) < min)  min = sum - item
    }
    return "${min} ${max}"
}
