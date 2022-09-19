package stack

interface Stack<T> {
    fun pop():T?
    fun push(item:T)
    fun top():T?
    fun print()

}