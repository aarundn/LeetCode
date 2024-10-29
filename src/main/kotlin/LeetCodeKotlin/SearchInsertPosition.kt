package LeetCodeKotlin

fun searchInsert(nums: IntArray, target: Int): Int {
    nums.forEachIndexed { index, value ->
        if (value == target) {
            return index
        } else if (value > target) {

            return index
        }
    }
    return nums.size
}

fun searchInsert1(nums: IntArray, target: Int): Int {

        for (j in nums.indices) {

            if (target < nums[j]){
                return j
            } else if (target == nums[j]) {
                return j
        }

        }
    return nums.size
}

fun main() {
    println(searchInsert1(intArrayOf(1,3), 0))
    println(searchInsert(intArrayOf(1,3), 0))
}