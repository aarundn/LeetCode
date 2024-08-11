package LeetCodeKotlin

import java.util.*
import kotlin.collections.ArrayDeque

class Solution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 != 0) return false

        val stack = Stack<Char>()

        for (char in s) {
            when (char) {
                '(', '[', '{' -> stack.push(char)
                ')' -> if (stack.isEmpty() || stack.pop() != '(') return false
                ']' -> if (stack.isEmpty() || stack.pop() != '[') return false
                '}' -> if (stack.isEmpty() || stack.pop() != '{') return false
                else -> return false
            }
        }

        return stack.isEmpty()
    }
}

fun main() {
    val solution = Solution()
    println(solution.isValid("()"))
    println(solution.isValid("()[]{}"))
    println(solution.isValid("(]"))
    println(solution.isValid("([)]"))
    println(solution.isValid("{[]}"))
}