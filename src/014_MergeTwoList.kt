import java.util.*
import java.util.LinkedList
/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
Example:
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 *
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    }

//l1 = LinkedList(intArrayOf(1, 4))
//LinkedList l1 = new LinkedList(new int[]{1, 2, 4});
//var l1 = LinkedList(intArrayOf(1, 2, 4))
//var l1 = ListNode(5)
//var v1 = l1.`val`
//var l2 = ListNode(10)
//var v2 = l1.`val`



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
//fun mergeLists(l3: ListNode?, l4: ListNode?): ListNode? {
//    return listOf(l3 , l4).firstOrNull()
//}



fun main() {
//    var list1: List<Int> = listOf(1, 3, 5)
//    var list2: List<Int> = listOf(1, 2, 3, 5, 7)
//    var list3 = ListNode(5)
//    var list4 = ListNode(10)
    
    
//
//
//
////    var v = list3.`val`
////    println("${(list1 + list2).sorted()}")
//    println((mergeTwoLists(l1, l2)?.`val`.toString()))
}