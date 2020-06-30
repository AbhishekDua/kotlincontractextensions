package aduakotlin.contract.extensions


    fun main() {
        var exampleClass: ExampleClass? = null
        exampleClass.ifNotNull({
            exampleClass = ExampleClass(null,null,null,null)
            println("Step 1 ---------" + exampleClass.toString())
        }) {
            println(exampleClass.toString())
        }
        exampleClass.ifNotNull {
            updateValues(it)
            println("Step 2 -----------" + it.toString())
        }
        exampleClass.ifNotNull({
        }) {
            updateValues(it)
            println("Step 3-------------"+exampleClass.toString())
        }

    }

    private fun updateValues(exampleClass: ExampleClass) {
        exampleClass.someInteger.ifIntGreaterThan(7, {
            exampleClass.someInteger = 8
        }) {
           exampleClass.someInteger = it.plus(5)
        }
        exampleClass.someList.ifArrayListNotNullOrEmpty({
            exampleClass.someList = arrayListOf("Example Value")
        }) {
            it.add("Example Value 1")
        }
        exampleClass.someLong.ifLongGreaterThanOrEqualTo(2L, {
            exampleClass.someLong = 2L
        }) {
            exampleClass.someLong = it.plus(2L)
        }
        exampleClass.someString.ifEqualToThen("abc", false,{
            exampleClass.someString = "abc"
        }) {
            exampleClass.someString = this.capitalize()
        }
    }