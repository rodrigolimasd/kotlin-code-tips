package model

data class Person(
    val name: String,
    val age: Int,
    var profession: String? = null,
    var nickname: String? = null
)
