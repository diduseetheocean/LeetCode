import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LongestPalindromicSubstringTest {
    @Test
    fun testLongestPalindromicSubstring() {
        val palindrome = LongestPalindromicSubstring().solution("babad")
        assertEquals("bab", palindrome)
    }

    @Test
    fun testLongestPalindromicSubstringDynamicSolution() {
        val palindrome = LongestPalindromicSubstring().solutionDynamic("orgeeksskeegfor")
        assertEquals("geeksskeeg", palindrome)
    }
}