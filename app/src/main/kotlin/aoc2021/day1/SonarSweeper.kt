package aoc2021.day1

class SonarSweeper {
    fun numberOfIncreaseInDepth(measurements: List<Int>): Int {
        return measurements.zipWithNext { a, b -> a < b }.count { b -> b }
    }

    fun sumOfMeasurementsInSlidingWindow(measurements: List<Int>, window: Int = 3): Int {
        return measurements.windowed(window) { it.sum() }.zipWithNext().count { (a, b) -> a < b }
    }
}