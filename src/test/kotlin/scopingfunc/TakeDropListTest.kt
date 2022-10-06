package scopingfunc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TakeDropListTest {

    @Test
    fun `should take and take last from list`() {
        val numbers = listOf("one", "two", "three", "four", "five", "six")
        Assertions.assertIterableEquals(listOf("one","two","three"), numbers.take(3))
        Assertions.assertIterableEquals(listOf("four", "five", "six"), numbers.takeLast(3))
    }

    @Test

    fun `should drop and drop last from list`() {
        val numbers = listOf("one", "two", "three", "four", "five", "six")
        Assertions.assertIterableEquals(listOf("four", "five", "six"), numbers.drop(3))
        Assertions.assertIterableEquals(listOf("one","two","three"), numbers.dropLast(3))

    }
}