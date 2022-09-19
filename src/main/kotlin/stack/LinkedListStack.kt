package stack

class LinkedListStack<T> :Stack<T>{
    private var tag ="LinkedListStack"



    data class Node<T>(var value: T, var next: Node<T>? = null)
    private var header: Node<T>? = null

    // add item to top of stack
    override fun push(item: T) {
        val itemToInsert = Node(item, header)
        header = itemToInsert
        println("$tag stack item pushed, $item")
    }

    // return top item and remove ite from stack
    override fun pop(): T? {
        if (header == null) {
            println("$tag can't pop,Stack is empty")
            return null
        }
        val returnValue = header
        val nextHeader = header!!.next
        println("$tag pop, ${returnValue!!.value}")
        header = null
        header = nextHeader
        return returnValue?.value
    }


    // return top item without move the pointer
    override fun top(): T? {
        if (header != null) {
            println("$tag Stack top is, ${header!!.value}")
            return header!!.value
        }
        println("$tag Stack is empty, no top")
        return null
    }

    override  fun print() {
        var tempHeader = header
        print("[")
        var i = 0
        while (tempHeader != null) {
            print(if (i == 0) "${tempHeader.value}" else ",${tempHeader.value}")
            i += 1
            tempHeader = tempHeader.next
        }
        println("]")
    }


}