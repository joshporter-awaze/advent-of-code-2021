package aoc2021

import aoc2021.day1.SonarSweeper
import aoc2021.day2.PositionCalculator


fun main() {
    day1()
    day2()
}

fun day2() {
    val positionCalculator = PositionCalculator()
    val result = positionCalculator.calculatePosition("day2.txt")

    println(result)
}

fun day1() {
    val sweeper = SonarSweeper()
    val input = "day1.txt".asStream().readLines().map { it.toInt() }

    val result = sweeper.numberOfIncreaseInDepth(input)

    println(result.toString())

    val sumResult = sweeper.sumOfMeasurementsInSlidingWindow(measurements = input)

    println(sumResult.toString())
}
