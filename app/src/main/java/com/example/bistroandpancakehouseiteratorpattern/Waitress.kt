package com.example.bistroandpancakehouseiteratorpattern

class Waitress(private val pancakeHouseMenu : PancakeHouseMenu, private val bistroMenu: BistroMenu) {

    fun printMenu() {
        val pancakeIterator : Iterator<MenuItem> = pancakeHouseMenu.createIterator()
        val bistroIterator : Iterator<MenuItem> = bistroMenu.createIterator()
        printMenu(pancakeIterator)
        printMenu(bistroIterator)
    }

    private fun printMenu(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            val item = iterator.next()
            println("${item.name}, ${item.price}")
        }
    }

}