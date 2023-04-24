import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import java.text.DecimalFormat

class PlusMinusTest {
    @Test
    fun `first example test`() {
        val values: Array<Int> = arrayOf(1, 1, 0, -1, -1)
        val result = plusMinus(values)
        val expected = arrayOf("0.400000", "0.400000", "0.200000")
    }

    @Test
    fun `second example test`() {
        val values: Array<Int> = arrayOf(-4, 3, -9, 0, 4, 1)
        val result = plusMinus(values)
        val expected = arrayOf("0.500000", "0.333333", "0.166667")
    }
}