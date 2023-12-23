package com.example.bistroandpancakehouseiteratorpattern

class BistroMenu : Menu {

    private val MAX_ITEMS = 6
    private var numberOfItems = 0
    private var items : Array<MenuItem> = arrayOf(MenuItem("Shaurma", 5.50), MenuItem("Pizza", 7.00))

    fun addItem(menuItem: MenuItem) {
        if (numberOfItems < MAX_ITEMS) {
            items[numberOfItems] = menuItem
        }
        else println("Menu is full!")
    }

    override fun createIterator(): Iterator<MenuItem> {
        return BistroMenuIterator(items)
    }
}