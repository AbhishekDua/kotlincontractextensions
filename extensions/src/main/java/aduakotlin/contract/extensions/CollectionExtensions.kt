package aduakotlin.contract.extensions

/**
 * if this nullable ArrayList is either null or empty then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
inline fun<T,R> ArrayList<T>?.ifArrayListNotNullOrEmpty(default: () -> R? = {null},block: (ArrayList<T>)-> R): R? {
    return if(this.isNullOrEmpty()) {
        default()
    } else {
        block(this)
    }
}

/**
 * if this nullable ArrayList is either null or empty then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its receiver and returns `this` value.
 */
public inline fun<T> ArrayList<T>?.ifArrayListNotNullOrEmptyThen(default: () -> Unit = {},block: ArrayList<T>.()-> Unit): ArrayList<T>? {
    if(this.isNullOrEmpty()) {
        default()
        this.apply {  }
    } else {
        block()
    }
    return this
}

/**
 * if this nullable List is either null or empty then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
inline fun<T,R> List<T>?.ifListNotNullOrEmpty(default: () -> R? = {null},block: (List<T>)-> R): R? {
    return if(this.isNullOrEmpty()) {
        default()
    } else {
        block(this)
    }
}

/**
 * if this nullable List is either null or empty then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its receiver and returns `this` value.
 */
inline fun<T> List<T>?.ifListNotNullOrEmptyThen(default: () -> Unit = {},block: List<T>.()-> Unit): List<T>? {
    if(this.isNullOrEmpty()) {
        default()
    } else {
        block()
    }
    return this
}

/**
 * if this nullable Map is either null or empty then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
inline fun<T,S,R> Map<T,S>?.ifMapNotNullOrEmpty(default: () -> R? = {null},block: (Map<T,S>)-> R): R? {
    return if(this.isNullOrEmpty()) {
        default()
    } else {
        block(this)
    }
}

/**
 * if this nullable Map is either null or empty then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its receiver and returns `this` value.
 */
inline fun<T,S> Map<T,S>?.ifMapNotNullOrEmptyThen(default: () -> Unit = {},block: Map<T,S>.()-> Unit): Map<T,S>? {
    if(this.isNullOrEmpty()) {
        default()
    } else {
        block()
    }
    return this
}

/**
 * if this nullable HashMap is either null or empty then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
inline fun<T,S,R> HashMap<T,S>?.ifHashMapNotNullOrEmpty(default: () -> R? = {null},block: (HashMap<T,S>)-> R): R? {
    return if(this.isNullOrEmpty()) {
        default()
    } else {
        block(this)
    }
}

/**
 * if this nullable HashMap is either null or empty then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its receiver and returns `this` value.
 */
inline fun<T,S> HashMap<T,S>?.ifHashMapNotNullOrEmptyThen(default: () -> Unit = {},block: HashMap<T,S>.()-> Unit): HashMap<T,S>? {
    if(this.isNullOrEmpty()) {
        default()
    } else {
        block()
    }
    return this
}

/**
 * if this nullable HashMap is either null or empty or doesnot contain key then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its argument and returns its result.
 */
inline fun<T,S,R> HashMap<T,S>?.ifHashMapHasKey(key: T, default: () -> R? = {null},block: (HashMap<T,S>)-> R): R? {
    return if(!this.isNullOrEmpty() && this.containsKey(key)) {
        block(this)
    } else {
        default()
    }
}

/**
 * if this nullable HashMap is either null or empty or doesnot contain key then function invokes default function otherwise it runs the expected block
 * Calls the specified function [block] with `this` value as its receiver and returns `this` value.
 */
inline fun<T,S> HashMap<T,S>?.ifHashMapHasKeyThen(key: T, default: () -> Unit = {},block: HashMap<T,S>.()-> Unit): HashMap<T,S>? {
    if(!this.isNullOrEmpty() && this.containsKey(key)) {
        block()
    } else {
        default()
    }
    return this
}