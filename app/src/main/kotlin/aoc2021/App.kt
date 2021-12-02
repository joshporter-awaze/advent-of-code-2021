package aoc2021

import aoc2021.day1.SonarSweeper
import aoc2021.day2.PositionCalculator


fun main() {
    day1()
    day2()
}

fun day2() {
    val positionCalculator = PositionCalculator()
    val part1 = positionCalculator.calculatePosition("day2.txt")

    println("--- DAY 2 ---")
    println(part1)

    val part2 = positionCalculator.calculateCoordinate("day2.txt")

    println(part2)
}

fun day1() {
    val sweeper = SonarSweeper()
    val input = "day1.txt".asStream().readLines().map { it.toInt() }

    val result = sweeper.numberOfIncreaseInDepth(input)

    print("--- DAY 1 ---")
    println(result.toString())

    val sumResult = sweeper.sumOfMeasurementsInSlidingWindow(measurements = input)

    println(sumResult.toString())
}
