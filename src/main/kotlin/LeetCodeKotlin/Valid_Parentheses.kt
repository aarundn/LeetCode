package LeetCodeKotlin

class Solution {
    fun isValid(s: String): Boolean {
        for(i in 0.. s.length){
            if (i < s.lastIndex){
                if (s[0].equals(s[i]) && s[0] == s[s.lastIndex]){
                    return true
                }
            }
        }
        return false
    }
}
fun main() {
    val solution = Solution()
    var valid = solution.isValid("()")
    println( valid)


}