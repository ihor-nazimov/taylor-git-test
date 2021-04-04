package com.pin.taylorgit

object TaylorTest extends App {
  val x: Double = 0.3

  val y = 1/(1-x)
  val y_taylor = Taylor7.apply(x)
  println(f"x = $x\n1/(1-x) = $y%1.3f\ntaylor = $y_taylor%1.3f")
  println(f"Precision is ${math.abs((y-y_taylor)/y)*100}%2.1f%%")
}