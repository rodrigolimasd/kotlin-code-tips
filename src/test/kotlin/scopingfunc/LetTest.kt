package scopingfunc

import model.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LetTest {

    @Test
    fun `should map pair to object`() {

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
}