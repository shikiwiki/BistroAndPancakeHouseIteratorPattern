package com.example.bistroandpancakehouseiteratorpattern

class PancakeHouseMenu : Menu {

    var numberOfItems = 0
    private var items : MutableList<MenuItem> = mutableListOf(MenuItem("Thick pancakes", 2.50), MenuItem("Thin pancakes", 2.00))

    fun addItem(menuItem: MenuItem) {
        items.add(menuItem)
    }

    override fun createIterator(): Iterator<MenuItem> {
        return PancakeHouseMenuIterator(items)
    }
}