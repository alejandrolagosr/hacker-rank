/*
SimpleArraySum

Given an array of N integers, can you find the sum of its elements?

Input Format
The first line contains an integer, denoting the size of the array.
The second line contains space-separated integers representing the array's elements.

Output Format
Print the sum of the array's elements as a single integer.

Sample Input
6
1 2 3 4 10 11

Sample Output
31

*/

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the simpleArraySum function below.
 */
fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0
    for (i in ar) {
        sum = sum + i
    }
    return sum
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arCount = scan.nextLine().trim().toInt()
    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val result = simpleArraySum(ar)
    println(result)
}
