package com.example.bistroandpancakehouseiteratorpattern

class PancakeHouseMenuIterator(private var items: MutableList<MenuItem>) : Iterator<MenuItem> {
    private var position = 0

    override fun hasNext(): Boolean {
        return position < items.size
    }

    override fun next(): MenuItem {
        val item = items[position]
        position += 1
        return item
    }
}