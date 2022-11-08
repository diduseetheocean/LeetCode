import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

internal class PalindromeNumberTest {
    @Test
    fun testPalindromeNumber() {
        assertTrue(PalindromeNumber().solution(121))
        assertTrue(PalindromeNumber().solution(0))
        assertFalse(PalindromeNumber().solution(-121))
        assertFalse(PalindromeNumber().solution(10))
    }
}