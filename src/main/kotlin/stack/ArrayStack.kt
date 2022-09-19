package stack

class ArrayStack<T>(private val stackSize: Int) : Stack<T> {
    // init array for stack
    private var array: Array<T> = Array<Any>(stackSize) {} as Array<T>

    var topPos = -1 // top position of last enter item
    override fun pop(): T? {
        if (topPos < 0) {
            println("can't pop,Stack is Empty ")
            return null
        }
        val popItem = array[topPos]
        println("Stack pop pos is $topPos item to Pop is $popItem")
        topPos -= 1 // return the top item without move the pointer to bottome
        return popItem
    }

    // return the top item without move the pointer
    override fun top(): T? {
        if (topPos < 0) {
            println("No top item, Stack is Empty ")
            return null
        }
        println("Stack top item is ${array[topPos]}")
        return array[topPos]
    }


    override fun push(item: T) {
        if ((topPos + 1) < stackSize) {
            println("push $item to Stack ")
            topPos += 1
            array[topPos] = item
            return
        }
        println("Stack is Full size is $stackSize")
    }

    override fun print() {
        print("[")
        array.forEachIndexed { i, t ->
            if (i < topPos) {
                print(if (i == 0) "$t" else ",$t")
            }else if(i== topPos){
                print(if (i == 0) "$t <--" else ",$t <--")
            }
            else {
                print(if (i == 0) " " else ", ")
            }
        }
        println("]")
    }

}