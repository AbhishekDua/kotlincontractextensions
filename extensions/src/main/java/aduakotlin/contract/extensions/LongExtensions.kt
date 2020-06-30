package aduakotlin.contract.extensions

/**
 * if this nullable Long is either not null and greater than  given value for long then function invokes block otherwise it runs the default function
 * By defualt it checks for positive long
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
inline fun<R> Long?.ifLongGreaterThan(value: Long = 0L, default: () -> R? = {null}, block: (Long) -> R): R? {
    return if(this != null && this > value) {
        block(this)
    } else {
        default()
    }
}

/**
 * if this nullable Long is either not null and greater than  given value for long then function invokes block otherwise it runs the default function
 * By defualt it checks for positive long
 * Calls the specified function [block] with `this` value as its receiver and returns `this` value.
 */
inline fun Long?.ifLongGreaterThanThen(value: Long = 0L, default: () -> Unit = {}, block: Long.() -> Unit): Long? {
    if(this != null && this > value) {
        block(this)
    } else {
        default()
    }
    return this
}

/**
 * if this nullable Long is either not null and greater than and equal to given value for long then function invokes block otherwise it runs the default function
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
inline fun<R> Long?.ifLongGreaterThanOrEqualTo(value: Long, default: () -> R? = {null}, block: (Long) -> R): R? {
    return if(this != null && this >= value) {
        block(this)
    } else {
        default()
    }
}

/**
 * if this nullable Long is either not null and greater than or equal to given value for long then function invokes block otherwise it runs the default function
 * Calls the specified function [block] with `this` value as its receiver and returns `this` value.
 */
inline fun Long?.ifLongGreaterThanOrEqualToThen(value: Long, default: () -> Unit = {}, block: Long.() -> Unit): Long? {
    if(this != null && this >= value) {
        block()
    } else {
        default()
    }
    return this
}