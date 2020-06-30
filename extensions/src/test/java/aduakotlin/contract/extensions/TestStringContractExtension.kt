package aduakotlin.contract.extensions

import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.contracts.ExperimentalContracts

public class TestStringContractExtension {

    @Test
    fun ifNotNullOrEmptyTest() {
        // given
        val myValue = "Kotlin"
        val myEmptyValue:String? = null

        // when
        val returnVal = myValue.ifNotNullOrEmpty {
            println(it)
            "correct"
        }

        val stringReturning = {
            println("Indeed!!, this was empty")
            "Yes it's empty"
        }
        val emptyReturn = myEmptyValue.ifNotNullOrEmpty (stringReturning){
            println("This was empty")
        }

        // then
        assertEquals("correct", returnVal)
        assertEquals("Yes it's empty", emptyReturn)
    }

    @Test
    fun ifNotNullOrEmptyThenTest() {
        // given
        var myValue:String? = "Kotlin"
        val myEmptyValue:String? = null

        // when
        myValue.ifNotNullOrEmptyThen {
            println(this)
        }

        val stringReturning = {
            println("Indeed!!, this was null or empty")
        }
         myEmptyValue.ifNotNullOrEmptyThen (stringReturning){
            println("This was empty")
        }
    }

    @Test
    fun IfEqualToTest() {
        // given
        val myValue1 = "Kotlin"
        val myNullValue: String? = null

        // when
        val returnVal = myValue1.ifEqualTo("Kotlin") {
            println("We are same buddy")
            "We are same buddy"
        }

        val stringReturning = {
            println("We are not same buddy")
            "We are not same buddy"
        }

        val returnVal2 = myValue1.ifEqualTo("Groovy", default = stringReturning) {
            println("We are same buddy")
            "We are same buddy"
        }

        val returnVal3 = myNullValue.ifEqualTo("Kotlin", default =  stringReturning) {
            println("We are same buddy")
            "We are same buddy"
        }
        // then
        assertEquals("We are same buddy", returnVal)
        assertEquals("We are not same buddy", returnVal2)
        assertEquals("We are not same buddy", returnVal3)
    }

    @Test
    fun IfEqualToThenTest() {
        // given
        val myValue1 = "Kotlin"
        val myNullValue: String? = null
        val myObj = 0

        // when
        myValue1.ifEqualToThen("Kotlin") {
            println("We are same buddy")
        }

        val stringReturning = {
            println("We are not same buddy")
        }

        myValue1.ifEqualToThen("Groovy", default = stringReturning) {
            println("We are same buddy")
        }

        myNullValue.ifEqualToThen("Kotlin", default =  stringReturning) {
            println("We are same buddy")
        }
    }

    @Test
    fun IfNotEqualToTest() {
        // given
        val myValue1 = "Kotlin"
        val myNullValue: String? = null

        val stringReturning = {
            println("We are same buddy")
            "We are same buddy"
        }

        val stringReturningForNull = {
            println("We are null buddy")
            "We are null buddy"
        }

        // when
        val returnVal = myValue1.ifNotNullAndEqualTo("kotlin", true, default = stringReturning) {
            println("We are not same buddy" + it)
            "We are not same buddy"
        }

        val returnVal2 = myValue1.ifNotNullAndEqualTo("Groovy",default =  stringReturning) {
            println("We are not same buddy" + it)
            "We are not same buddy"
        }

        val returnVal3 = myNullValue.ifNotNullAndEqualTo("Kotlin",default =  stringReturningForNull) {
            println("We are not same buddy " + it)
            "We are not same buddy"
        }
        // then
        assertEquals("We are same buddy", returnVal)
        assertEquals("We are not same buddy", returnVal2)
        assertEquals("We are null buddy", returnVal3)
    }

    @Test
    fun IfNotEqualToThenTest() {
        // given
        var myValue1 = "Kotlin"
        var myNullValue: String? = null

        val stringReturning = {
            println("We are same buddy")
        }

        val stringReturningForNull = {
            println("We are null buddy")
        }

        // when
        myValue1.ifNotNullAndEqualToThen("kotlin", true, default = stringReturning) {
            println("We are not same buddy")
        }

        myValue1.ifNotNullAndEqualToThen("Groovy",default =  stringReturning) {
            println("We are not same buddy")
        }

        myNullValue.ifNotNullAndEqualToThen("Kotlin",default =  stringReturningForNull) {
            println("We are not same buddy")
        }
    }

    @ExperimentalContracts
    @Test
    fun testMiscellaneous() {
        val a: String? = null
        val str: Any = "abc"
        if (a.isANonNullInteger()) {
            a.plus(4)
        } else {
            print("No it is not")
        }
        val e: Example? = null
        e.ifNotNullThen {
            if (zero.isANonNullInteger()) {
                println(zero)
            }
        }
    }
    class Example() {
        val zero:Int? = 0
        val h:ArrayList<Int>? = arrayListOf<Int>(0,1)
    }
}