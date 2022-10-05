package scopingfunc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AnyNoneAllPartitionListTest {

    @Test
    fun `should check any none all from list`() {
        val numbers = listOf("one", "two", "three", "four")

        Assertions.assertTrue(numbers.any { it.endsWith("e") } )
        Assertions.assertTrue(numbers.none { it.endsWith("a") })
        Assertions.assertFalse(numbers.all { it.endsWith("e") })
    }

    @Test
    fun `should partition list`() {
        val numbers = listOf("one", "two", "three", "four")

        val partitioned = numbers.partition { it.length > 3 }

        Assertions.assertIterableEquals(listOf("one","two"), partitioned.second)
        Assertions.assertIterableEquals(listOf("three","four"), partitioned.first)

    }
}