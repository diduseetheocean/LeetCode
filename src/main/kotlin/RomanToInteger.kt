class RomanToInteger {

    fun solution(s: String): Int {
        val reverseString = s.reversed()
        var result = 0
        var previousChar = 0
        for(ch in reverseString){
            var currentValue = 0
            when(ch){
                'I' -> currentValue = 1
                'V' -> currentValue = 5
                'X' -> currentValue = 10
                'L' -> currentValue = 50
                'C' -> currentValue = 100
                'D' -> currentValue = 500
                'M' -> currentValue = 1000
            }
            result = if(previousChar > currentValue){
                result - currentValue
            }else{
                result + currentValue
            }
            previousChar = currentValue
        }
        return result
    }
}