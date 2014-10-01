package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c > r) {
      throw new IllegalArgumentException()
    }
    else if (c == 0 || c == r) {
      1
    }
    else {
      pascal(c-1, r-1) + pascal(c, r-1)
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def stack(c: List[Char], p: List[Char]): Boolean = {
      if (c.isEmpty) {
        p.isEmpty
      }
      else if (c.head == '(') {
        stack(c.tail, '(' +: p)
      }
      else if (c.head == ')') {
        if (p.isEmpty) {
          false
        }
        else {
          stack(c.tail, p.tail)
        }
      }
      else {
        stack(c.tail, p)
      }
    }
    stack(chars, List[Char]())
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def count(m: Int, c: List[Int], t: List[Int]): Int = {
      val diff: Int = m - t.sum
      if (diff < 0 || c.isEmpty) {
        0
      }
      else if (diff == 0) {
        1
      }
      else {
        count(m, c, c.head +: t) + count(m, c.tail, t)
      }
    }
    count(money, coins.sortBy(x => -x), List(0))
  }
}
