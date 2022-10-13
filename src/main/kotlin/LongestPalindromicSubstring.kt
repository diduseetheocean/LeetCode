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
}