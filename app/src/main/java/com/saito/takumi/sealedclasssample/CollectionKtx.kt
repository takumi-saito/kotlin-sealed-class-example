package com.saito.takumi.sealedclasssample

public inline fun <T> Iterable<T>.sumByFloat(selector: (T) -> Float): Float {
    var sum: Float = 0.0F
    for (element in this) {
        sum += selector(element)
    }
    return sum
}

public inline fun <T> List<T>.replace(newValue: T, block: (T) -> Boolean): List<T> {
    return map {
        if (block(it)) newValue else it
    }
}
