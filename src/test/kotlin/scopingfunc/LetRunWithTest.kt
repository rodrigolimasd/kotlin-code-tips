package scopingfunc

import model.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LetRunWithTest {

    @Test
    fun `should using let to map pair to object`() {

        val attributes = Pair("Tony Stark", 30)
        val person: Person = attributes.let {
            Person(
                name = it.first,
                age = it.second
            )
        }

        Assertions.assertEquals(30, person.age)
        Assertions.assertEquals("Tony Stark", person.name)

    }

    @Test
    fun `should using run to map pair to object`() {

        val attributes = Pair("Tony Stark", 30)
        val person: Person = attributes.run {
            Person(
                name = first,
                age = second
            )
        }

        Assertions.assertEquals(30, person.age)
        Assertions.assertEquals("Tony Stark", person.name)

    }

    @Test
    fun `should with run to map pair to object`() {

        val attributes = Pair("Tony Stark", 30)
        val person: Person = with(attributes) {
            Person(
                name = first,
                age = second
            )
        }

        Assertions.assertEquals(30, person.age)
        Assertions.assertEquals("Tony Stark", person.name)

    }
}