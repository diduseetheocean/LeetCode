import java.math.BigInteger

class StringToIntegerAtoi  {
    fun solution(s: String): Int {
        if (s.isBlank()) return 0
        val start = s.substring(s.indexOfFirst { pre -> !pre.isWhitespace() }, s.length)
        val substr = start.substring(0, findEnd2(start))

        val bigVal = if (substr.isNotEmpty() && substr != "-" && substr != "+") BigInteger(substr) else BigInteger("0")

        if (bigVal > BigInteger(Integer.MAX_VALUE.toString())) return Integer.MAX_VALUE
        if (bigVal < BigInteger(Integer.MIN_VALUE.toString())) return Integer.MIN_VALUE
        return bigVal.toInt()
    }

    fun findEnd(str: String): Int {
        return str.indexOfLast { pre -> !pre.isDigit() } - 1
    }

    fun findEnd2(str: String): Int {
        str.forEachIndexed { index, c ->
            if (!c.isDigit() && !((c == '-' || c == '+') && index == 0)) {
                return index
            }
        }
        return str.length
    }
}