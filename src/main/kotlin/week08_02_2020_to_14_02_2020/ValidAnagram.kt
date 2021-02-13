package week08_02_2020_to_14_02_2020

import kotlin.collections.HashMap

fun isAnagram(s: String, t: String): Boolean {
    val firstMap = HashMap<Char, Int>()
    val secondMap = HashMap<Char, Int>()
    s.toCollection(mutableListOf()).forEach {
        if (!firstMap.containsKey(it)) {
            firstMap[it] = 0
        } else {
            firstMap.compute(it) { _, n -> n!! + 1 }
        }
    }

    t.toCollection(mutableListOf()).forEach {
        if (!secondMap.containsKey(it)) {
            secondMap[it] = 0
        } else {
            secondMap.compute(it) { _, n -> n!! + 1 }
        }
    }
    return firstMap == secondMap
}


fun main() {
    println(isAnagram("anagram", "nagaram"))
}