package scopingfunc

import model.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ApplyAlsoTest {

    @Test
    fun `should apply to set profession from Person`() {

        val attributes = Pair("Tony Stark", 30)
        val person: Person = attributes.let {
            Person(
                name = it.first,
                age = it.second
            )
        }.apply {
            profession = "Iron man"
            nickname = "Tony"
        }

        Assertions.assertEquals(30, person.age)
        Assertions.assertEquals("Tony Stark", person.name)
        Assertions.assertEquals("Iron man", person.profession)
        Assertions.assertEquals("Tony", person.nickname)

    }

    @Test
    fun `should also to set profession from Person`() {

        val attributes = Pair("Tony Stark", 30)
        val person: Person = attributes.let {
            Person(
                name = it.first,
                age = it.second
            )
        }.also {
            it.profession = "Iron man"
            it.nickname = "Tony"
        }

        Assertions.assertEquals(30, person.age)
        Assertions.assertEquals("Tony Stark", person.name)
        Assertions.assertEquals("Iron man", person.profession)
        Assertions.assertEquals("Tony", person.nickname)

    }
}