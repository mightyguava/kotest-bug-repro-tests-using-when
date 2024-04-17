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
      val num = Hello.A

      when (num) {
         Hello.A -> {}
         else -> fail("oops")
      }
   }
})
