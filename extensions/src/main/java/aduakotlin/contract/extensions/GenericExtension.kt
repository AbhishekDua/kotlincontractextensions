package aduakotlin.contract.extensions

/**
 * if this nullable object is  not null  then function invokes block otherwise it runs the default function
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
public inline fun <T> T?.ifNotNullThen( default: () -> Unit = {}, block: T.() -> Unit) {
    if(this != null) {
        block()
    } else {
        default()
    }
}

/**
 * if this nullable object is  not null  then function invokes block otherwise it runs the default function
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
public inline fun <T,R> T?.ifNotNull( default: () -> R? = {null}, block: (T) -> R): R? {
    return if(this != null) {
        block(this)
    } else {
        default()
    }
}