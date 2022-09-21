package queue

interface Queue<T> {
    fun queueItem(item: T)
    fun deQueue():T?
    fun print()
}