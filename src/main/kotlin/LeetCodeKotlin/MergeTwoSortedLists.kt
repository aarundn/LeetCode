package LeetCodeKotlin

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null) return list2
    if (list2 == null) return list1
    var l1 = list1
    var l2 = list2
    val list = ListNode(0)
    var current: ListNode = list
    while (l1 != null && l2 != null){
        if (l1.value <= l2.value){
            current.next = l1
            l1 = l1.next
        } else {
            current.next = l2
            l2 = l2.next
        }
        current = current.next!!
    }
    current.next = l1 ?: l2
    return list.next
}


class ListNode(var value: Int) {
    var next: ListNode? = null
}
fun main() {
    val l1 = ListNode(1)
    l1.next = ListNode(3)
    l1.next?.next = ListNode(5)

    val l2 = ListNode(2)
    l2.next = ListNode(4)
    l2.next?.next = ListNode(6)

    val mergedList = mergeTwoLists(l1, l2)

    var current = mergedList
    while (current != null) {
        print("${current.value} ")
        current = current.next
    }
}
