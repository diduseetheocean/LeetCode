import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ContainerWithMostWaterTest {
    @Test
    fun testContainerWithMostWater() {
        assertEquals(49,
            ContainerWithMostWater().solution(
                intArrayOf(1,8,6,2,5,4,8,3,7)
            )
        )
    }
}