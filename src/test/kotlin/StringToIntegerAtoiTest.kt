import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StringToIntegerAtoiTest {
    @Test
    fun testStringToIntegerAtoi() {
        assertEquals(4193, StringToIntegerAtoi().solution("4193 with words"))
        assertEquals(42, StringToIntegerAtoi().solution("42"))
        assertEquals(-42, StringToIntegerAtoi().solution("    -42"))
        assertEquals(0, StringToIntegerAtoi().solution("word and 987"))
    }
}