import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ZigzagConversionTest {

    @Test
    fun testZigzagConversion() {
        assertEquals("PAHNAPLSIIGYIR",  ZigzagConversion().solution("PAYPALISHIRING", 3))
    }
}