package aoc2021.day2

import aoc2021.asStream

class PositionCalculator {
    fun calculatePosition(fileName: String): Int {
        val movements = this.loadMovements(fileName)

        val position = movements.fold(Position.INITIAL) { position, movement ->
            position.applyMovement(movement)
        }

        return position.x * position.y
    }

    fun calculateCoordinate(fileName: String): Int {
        val movements = this.loadMovements(fileName)

        val coordinate = movements.fold(Coordinate.INITIAL) { coordinate, movement ->
            coordinate.applyMovement(movement)
        }

        return coordinate.depth * coordinate.position
    }

    private fun loadMovements(fileName: String): List<Movement> {
        return fileName.asStream().readLines().map {
            val line = it.split(" ")
            Movement(
                direction = Direction.valueOf(line.first().uppercase()),
                value = line.last().toInt()
            )
        }
    }
}

data class Position(val x: Int, val y: Int) {
    fun applyMovement(movement: Movement) : Position {
        val (value, direction) = movement
        return when (direction) {
            Direction.FORWARD -> copy(x = x + value)
            Direction.DOWN -> copy(y = y + value)
            Direction.UP -> copy(y = y + -value)
        }
    }

    companion object {
        val INITIAL = Position(0, 0)
    }
}

data class Coordinate(val aim: Int, val position: Int, val depth: Int) {
    fun applyMovement(movement: Movement): Coordinate {
        val (value, direction) = movement
        return when (direction) {
            Direction.FORWARD -> copy(position = position + value, depth = depth + aim * value)
            Direction.DOWN -> copy(aim = aim + value)
            Direction.UP -> copy(aim = aim - value)
        }
    }

    companion object {
        val INITIAL = Coordinate(0, 0, 0)
    }
}