package aoc2021

import aoc2021.day1.SonarSweeper


fun main() {
    day1()
}

fun day1() {
    val sweeper = SonarSweeper()
    val input = "day1.txt".asStream().readLines().map { it.toInt() }

    val result = sweeper.numberOfIncreaseInDepth(input)

    println(result.toString())

    val sumResult = sweeper.sumOfMeasurementsInSlidingWindow(measurements = input)

    println(sumResult.toString())
}
