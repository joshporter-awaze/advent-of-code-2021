package aoc2021

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

internal class FilesTest: FunSpec({
    test("should read file and as list of strings") {
        "test.txt".asStream().readLines() shouldBe listOf("one thing", "two thing", "three thing")
    }
})