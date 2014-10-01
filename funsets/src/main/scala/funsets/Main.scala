package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  printSet((x: Int) => x == 5)
  printSet(intersect( (x: Int) => (x < 5), (x: Int) => (x > 0)))
  printSet((x: Int) => (x % 2 == 0))
}
