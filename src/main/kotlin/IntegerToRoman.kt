class IntegerToRoman {

    fun solution(num: Int): String {
        var rest = num
        var romanNum = ""

        for (item in romanNumbers) {
            val multi = rest / item.second
            romanNum += item.first.repeat(multi)
            rest %= item.second
        }
        return romanNum
    }

    private val romanNumbers = mapOf(
        "M" to 1000,
        "CM" to 900,
        "D" to 500,
        "CD" to 400,
        "C" to 100,
        "XC" to 90,
        "L" to 50,
        "XL" to 40,
        "X" to 10,
        "IX" to 9,
        "V" to 5,
        "IV" to 4,
        "I" to 1
    ).toList()
}