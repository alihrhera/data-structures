package linked_list

fun main() {
    val linkedList = LinkedList<Int>()
    println(linkedList.size())

    linkedList.addItem(0)
    linkedList.addItem(5)
    linkedList.addItem(12)
    linkedList.addItem(10)


    linkedList.foundItem(10)

    linkedList.showInfo()

    linkedList.delete(15)  // not item
    linkedList.delete(0)   // delete header
    linkedList.delete(12)  // delete item
    linkedList.delete(10)  // delete last

    println(linkedList.first())
    println(linkedList.last())
    println(linkedList.size())

}