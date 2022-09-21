package queue

class ArrayQueue<T>(size: Int) : Queue<T> {
    // represent queue as array
    private val queueArray: Array<T?> = Array<Any?>(size) {} as Array<T?>
    private var lastItemPointer = -1 // pointer to the last add item


    /*
    * check if @lastItemPointer +1 greater than the array size so the queue is full
    * else there is empty place to add the item in the last of the queue
    * */
    override fun queueItem(item: T) {

        if ((lastItemPointer + 1) >= queueArray.size) {
            println("Can't queue item, the queue is full")
            return
        }

        lastItemPointer += 1 // move the pointer to new add item position
        println("queue item,$item at pos $lastItemPointer")
        queueArray[lastItemPointer] = item  // save the item in array
    }

    /*
    * the queue use the method first in first out,
    * so we need to take the first item and move the rest of the queue items one forward step
    */
    override fun deQueue(): T? {
        val item = queueArray[0]
        /*
        *  */
        for (i in 0..lastItemPointer) {
            if (i + 1 < queueArray.size) {
                queueArray[i] = queueArray[i + 1] //now we move every queue item one forward step
                queueArray[i + 1] = null          // after move the item release it's value
            }
        }
        // get the first item if it == null so the queue is empty
        if (null != item) {
            /* after dequeue item notify there is free position in the queue
            By taking the pointer a step back
             */
            lastItemPointer -= 1
            println("dequeued Item is, $item")
        } else {
            println("can't dequeue Item, queue is empty")
        }

        print()
        return item

    }


    /*
    * print the queue values */
    override fun print() {
        print("[")
        for (i in queueArray.indices) {

            if (i <= lastItemPointer) print(
                (if (i == 0) "" else {
                    ","
                }) + queueArray[i]
            )
            else print(",")
        }
        println("]")

    }


}