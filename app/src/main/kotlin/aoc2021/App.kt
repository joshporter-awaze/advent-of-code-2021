package aoc2021

import aoc2021.day1.SonarSweeper
import aoc2021.day2.PositionCalculator


fun main() {
    day1()
    day2()
}

fun day2() {
    val positionCalculator = PositionCalculator()
    val input = positionCalculator.loadMovements("day2.txt")
    val result = positionCalculator.calculatePosition(input)

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
