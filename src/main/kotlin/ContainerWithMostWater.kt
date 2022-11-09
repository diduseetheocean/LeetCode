class ContainerWithMostWater {
    fun solution(height: IntArray): Int {
        var leftNum = 0
        var currentMaxSum = 0

        for((index, value) in height.withIndex()) {
            if(value > leftNum) leftNum = value else continue
            for(i in index + 1 until height.size) {
                val rightNum = height[i]
                val newMaxSum = leftNum.coerceAtMost(rightNum) * (i - index)
                currentMaxSum = currentMaxSum.coerceAtLeast(newMaxSum)
            }
        }
        return currentMaxSum
    }
}