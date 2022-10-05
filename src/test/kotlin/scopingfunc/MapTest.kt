package scopingfunc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MapTest {

    @Test
    fun `should using map transform object`() {
        val numbers = listOf(1,2,3,4,5)
        numbers.map { it * 3 }

        Assertions.assertIterableEquals(listOf(3,6,9,12,15), numbers.map { it * 3 })

        Assertions.assertIterableEquals(listOf(0,2,6,12,20),
            numbers.mapIndexed{ index, value -> value * index})

        Assertions.assertIterableEquals(
            listOf(3,9,12,15),
            numbers.mapNotNull { v-> if(v==2) null else v * 3 })

        Assertions.assertIterableEquals(
            listOf(2,6,12,20),
            numbers.mapIndexedNotNull{i, v -> if (i == 0) null else v * i}
        )
    }
}