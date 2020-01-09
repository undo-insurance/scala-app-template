package app.undo

import scala.io.Source

object Utils {

  def manhattanDist(x1: Int, y1: Int, x2: Int, y2: Int) = Math.abs(x1 - x2) + Math.abs(y1 - y2)

  def printInput = {
    println("Hi, here's your input:")
    Source.fromResource("input").getLines.foreach(println)
  }
}
