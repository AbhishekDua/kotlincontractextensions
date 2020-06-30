package aduakotlin.contract.extensions

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * Experimental contract function which returns 'true' if given object is not null
 */
@ExperimentalContracts
public inline fun <T:Any?> T?.isNotNull(): Boolean {
    contract {
        returns(true) implies (this@isNotNull != null)
    }
    return this != null
}

/**
 * Experimental contract function which returns 'true' if given object is null
 */
@ExperimentalContracts
public inline fun <T:Any?> T?.isNull(): Boolean {
    contract {
        returns(true) implies (this@isNull == null)
    }
    return this == null
}

/**
 * Experimental contract function which returns 'true' if given object is a non null Integer
 */
@ExperimentalContracts
public inline fun<T:Any?> T?.isANonNullInteger(): Boolean {
    contract {
        returns(true) implies (this@isANonNullInteger is Int)
    }
    return this is Int
}

/**
 * Experimental contract function which returns 'true' if given object is non null integer with value greater than provided input
 */
@ExperimentalContracts
public inline fun<T:Any?> T?.isANonNullIntegerGreaterThan(def:Int = 0): Boolean {
    contract {
        returns(true) implies (this@isANonNullIntegerGreaterThan is Int)
    }
    return this is Int && this > def
}

/**
 * Experimental contract function which returns 'true' if given object is non null Long
 */
@ExperimentalContracts
public inline fun<T:Any?> T?.isANonNullLong(): Boolean {
    contract {
        returns(true) implies (this@isANonNullLong is Long)
    }
    return this is Long
}

/**
 * Experimental contract function which returns 'true' if given object is non null Double
 */
@ExperimentalContracts
public inline fun<T:Any?> T?.isANonNullDouble(): Boolean {
    contract {
        returns(true) implies (this@isANonNullDouble is Double)
    }
    return this is Double
}

/**
 * Experimental contract function which returns 'true' if given object is non null Float
 */
@ExperimentalContracts
public inline fun<T:Any?> T?.isANonNullFloat(): Boolean {
    contract {
        returns(true) implies (this@isANonNullFloat is Float)
    }
    return this is Float
}

/**
 * Experimental contract function which returns 'true' if given object is non null and empty String
 */
@ExperimentalContracts
public inline fun<T:Any?> T?.isANonNullAndEmptyString(): Boolean {
    contract {
        returns(true) implies (this@isANonNullAndEmptyString is String)
    }
    return this is String && this.isNotBlank()
}

/**
 * Experimental contract function which returns 'true' if given object is non null String and not equal to a given value
 */
@ExperimentalContracts
public inline fun<T:Any?> T?.isNonNullStringButNotEqualTo(value: String, ignoreCase: Boolean = false): Boolean {
    contract {
        returns(true) implies (this@isNonNullStringButNotEqualTo is String)
    }
    return this is String && !this.equals(value, ignoreCase)
}

/**
 * Experimental contract function which returns 'true' if given object is non null String and equal to a given value
 */
@ExperimentalContracts
public inline fun<T:Any?> T?.isNonNullStringButEqualTo(value: String, ignoreCase: Boolean = false): Boolean {
    contract {
        returns(true) implies (this@isNonNullStringButEqualTo is String)
    }
    return this is String && this.equals(value, ignoreCase)
}

/**
 * Experimental contract function which returns 'true' if given object is non null Activity
 */
@ExperimentalContracts
public inline fun<T:Any?> T?.isANonNullActivity(): Boolean {
    contract {
        returns(true) implies (this@isANonNullActivity is AppCompatActivity)
    }
    return this is AppCompatActivity
}

/**
 * Experimental contract function which returns 'true' if given object is non null Fragment
 */
@ExperimentalContracts
public inline fun<T:Any?> T?.isANonNullFragment(): Boolean {
    contract {
        returns(true) implies (this@isANonNullFragment is Fragment)
    }
    return this is Fragment
}

/**
 * Experimental contract function which returns 'true' if given object is non null and empty character
 */
@ExperimentalContracts
public inline fun<T:Any?> T?.isANonNullAndEmptyChar(): Boolean {
    contract {
        returns(true) implies (this@isANonNullAndEmptyChar is Char)
    }
    return this is Char && this != ' '
}