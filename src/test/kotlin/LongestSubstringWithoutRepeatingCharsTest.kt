
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LongestSubstringWithoutRepeatingCharsTest {
    @Test
    fun testLongestSubstringWithoutRepeatingChars() {
        assertEquals(3,  LongestSubstringWithoutRepeatingChars().solution("abcabcbb"))
        assertEquals(1,  LongestSubstringWithoutRepeatingChars().solution("bbbbb"))
        assertEquals(3,  LongestSubstringWithoutRepeatingChars().solution("pwwkew"))
        assertEquals(1,  LongestSubstringWithoutRepeatingChars().solution(" "))
        assertEquals(3,  LongestSubstringWithoutRepeatingChars().solution("dvdf"))
        assertEquals(3,  LongestSubstringWithoutRepeatingChars().solution("abcabcbb"))
    }
}