package aduakotlin.contract.extensions

/**
 * if this nullable Int is either not null and greater than the given value for int then function invokes block otherwise it runs the default function
 * Compares with 0 if no value is provided
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
inline fun<R> Int?.ifIntGreaterThan(value: Int = 0, default: () -> R? = {null}, block: (Int) -> R): R? {
    return if(this != null && this > value) {
        block(this)
    } else {
        default()
    }
}

/**
 * if this nullable Int is either not null and greater than the given value for int then function invokes block otherwise it runs the default function
 * Compares with 0 if no value is provided
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
inline fun Int?.ifIntGreaterThanThen(value: Int = 0, default: () -> Unit = {}, block: Int.() -> Unit): Int? {
    if(this != null && this > value) {
        block()
    } else {
        default()
    }
    return this
}

/**
 * if this nullable Int is either not null and greater than and equal to given value for Int then function invokes block otherwise it runs the default function
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
inline fun<R> Int?.ifIntGreaterThanOrEqualTo(value: Int, default: () -> R? = {null}, block: (Int) -> R): R? {
    return if(this != null && this >= value) {
        block(this)
    } else {
        default()
    }
}

/**
 * if this nullable Int is either not null and greater than and equal to given value for Int then function invokes block otherwise it runs the default function
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
inline fun Int?.ifIntGreaterThanOrEqualToThen(value: Int, default: () -> Unit = {}, block: Int.() -> Unit): Int? {
    if(this != null && this >= value) {
        block()
    } else {
        default()
    }
    return this
}