package LeetCodeKotlin

fun isPalindrome(x: Int): Boolean {
    var arr = mutableListOf<Int>()
    if (x < 0) return false
    var i: Int = 0
    var y = x

    while (y != 0)
    {
        arr.add(y%10)
        y /= 10
    }
    var left = arr.size -1
    var right = 0
    while (left - right >= 0){
        if (arr[left] != arr[right]) return false
        left--
        right++
    }
    return true
}
fun main() {
    println(isPalindrome(11))

}