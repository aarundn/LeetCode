package LeetCodeKotlin

fun searchInsert(nums: IntArray, target: Int): Int {
    var i = 0
    if (nums.size <= 2 && target > nums[0]){
            i = 1
    } else {
        for (j in 0 until nums.size - 1) {

            if (target > nums[j] && target < nums[j + 1]) {
                i = j + 1
            } else if (target == nums[j]) {
                i = j
            } else if (target > nums[j + 1]) {
                i = nums.size
            }
        }
    }


    return i
}

fun main() {
    println(searchInsert(intArrayOf(1,3), 4))
}