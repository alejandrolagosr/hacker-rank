fun main() {
    braces(arrayOf("{}[]", "{]{}")).forEach { print(it) }
}

fun braces(values: Array<String>): Array<String> {
    val result = mutableListOf<String>()
    values.forEach{ value ->
        value.toCharArray().forEach { chr ->
            when (chr) {
                ']' -> if (value[0] != '[') result.add("NO")
                ')' -> if (value[0] != '(') result.add("NO")
                '}' -> if (value[0] != '{') result.add("NO")
                else -> result.add("YES")
            }
        }
    }
    return result.toTypedArray()
}
