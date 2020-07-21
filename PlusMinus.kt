/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
Example 

There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
0.400000
0.400000
0.200000

Function Description
Complete the plusMinus function in the editor below.
plusMinus has the following parameter(s):
int arr[n]: an array of integers
Print 
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

Input Format
The first line contains an integer, the size of the array. 
The second line contains space-separated integers that describe .

Output Format
Print the following  lines, each to  decimals:
proportion of positive values
proportion of negative values
proportion of zeros

Sample Input
6
-4 3 -9 0 4 1         

Sample Output
0.500000
0.333333
0.166667
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

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>, n: Int): Unit {
    var positive = 0.0
    var zeros = 0.0
    var negative = 0.0
    for (i in arr) {
        if (i >= 1) {
            positive++
        } else if (i == 0) {
            zeros++
        } else {
            negative++
        }
    }
    println("%.6f".format(positive/n.toDouble()))
    println("%.6f".format(negative/n.toDouble()))
    println("%.6f".format(zeros/n.toDouble()))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    plusMinus(arr, n)
}
