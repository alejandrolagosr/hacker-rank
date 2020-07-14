/*
AVeryBigSum

Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

Function Description
Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
aVeryBigSum has the following parameter(s):
ar: an array of integers .

Input Format
The first line of the input consists of an integer . 
The next line contains  space-separated integers contained in the array.

Output Format
Print the integer sum of the elements in the array.

Sample Input
5
1000000001 1000000002 1000000003 1000000004 1000000005

Output
5000000015
*/

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the aVeryBigSum function below.
fun aVeryBigSum(ar: Array<Long>): Long {
    var sum = 0L
    for (a in ar) {
        sum += a
    }
    return sum
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arCount = scan.nextLine().trim().toInt()
    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()
    val result = aVeryBigSum(ar)
    println(result)
}