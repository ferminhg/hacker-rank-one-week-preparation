import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MockTestTest {

    @Test
    fun simpleTest() {
        assertEquals(3, findMedian(arrayOf(0, 1, 2, 4, 6, 5, 3)))
        assertEquals(0, findMedian(arrayOf(0)))
    }
}