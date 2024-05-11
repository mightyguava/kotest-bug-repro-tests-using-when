package io.kotest.examples.mpp.whendupe

import io.kotest.assertions.fail
import io.kotest.core.spec.style.FunSpec

enum class Hello {
   A,
   B,
   C,
}

class BarTests : FunSpec({
   test("bad when") {
      println("BarTests.bad when: pid=${ProcessHandle.current().pid()}, thread=${Thread.currentThread().id}")
      val num = Hello.A

      when (num) {
         Hello.A -> {}
         else -> fail("oops")
      }
   }
})
