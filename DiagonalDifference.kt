/*
DiagonalDifference

Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description
Complete the  function in the editor below.
diagonalDifference takes the following parameter:
int arr[n][m]: an array of integers

Return
int: the absolute diagonal difference

Input Format
The first line contains a single integer, , the number of rows and columns in the square matrix . 
Each of the next  lines describes a row, , and consists of  space-separated integers .

Output Format
Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input
3
11 2 4
4 5 6
10 8 -12

Sample Output
15
Explanation

The primary diagonal is:
11
   5
     -12

Sum across the primary diagonal: 11 + 5 - 12 = 4
The secondary diagonal is:
     4
   5
10

Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15
Note: |x| is the absolute value of x
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

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftToRight = arr[0][0] + arr[1][1] + arr[2][2]
    var rightToLeft = arr[0][2] + arr[1][1] + arr[2][0]
    return Math.abs(leftToRight - rightToLeft)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })
    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }
    val result = diagonalDifference(arr)
    println(result)
}
