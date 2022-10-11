/*
Given a string s, find the length of the longest substring without repeating characters.
 */
class LongestSubstringWithoutRepeatingChars {
    fun solution(s: String): Int {
        var tempMap = mutableMapOf<Char, Int>()
        var currentBestMatch = 0
        var start = 0

        s.toCharArray().forEachIndexed { index, c ->
            if(tempMap.contains(c)) {
                val seekPoint = tempMap[c]!! + 1
                start = Math.max(seekPoint, start)
            }
            val length = index - start + 1
            currentBestMatch = Math.max(length, currentBestMatch)
            tempMap[c] = index
        }
        return currentBestMatch
    }
}