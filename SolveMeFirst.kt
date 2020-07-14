/*
SolveMeFirst.

Complete the function solveMeFirst to compute the sum of two integers.

Function prototype:
int solveMeFirst(int a, int b);

where,
a is the first integer input.
b is the second integer input

Return values:
sum of the above two integers
*/


import java.util.*

fun solveMeFirst(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}