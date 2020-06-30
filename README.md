## KOTLIN CONTRACT AND EXTENSIONS

Repository contains general useful extensions in kotlin which can be used in Android projects. Some extensions are written using kotlin contracts and are available in experimental mode only.

##### Version - 0.0.1

### USAGE

Just place the following code under dependencies in `build.gradle` file.

```groovy
implementation 'aduakotlin.contract.extensions:extensions:0.0.1'
```

### About The Library

The library like [kotlin stdlib](https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-stdlib) helps us with extensions like `isNullOrEmpty()` which provides Boolean checks and require us to use `if-else` blocks

Using Kotlin higher order functions and DSL's we can reduce the amount of `if-else` blocks we need to write in our code. This library provides few extension functions to handle those `if and else` cases
for you. It also uses DSL to provide null safety to avoid redundant null checks while using variable objects.

Here  is an example snippet

```kotlin
var str: String? = "kotlin"
str.ifNotNullAndEqualTo("KOTLIN", ignoreCase= true, {//optional function}) {
    ...         
    it.performSomeAction();  
}
 ```

Here, code will check if `str` is not null and equate the provided string and execute the code block if all conditions match. Also, one can pass a `function` as an optional parameter  which can be used if conditions donot match. More importantly `it` which we get is of type **String** and not **String?**. That means no more `?` operator have to be used everytime, we access the variable within the scope.

Library also provides `this` as a receiver in functions which have naming pattern pertaining to `then` keyword at the end of function name for e.g. `ifNotNullAndEqualToThen`, similar to how one uses `apply`.

```KOTLIN
var str: String? = "kotlin"
str.ifNotNullAndEqualToThen("KOTLIN", ignoreCase= true, {//optional function}) {
    ...         
    this.performSomeAction();  
}
```

Many more similar extensions are provided for Integer, Long, Collection classes etc. Using these functions we can avoid using nested `if-else` blocks as well as redundant null safety checks reducing the amount of code we write.

**Note** - Kotlin has an experimental feature in 1.3 called contracts which also solves the null safety problem but those are valid for only `Boolean` or `null` type. Also, contracts are valid for top level functions. This library also provides few extensions using these experimental features. Library will be updated when the feature is released.

### Contributing

The extensions available here are very limited and many more useful extensions can be added. `Contracts` are yet to be released and will undergo several additions and changes which can be harnessed.

#### Submitting Or Updating Functionality

The best way to submit a patch is to [fork the project on github](https://help.github.com/articles/fork-a-repo/) then send a
[pull request](https://help.github.com/articles/creating-a-pull-request/) via [github](https://github.com).

If you create your own fork, it might help to enable rebase by default
when you pull by executing
``` bash
git config --global pull.rebase true
```
This will avoid your local repo having too many merge commits
which will help keep your pull request simple and easy to apply.

Before submitting the pull request, make sure all existing tests are passing, and add the new test if it is required.

### License

License can be found [here](https://github.com/AbhishekDua/kotlincontractextensions/blob/master/LICENSE).
