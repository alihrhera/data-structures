package stack

interface Stack<T> {
    fun pop(): T?   // stack main fun to take the top item of stack
    fun push(item: T) // stack main fun to add new item to the top of stack
    fun top(): T?  // return top item without remove it from stack
    fun print()   // print the full stack

}