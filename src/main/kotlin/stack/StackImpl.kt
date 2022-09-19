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


}