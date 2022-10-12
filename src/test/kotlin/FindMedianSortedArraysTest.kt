import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FindMedianSortedArraysTest {
    @Test
    fun testFindMedianSortedArrays() {
        val median = FindMedianSortedArrays().solution(intArrayOf(1,3), intArrayOf(2,7))
        assertEquals(2.5, median)
    }
}