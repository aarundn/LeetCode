package LeetCodeKotlin




fun lengthOfLastWord(s: String): Int {
   return s.trimEnd().substringAfterLast(" ").length
}
fun main() {
    println(lengthOfLastWord("luffy is still joyboy"))
}