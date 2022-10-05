package scopingfunc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ZipUnzipJoinToListTest {

    @Test
    fun `should create list of tuples with two list`(){
        val colors = listOf("red", "brown", "grey")
        val animals = listOf("fox", "bear", "wolf")
        val expected = listOf("red" to "fox", "brown" to "bear", "grey" to "wolf")
        Assertions.assertIterableEquals(expected, colors.zip(animals))
    }

    @Test
    fun `should create two list from one list of pair`(){
        val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
        val unzipedPair = numberPairs.unzip()
        Assertions.assertIterableEquals(listOf("one","two","three","four"), unzipedPair.first)
        Assertions.assertIterableEquals(listOf(1,2,3,4), unzipedPair.second)
    }

    @Test
    fun `should join StringBuffer in list`(){
        val numbers = listOf("one", "two", "three", "four")
        val listString = StringBuffer("The list of numbers: ")
        val joined = numbers.joinTo(listString)
        Assertions.assertEquals("The list of numbers: one, two, three, four", joined.toString())
    }

}