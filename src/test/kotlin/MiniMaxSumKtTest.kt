import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MiniMaxSumKtTest {

    @Test
    fun miniMaxSum() {
//        miniMaxSum(arrayOf(1, 3, 5, 7, 9))
//        miniMaxSum(arrayOf(1, 2, 3, 4, 5))
//        miniMaxSum(arrayOf(1, 1, 1, 1, 1))

        kotlin.test.assertEquals("2063136757 2744467344",
            miniMaxSum(arrayOf(256741038, 623958417, 467905213, 714532089, 938071625))
        )
    }
}