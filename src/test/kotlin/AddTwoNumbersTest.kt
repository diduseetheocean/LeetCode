import AddTwoNumbers.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AddTwoNumbersTest {
    @Test
    fun testAddTwoNumbers() {
        val listNode01 = ListNode(2).apply { next = ListNode(4).apply { next = ListNode(3) }}
        val listNode02 = ListNode(5).apply { next = ListNode(6).apply { next = ListNode(4) }}

        val listNode = AddTwoNumbers().solution(listNode01, listNode02)
        assertEquals(7,  listNode?.`val`)
        assertEquals(0,  listNode?.next?.`val`)
        assertEquals(8,  listNode?.next?.next?.`val`)
    }
}