class ReverseInteger {
    fun solution(x: Int): Int {
        var num = x
        var reversed : Long = 0

        while (num != 0) {
            val digit = num % 10
            reversed = reversed * 10 + digit
            num /= 10
        }
        return if (reversed > Int.MAX_VALUE || reversed < Int.MIN_VALUE) 0 else reversed.toInt()
    }
}