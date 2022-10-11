/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
class AddTwoNumbers {
    fun solution(l1: ListNode?, l2: ListNode?): ListNode? {
        if(l1 == null || l2 == null)
            return null

        var value = l1.`val` + l2.`val`
        val extra = if(value > 9) 1 else 0
        value %= 10

        val listNode = ListNode(value)
        return if (l1.next != null && l2.next != null) {
            l2.next!!.`val` += extra
            listNode.next = solution(l1.next, l2.next)
            listNode
        } else if(extra != 0 && l1.next == null && l2.next == null) {
            l1.next = ListNode(0 + extra)
            l2.next = ListNode(0)
            listNode.next = solution(l1.next, l2.next)
            listNode
        } else if(l1.next == null) {
            l1.next = ListNode(0 + extra)
            listNode.next = solution(l1.next, l2.next)
            listNode
        } else if(l2.next == null) {
            l2.next = ListNode(0 + extra)
            listNode.next = solution(l1.next, l2.next)
            listNode
        } else {
            listNode
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}