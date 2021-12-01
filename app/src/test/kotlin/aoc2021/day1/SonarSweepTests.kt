package aoc2021.day1

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

internal class SonarSweepTests: FunSpec({
    val sweeper = SonarSweeper()

    test("should count how many increases in list of depth measurements") {
        val listOfDepthMeasurements = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        sweeper.numberOfIncreaseInDepth(listOfDepthMeasurements) shouldBe 7
    }

    test("should sum measurements in a sliding window") {
        val listOfDepthMeasurements = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        sweeper.sumOfMeasurementsInSlidingWindow(listOfDepthMeasurements) shouldBe 5
    }
})