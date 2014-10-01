package week4

trait List[T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}



object Main extends App {
  
  def nth[T](n: Int, list: List[T]): T = {
    if(n == 0) list.head
	else nth(n - 1, list)
  }
  
  val l = new Cons(1, new Cons(2, new Nil))
}
