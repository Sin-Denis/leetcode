package week08_02_2020_to_14_02_2020

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class NumberToStepsToReduceNumberToZeroTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    fun `number of step should return steps from num to zero`(number: Int, result: Int) {
        assertEquals(result, numberOfStep(number))
    }

    companion object {
        @JvmStatic
        fun testDataProvider() = Stream.of(
            Arguments.of(123, 12),
            Arguments.of(8, 4),
            Arguments.of(14, 6)
        )
    }
}