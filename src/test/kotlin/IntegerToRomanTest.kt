import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class IntegerToRomanTest {
    @Test
    fun testIntegerToRoman() {
        assertEquals("III", IntegerToRoman().solution(3))
        assertEquals("LVIII", IntegerToRoman().solution(58))
        assertEquals("MCMXCIV", IntegerToRoman().solution(1994))
    }
}