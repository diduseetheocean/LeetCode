/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */

class LongestCommonPrefix {

    fun solution(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        var res = ""
        for (j in 0 until strs[0].length) {
            val char = strs[0][j]
            for (i in 1 until strs.size) {
                if (j >= strs[i].length || strs[i][j] != char) return res
            }
            res += char
        }
        return res
    }
}