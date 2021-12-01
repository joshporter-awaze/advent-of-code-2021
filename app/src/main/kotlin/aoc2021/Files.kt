package aoc2021

import java.io.BufferedReader

fun String.asStream(): BufferedReader =
    {}::class.java.classLoader.getResourceAsStream(this)?.bufferedReader()
        ?: throw RuntimeException("Could not load file $this as a resource")
