package aoc2021.day2

import aoc2021.asStream

class PositionCalculator {
    private fun loadMovements(fileName: String): List<Movement> {
        return fileName.asStream().readLines().map {
            val line = it.split(" ")
            Movement(
                direction = Direction.valueOf(line.first().uppercase()),
                value = line.last().toInt()
            )
        }
    }

    fun calculatePosition(fileName: String): Int {
        val movements = this.loadMovements(fileName)

        val position = movements.fold(Position.INITIAL) { position, movement ->
            applyMovement(position, movement)
        }

        return position.x * position.y
    }

    private fun applyMovement(position: Position, movement: Movement): Position {
        return when (movement.direction) {
            Direction.FORWARD -> Position(position.x + movement.value, position.y + 0)
            Direction.DOWN -> Position(position.x + 0, position.y + movement.value)
            Direction.UP -> Position(position.x + 0, position.y + -movement.value)
        }
    }
}

data class Position(val x: Int, val y: Int) {
    companion object {
        val INITIAL = Position(0, 0)
    }
}