import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TimeConversionTest {
    @Test
    fun simpleTest() {
        assertEquals("12:01:00", timeConversion("12:01:00PM"))
        assertEquals("00:01:00", timeConversion("12:01:00AM"))
        assertEquals("19:05:45", timeConversion("07:05:45PM"))
    }
}