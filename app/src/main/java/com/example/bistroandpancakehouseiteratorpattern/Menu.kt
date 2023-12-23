package com.example.bistroandpancakehouseiteratorpattern

interface Menu {
    fun createIterator(): Iterator<MenuItem>
}