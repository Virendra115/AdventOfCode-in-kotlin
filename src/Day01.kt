import java.util.Collections.sort
import java.util.Comparator

fun main() {
    fun part1(input: String): Int {
        val list = input.split("\r\n\r\n").map { a -> a.split("\r\n").sumOf { it.toInt() } }
        return list.max()
    }

    fun part2(input: String): Int {
        val list = input.split("\r\n\r\n").map { a -> a.split("\r\n").sumOf { it.toInt() } }
        sort(list, Comparator.reverseOrder())
        return list[0] + list[1] + list[2]
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 24000)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
