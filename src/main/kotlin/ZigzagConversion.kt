/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
*/
class ZigzagConversion {
    fun solution(s: String, numRows: Int): String {
        if (numRows <= 0) return ""

        if (numRows == 1) return s

        val result = StringBuilder()
        val step = 2 * numRows - 2

        for (i in 0 until numRows) {
            var j = i
            while (j < s.length) {
                result.append(s[j])
                if (i != 0 && i != numRows - 1 && j + step - 2 * i < s.length) {
                    result.append(s[j + step - 2 * i])
                }
                j += step
            }
        }
        return result.toString()
    }
}