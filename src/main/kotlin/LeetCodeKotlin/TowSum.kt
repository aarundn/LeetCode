package LeetCodeKotlin




    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in  nums.indices) {
            for (j in i+1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }


fun main() {
    val k = twoSum(intArrayOf(1,2,4,8),3).size
    for (i in 0 until k){
        println(twoSum(intArrayOf(4,2,5,1),3)[i])
    }

}


