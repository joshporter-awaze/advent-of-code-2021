package aoc2021.day2

data class Movement(val value: Int, val direction: Direction)

enum class Direction {
    FORWARD, DOWN, UP
}