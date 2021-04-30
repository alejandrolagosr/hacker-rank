import kotlin.math.abs

fun main() {
    println(sumItUp(10))
}

fun sumItUp(upperBound: Long): Int {
    val sum: Long
    val one = 1L
    val upperBoundAbsolute = abs(upperBound)
    return if (upperBoundAbsolute != 0L) {
        sum = one.rangeTo(upperBoundAbsolute).sum()
        val remainder = sum % upperBound
        if (remainder.toInt() == 0) 1 else 0
    } else {
        0
    }
}
