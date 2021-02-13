package week08_02_2020_to_14_02_2020

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ValidAnagramTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    fun `isAnagram should define right anagrams`(s: String, t: String, result: Boolean) {
        assertEquals(isAnagram(s, t), result)
    }

    companion object {
        @JvmStatic
        fun testDataProvider() = Stream.of(
            Arguments.of("anagram", "ganaram", true),
            Arguments.of("abc", "acad", false),
        )
    }

}