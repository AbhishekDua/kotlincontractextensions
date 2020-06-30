package aduakotlin.contract.extensions

/**
 * if this nullable String is either null or empty then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
public inline fun <R> String?.ifNotNullOrEmpty(
    default: () -> R? = { null },
    block: (String) -> R
): R? {
    return if (!this.isNullOrBlank())
        block(this)
    else
        default()
}

/**
 * if the nullable String is either null or empty then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its receiver and returns `this` value.
 */
public inline fun String?.ifNotNullOrEmptyThen(
    default: () -> Unit = {},
    block: String.() -> Unit
): String? {
    if (!this.isNullOrBlank()) {
        block()
    }
    else {
        default()
    }
    return (this)
}

/**
 * if this nullable String is either not null and equal to given string then function invokes block otherwise it runs the default function
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
public inline fun <R> String?.ifEqualTo(
    value: String = "",
    ignoreCase: Boolean = false,
    default: () -> R? = { null },
    block: (String) -> R
): R? {
    return if (this != null && this.equals(value, ignoreCase))
        block(this)
    else
        default()
}

/**
 * if this nullable String is either not null and equal to given string then function invokes block otherwise it runs the default function
 * Calls the specified function [block] with `this` value as its receiver and returns `this` value.
 */
public inline fun String?.ifEqualToThen(
    value: String = "",
    ignoreCase: Boolean = false,
    default: () -> Unit = {},
    block: String.() -> Unit
): String? {
    if (this != null && this.equals(value, ignoreCase))
        block()
    else
        default()
    return this
}

/**
 * if this nullable String is either not null and not equal to given string then function invokes block otherwise it runs the default function
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
public inline fun <R> String?.ifNotNullAndEqualTo(
    value: String = "",
    ignoreCase: Boolean = false,
    default: () -> R? = { null },
    block: (String) -> R
): R? {
    return if (this != null && !this.equals(value, ignoreCase))
        block(this)
    else
        default()
}

/**
 * if this nullable String is either not null and not equal to given string then function invokes block otherwise it runs the default function
 * Calls the specified function [block] with `this` value as its receiver and returns `this` value.
 */
 inline fun String?.ifNotNullAndEqualToThen(
    value: String = "",
    ignoreCase: Boolean = false,
    default: () -> Unit = {},
    block: String.() -> Unit
): String? {
    if (this != null && !this.equals(value, ignoreCase))
        block()
    else
        default()
    return this
}