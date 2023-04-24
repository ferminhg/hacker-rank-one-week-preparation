
fun MockTest(): Unit {

}

fun findMedian(arr: Array<Int>): Int {
    arr.sort()
    return(arr[arr.size/2])
}