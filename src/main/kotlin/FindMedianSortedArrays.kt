/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
 */
class FindMedianSortedArrays {
    fun solution(nums1: IntArray, nums2: IntArray): Double {
        val merged = nums1.plus(nums2).sortedArray()
        return if (merged.size % 2 == 0)
            (merged[merged.size/2] + merged[merged.size/2 - 1])/2.0
        else
            merged[merged.size/2].toDouble()
    }
}