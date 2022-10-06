package scopingfunc

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AnyNoneAllListTest {

    @Test
    fun `should check any none all from list`() {
        val numbers = listOf("one", "two", "three", "four")

        Assertions.assertTrue(numbers.any { it.endsWith("e") } )
        Assertions.assertTrue(numbers.none { it.endsWith("a") })
        Assertions.assertFalse(numbers.all { it.endsWith("e") })
    }

}