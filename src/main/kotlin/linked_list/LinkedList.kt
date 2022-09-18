package linked_list

class LinkedList<T> {

    data class Node<T>(var value: T, var next: Node<T>? = null)

    private var header: Node<T>? = null
    private var lastItem: Node<T>? = null
    fun addItem(item: T) {
        val itemToInsert = Node(item)
        // check for header is null
        if (header == null) {
            header = itemToInsert
            // header is the last item
            lastItem = header
            return
        }
        // currant make next pointer look to the inserted item
        lastItem?.next = itemToInsert
        // move last item pointer to the same item
        lastItem = itemToInsert
    }


    fun delete(item: T) {
        var checkItem = header
        var tempPrevious = checkItem
        var i = -1
        while (checkItem != null) {
            i += 1
            if (checkItem.value == item) {
                //found the item and ready to delete it
                //todo  try to delete first item

                if (checkItem == header) {
                    if (checkItem.next != null) header = checkItem.next   // if list has only one item
                    checkItem = null
                    println("Found it in pos-> $i as header , delete done ")
                    showInfo()
                    break
                }

                //todo  try to delete 2 item
                if (tempPrevious != null) {
                    tempPrevious.next = checkItem.next
                    //todo  try to delete last item
                    if (checkItem == lastItem) {
                        lastItem = tempPrevious
                        checkItem = null
                        println("Found it in pos-> $i as lastItem, delete done ")
                        showInfo()
                        break
                    }

                    checkItem = null
                    println("Found it in pos-> $i as item, delete done ")
                    showInfo()
                    break
                }
                break
            }
            tempPrevious = checkItem
            checkItem = checkItem.next
        }

    }


    fun showInfo() {
//        println("Header -> $header  headerValue->${header?.value}")
//        println("HeaderNext -> ${header?.next}  headerNextValue->${header?.next?.value}")
//        println("lastItem -> $lastItem  lastItemValue->${lastItem?.value}  lastItem NextPointer${lastItem?.next}")
        var item = header
        println("size ${size()}")

        print("[")
        while (item != null) {
            print(if (item == header) "${item.value}" else ",${item.value}")
            item = item.next
        }
        println("]")

    }


    fun first(): T? = header?.value
    fun last(): T? = lastItem?.value

    fun foundItem(item: T): Int {
        var pos = -1
        var tempPos = -1
        var checkItem = header
        while (checkItem != null) {
            tempPos += 1
            if (checkItem.value == item) {
                pos = tempPos
                break
            }
            checkItem = checkItem.next
        }
        println("item pos -> $pos")
        return pos
    }


    fun size(): Int {
        var size = 0
        var i = header
        while (i != null) {
            size += 1
            i = i.next
        }
        return size
    }
}