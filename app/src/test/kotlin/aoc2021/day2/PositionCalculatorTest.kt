package aoc2021.day2

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PositionCalculatorTest : FunSpec({
    val positionCalculator = PositionCalculator()

    test("should calculate horizontal position and depth") {
        positionCalculator.calculatePosition("test-position-calculator.txt") shouldBe 150
    }

    test("should calculate aim, horizontal position and depth") {
        positionCalculator.calculateCoordinate("test-position-calculator.txt") shouldBe 900
    }

})
