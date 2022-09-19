package stack

fun main() {
    val arrayStack = ArrayStack<Int?>(4)
    arrayStack.push(10)
    arrayStack.push(7)
    arrayStack.push(8)
    arrayStack.push(9)
    arrayStack.push(5)
    arrayStack.print()

    arrayStack.pop()
    arrayStack.print()
    arrayStack.pop()
    arrayStack.print()
    arrayStack.top()
    arrayStack.pop()
    arrayStack.print()
    arrayStack.pop()
    arrayStack.top()
    arrayStack.pop()
    arrayStack.pop()
    arrayStack.top()
    arrayStack.print()


    val linkedListStack = LinkedListStack<Int>()

    linkedListStack.push(10)
    linkedListStack.push(7)
    linkedListStack.push(8)
    linkedListStack.push(9)
    linkedListStack.push(5)

    linkedListStack.print()

    linkedListStack.pop()

    linkedListStack.print()
    linkedListStack.pop()
    linkedListStack.print()
    linkedListStack.top()
    linkedListStack.pop()
    linkedListStack.push(5)
    linkedListStack.print()
    linkedListStack.pop()
    linkedListStack.top()
    linkedListStack.pop()
    linkedListStack.pop()

    linkedListStack.top()
    linkedListStack.print()
}