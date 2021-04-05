package com.pin.taylorgit

import org.scalatest.FunSuite

class Taylor7Test extends FunSuite {
  val epsilon = 0.05

  private def y(x: Double) = 1 / (1 - x)

  private def precision(x: Double, n: Int) = {
    val y_val = y(x)
    val y_taylor = Taylor7.apply(x, n)
    math.abs( (y_val - y_taylor) / y_val )
  }

  test("Taylor7.apply_plus") {
    assert( precision(0.5, 5) < epsilon )
  }

  test("Taylor7.apply_zero") {
    assert( math.abs(Taylor7.apply(0, 5) - 1) < 0.001 )
  }

  test("Taylor7.apply_minus") {
    assert( precision(-0.5, 5) < epsilon )
  }

}
