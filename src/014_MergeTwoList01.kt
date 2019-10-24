
import org.junit.Assert
import org.junit.Test
import java.util.LinkedList



fun mergeTwoLists(l1: ListNode, l2: ListNode): ListNode? {

    //head of result
    val h1 = ListNode(0)
    //add l1 to head
    h1.next = l1
    //current indicators for list1 and list2
    var c1: ListNode? = h1
    var c2: ListNode? = l2

    var temp: ListNode?
    var c2temp: ListNode


    //current node in list1 and current node in list2 [both are not nulls]
    while (c1!!.next != null && c2 != null) {

        //if next node's value in list1 greater than current node's value in list2, change next node of list1 to current node's value from list2
        if (c1.next!!.`val` > c2.`val`) {

            //preserve next node in temp
            temp = c1.next
            //preserve current node from list2 in temp2
            c2temp = c2
            //move current to next node in the list
            c2 = c2.next
            //move current's next to temp from list2 [temp2]
            c1.next = c2temp
            //temp from list2 is now the node that was moved as it was less than current node in list1
            //make its next node point to original next node in list1
            c2temp.next = temp
        } else {
            //just move indicator [cursor] of list1 to next node
            c1 = c1.next
        }
    }


    //in case if there's any node left in list2, move them to list1
    while (c2 != null) {
        c1!!.next = c2
        c1 = c1.next
        c2 = c2.next
    }


    //return next list node of head as a result
    return h1.next
}

class MergeTwoListTest{
    @Test
    fun TestMergeTwoLists() {
        var l1 = LinkedList(mutableListOf(1, 2, 4))
        var l2 = LinkedList(mutableListOf(1, 3, 4))
//        var result = mergeTwoLists(l1, l2)

        println(l1)
        println(l2.toString())
//        println(result)
//        println(result.toString().elementAt(0))

//        Assert.assertEquals("112344", result.toString())

    }

}
