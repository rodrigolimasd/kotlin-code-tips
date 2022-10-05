package scopingfunc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FlattenTest {

    @Test
    fun `should creates one list from the list of lists`(){
        val listOfList = listOf(listOf(1,2), listOf(3,4,5), listOf(6,7))
        Assertions.assertIterableEquals(listOf(1,2,3,4,5,6,7), listOfList.flatten())
    }
}