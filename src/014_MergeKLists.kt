/*
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
Example:
Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */




fun mergeKLists(lists: Array<ListNode?>): ListNode? {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) return l2
        if (l2 == null) return l1
        if (l1.`val` < l2.`val`) {
            l1.next = mergeTwoLists(l1.next, l2)
            return l1
        } else {
            l2.next = mergeTwoLists(l1, l2.next)
            return l2
        }
    }

    var l0 = lists[0]
    var lResult:ListNode? = ListNode(0)

    for (k in 1..lists.size -1) {
        lResult = mergeTwoLists(l0, lists[k])
    }
    return lResult?.next
}