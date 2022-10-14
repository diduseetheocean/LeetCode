/*
Given a string s, return the longest palindromic substring in s.

A string is called a palindrome string if the reverse of that string is the same as the original string.
 */
class LongestPalindromicSubstring {
    fun solution(s: String): String {
        var longestPalindrome = ""
        for (i in 0 until s.length) {
            for (j in s.length downTo i + 1) {
                val curSubstring = s.substring(i, j)
                if (StringBuilder(curSubstring).reverse().toString() == curSubstring)
                     if(curSubstring.length > longestPalindrome.length) longestPalindrome = curSubstring
            }
        }
        return longestPalindrome
    }

    /*
    https://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
     */
    fun solutionDynamic(s: String): String {
        return if (s.length <= 1) s
        else longestPalindromeDp(s, 0, s.length - 1, Array(s.length) {
            Array<String?>(s.length) {
                null
            }
        })
    }

    private fun longestPalindromeDp(s: String, i: Int, j: Int, map: Array<Array<String?>>): String {
        return map[i][j] ?: run {
            map[i][j] = when {
                i > j -> ""
                i == j -> s[i].toString()
                else -> {
                    if ((s[i] == s[j]) && longestPalindromeDp(s, i + 1, j - 1, map).length == j - 1 - i) {
                        s.substring(i, j + 1)
                    } else {
                        val s1 = longestPalindromeDp(s, i + 1, j, map)
                        val s2 = longestPalindromeDp(s, i, j - 1, map)
                        if (s1.length > s2.length) s1 else s2
                    }
                }
            }
            return map[i][j]!!
        }
    }
}