package scopingfunc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PartitionSliceChuncked {

    @Test
    fun `should partition list`() {
        val numbers = listOf("one", "two", "three", "four")

        val partitioned = numbers.partition { it.length > 3 }

        Assertions.assertIterableEquals(listOf("one","two"), partitioned.second)
        Assertions.assertIterableEquals(listOf("three","four"), partitioned.first)
    }

    @Test
    fun `should slice list`() {
        val numbers = listOf("one", "two", "three", "four")

        val sliced = numbers.slice(0..2)

        Assertions.assertIterableEquals(listOf("one","two","three"), sliced)
    }

    @Test
    fun `should chunck list`() {
        val numbers = listOf("one", "two", "three", "four")

        val chucked = numbers.chunked(2)

        Assertions.assertIterableEquals(listOf(listOf("one","two"), listOf("three","four")), chucked)
    }
}