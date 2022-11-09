class ContainerWithMostWater {
    fun solution(height: IntArray): Int {
        var leftNum : Int
        var rightNum : Int
        var currentMaxSum = 0

        for((index, value) in height.withIndex()) {
            leftNum = value
            for(i in index + 1 until height.size) {
                rightNum = height[i]
                val newMaxSum = Math.min(leftNum, rightNum) * (i - index)
                currentMaxSum = Math.max(currentMaxSum, newMaxSum)
            }
        }
        return currentMaxSum
    }
}