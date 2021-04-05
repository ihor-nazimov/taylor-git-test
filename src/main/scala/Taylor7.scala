package com.pin.taylorgit

import scala.math.pow
/**
 * Variant 7:
 * 1/(1-x)
 */

object Taylor7 {
  def apply(x: Double, n: Int = 4): Double = {
    //step 1: 4 members
    // f(0) = 1/(1-a) = 1
    // f'(0) = 1/(1-a)^2 = 1
    // f"(0) = 2/(1-a)^3 = 2
    // f"'(0) = 6/(1-a)^4 = 6
    require(n > 0)
    Array.range(0, n).foldLeft(0.0) (
      (z: Double, i: Int) => z + math.pow(x, i) )

  }
}
