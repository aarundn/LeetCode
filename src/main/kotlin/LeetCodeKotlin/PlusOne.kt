package LeetCodeKotlin

fun plusOne(digits: IntArray): IntArray {

    for (i in 0 until  digits.size){
        if (digits.lastIndex == i){
            if (digits[i] > 9){

            }
            digits[i] = digits[i] + 1
        }
    }
    return digits
}


fun main() {
    println(plusOne(intArrayOf(1,2,3)).contentToString())
    println(plusOne(intArrayOf(4,3,2,1)).contentToString())
    println(plusOne(intArrayOf(9)).contentToString())
}