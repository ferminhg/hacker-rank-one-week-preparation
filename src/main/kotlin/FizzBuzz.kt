fun fizzBuzz(n: Int): Unit {
    require(n > 0) { "n debe ser un número positivo" }
    (1..n).forEach {
        val output = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        println(output)
    }
}
