package LeetCodeKotlin


fun plusOne(digits: IntArray): IntArray{
    for (i in digits.indices.reversed()) {
        digits[i] += 1
        if (digits[i] < 10) {
            return digits
        }
        digits[i] = 0
    }
    return intArrayOf(1) + digits
}

fun main() {
    println(plusOne(intArrayOf(1,2,3)).contentToString()) // [1, 2, 4]
    println(plusOne(intArrayOf(4,3,2,1)).contentToString()) // [4, 3, 2, 2]
    println(plusOne(intArrayOf(9)).contentToString()) // [1, 0]
    println(plusOne(intArrayOf(9,9)).contentToString()) // [1, 0, 0]
}