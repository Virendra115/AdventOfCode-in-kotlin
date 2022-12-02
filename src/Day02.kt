fun main() {
    fun part1(input: String): Int {
        val list = input.split("\r\n")
        var ans =0
        for (s in list) {
            if (s[0] == 'C' && s[2] == 'X')
                ans += 6
            else if (s[0]== 'B' && s[2] == 'Z')
                ans += 6
            else if (s[0] == 'A' && s[2] == 'Y')
                ans += 6
            else if (s[0] == s[2] - 23)
                ans += 3
            ans += s[2] - 'W'
        }
        return ans
    }

    fun part2(input: String): Int {
        val list = input.split("\r\n")
        var ans =0
        for(s in list) {
            ans += if (s[2]== 'X') {
                if (s[0] == 'A') 3  else if (s[0] == 'B') 1 else 2
            } else if (s[2] == 'Y') {
                s[0] - 'A' + 4
            } else {
                6 + if (s[0] == 'A') 2 else if (s[0] == 'B') 3 else 1
            }
        }
        return ans
    }

    // test if implementation meets criteria from the description, like:
    val input = readInput("input")
    println(part1(input))
    println(part2(input))
}
