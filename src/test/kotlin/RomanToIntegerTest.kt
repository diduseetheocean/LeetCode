import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RomanToIntegerTest {

    @Test
    fun testRomanToInteger() {
        assertEquals(3, RomanToInteger().solution("III"))
        assertEquals(58, RomanToInteger().solution("LVIII"))
        assertEquals(1994, RomanToInteger().solution("MCMXCIV"))
    }
}