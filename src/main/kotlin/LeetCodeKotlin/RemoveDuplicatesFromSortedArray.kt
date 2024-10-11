package LeetCodeKotlin

fun removeDuplicates(nums: IntArray): Int {

        var j = 0

        for(i in 1 until nums.size) {
            if(nums[j] != nums[i]) {
                j++
                nums[j] = nums[i]
            }
        }
        return j + 1
}

fun main() {
    val size = removeDuplicates(intArrayOf(1,1,1,2,2,2,3,3,3))
    println(size)
}