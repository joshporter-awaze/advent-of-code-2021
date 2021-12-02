package aoc2021.day2

import aoc2021.asStream

class PositionCalculator {
    fun loadMovements(fileName: String): List<Movement> {
        return fileName.asStream().readLines().map {
            val line = it.split(" ")
            Movement(
                direction = Direction.valueOf(line.first().uppercase()),
                value = line.last().toInt()
            )
        }
    }

    fun calculatePosition(movements: List<Movement>): Int {
        var position = Position.INITIAL

        for (movement in movements) {
            position = applyMovement(position, movement)
        }
        
        return position.x * position.y
    }

    private fun applyMovement(position: Position, movement: Movement): Position {
        return when (movement.direction) {
            Direction.FORWARD -> position.add(movement.value, 0)
            Direction.DOWN -> position.add(0, movement.value)
            Direction.UP -> position.add(0, -movement.value)
        }
    }
}

data class Position(val x: Int, val y: Int) {
    fun add(dx: Int, dy: Int): Position {
        return Position(x + dx, y + dy)
    }

    companion object {
        val INITIAL = Position(0, 0)
    }
}