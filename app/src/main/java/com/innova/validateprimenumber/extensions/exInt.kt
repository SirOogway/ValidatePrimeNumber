package com.innova.validateprimenumber.extensions

fun Int.isPrimeNumber(): Boolean {
    val dividers: Int = Math.floorDiv(this, 2)
    for (divider in 2..dividers) {
        if (this % divider == 0) return false
    }
    return true
}