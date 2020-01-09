package app.undo

import org.scalatest.flatspec.AnyFlatSpec

class UtilsSpec extends AnyFlatSpec {

  behavior of "manhattanDist"

  it should "return a manhattan distance of X for the points (5,7) and (-2,3)" in {
    assert(Utils.manhattanDist(5, 7, -2, 3) == 11)
  }
}
