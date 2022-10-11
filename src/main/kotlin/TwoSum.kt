/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
class TwoSum {
    fun solution(nums: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { idx, item ->
            val found = map[target - item]
            found?.let {
                return intArrayOf(found, idx)
            }
            map[item] = idx
        }
        throw IllegalArgumentException("No solution")
    }

    fun solutionWithBruteForce(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        throw IllegalArgumentException("No solution")
    }
}