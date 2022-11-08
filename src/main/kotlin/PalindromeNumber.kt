class PalindromeNumber {
    fun solution(x: Int): Boolean {
        if(x < 0) { return false }

        var num = x
        var reversedInteger = 0
        while (num != 0) {
            reversedInteger = reversedInteger * 10 + (num % 10)
            num /= 10
        }
        return x == reversedInteger
    }
}