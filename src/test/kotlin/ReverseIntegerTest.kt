import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ReverseIntegerTest {
    @Test
    fun testReverseInteger() {
        val reversedInt01 = ReverseInteger().solution(1534236469)
        val reversedInt02 = ReverseInteger().solution(1234)
        assertEquals(0, reversedInt01)
        assertEquals(4321, reversedInt02)
    }
}