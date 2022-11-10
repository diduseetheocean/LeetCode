import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LongestCommonPrefixTest {

    @Test
    fun testLongestCommonPrefix() {
        assertEquals(
            "fl",
            LongestCommonPrefix().solution(
                arrayOf("flower","flow","flight")
            )
        )
        assertEquals(
            "",
            LongestCommonPrefix().solution(
                arrayOf("dog","racecar","car")
            )
        )
    }
}