package aoc2021.day2

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PositionCalculatorTest : FunSpec({
    val positionCalculator = PositionCalculator()

    test("should load file of movements into list") {
        positionCalculator.loadMovements("test-movements.txt") shouldBe listOf(
            Movement(1, Direction.UP),
            Movement(2, Direction.DOWN),
            Movement(3, Direction.FORWARD)
        )
    }

    test("should calculate horizontal position and depth") {
        val movements = positionCalculator.loadMovements("test-position-calculator.txt")

        positionCalculator.calculatePosition(movements) shouldBe 150
    }

})
