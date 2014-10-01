package week4

object everywhere_objects {
	val one = new Succ(new Zero())            //> one  : week4.Succ = Successor of Zero
	val two = new Succ(one)                   //> two  : week4.Succ = Successor of Successor of Zero
	val three = one + two                     //> three  : week4.Nat = Successor of Successor of Successor of Zero
}



abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}

class Zero extends Nat {
		def isZero = true
		def predecessor = throw new NoSuchElementException("predecessor of zero")
		def successor = new Succ(new Zero())
		def + (that: Nat) = that
		def - (that: Nat) = throw new NoSuchElementException("negative nat")
		override def toString = "Zero"
	}

class Succ(n: Nat) extends Nat {
	def isZero = false
	def predecessor = n
	def successor = new Succ(this)
	def + (that: Nat) = this.predecessor + that.successor
	def - (that: Nat) = this.predecessor - that.predecessor
	override def toString = "Successor of " + n
}



/*
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}
*/
/*
class Succ(n: Nat) extends Nat {
	def isZero = false
	def predecessor = n
	def successor = new Succ(this)
	def + (that: Nat) = this.predecessor + that.successor
	def - (that: Nat) = this.predecessor - that.predecessor
	override def toString = "Successor of " + n
}
*/
/*
object Zero extends Nat {
	def isZero = true
	def predecessor = throw new NoSuchElementException("predecessor of zero")
	def successor = new Succ(Zero)
	def + (that: Nat) = that
	def - (that: Nat) = throw new NoSuchElementException("negative nat")
	override def toString = "Zero"
}
*/
/*
object main extends App {
	println(Zero)
	val one = new Succ(Zero)
	println(one)
	val two = new Succ(one)
	println(two)
	val three = one + two
	println(three)
	println(three - one)
	println(two + three)
	println(one - two)
}
*/