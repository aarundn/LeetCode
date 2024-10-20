package LeetCodeKotlin

fun removeElement(nums: IntArray, int: Int): Int {
    var j = 0
    for (i in 0  until nums.size) {
        if (nums[i] != int) {
            nums[j] = nums[i]
            j++
        }
    }
    return j
}

fun main(){
    println(removeElement(intArrayOf(1,1,2,3),1))
}