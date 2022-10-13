import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LongestPalindromicSubstringTest {
    @Test
    fun testLongestPalindromicSubstring() {
        val palindrom = LongestPalindromicSubstring().solution("babad")
        assertEquals("bab", palindrom)
    }
}