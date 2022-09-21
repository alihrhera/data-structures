package queue


class LinkedQueue<T> : Queue<T> {
    data class Node<T>(var value: T, var next: Node<T>? = null)     // represent single node in the queue
    private var firstItem: Node<T>? = null     // first item in the queue
    private var lastItem: Node<T>? = null      // last insertItem


    /*
    * make the add item is the last item and link the Past last item with the new item
    * if first item == null the queue is empty so this is the first and the last item
    * */
    override fun queueItem(item: T) {
        val newItem = Node(item)
        if (firstItem == null) {
            firstItem = newItem
            lastItem = firstItem
        } else {
            lastItem?.next = newItem
            lastItem = newItem
        }
        println("queue $item done")

    }

    /*
    * the queue use the method first in first out,
    * so we need to take the first item  and make the next item is the first item
    */
    override fun deQueue(): T? {
        val tempFirstItem = firstItem
        if (tempFirstItem == null) {
            println("can't dequeue Item, queue is empty")
            return null
        }
        firstItem = null    // release first item value
        firstItem = tempFirstItem.next // make the next item is the first item of the queue
        println("dequeued Item is, ${tempFirstItem.value}")
        return tempFirstItem.value

    }


    /*
    * print the queue values */
    override fun print() {
        println("︹")
        var tempFirst = firstItem
        while (tempFirst != null) {
            if (tempFirst == firstItem) {
                println("${tempFirst.value} ↞")
            } else {
                println("${tempFirst.value}")
            }

            tempFirst = tempFirst.next
        }
        println("︺")
    }


}