package week4

	object Zero extends Nat {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
		def isZero = true;System.out.println("""isZero: => Boolean""");$skip(76); 
		def predecessor = throw new NoSuchElementException("predecessor of zero");System.out.println("""predecessor: => Nothing""");$skip(33); 
		def successor = new Succ(Zero);System.out.println("""successor: => week4.Succ""");$skip(27); 
		def + (that: Nat) = that;System.out.println("""+ : (that: week4.Nat)week4.Nat""");$skip(71); 
		def - (that: Nat) = throw new NoSuchElementException("negative nat");System.out.println("""- : (that: week4.Nat)Nothing""");$skip(33); 
		override def toString = "Zero";System.out.println("""toString: ()java.lang.String""")}
	}

object everywhere_objects {;$skip(61); 



	val one = new Succ(Zero);System.out.println("""one  : week4.Succ = """ + $show(one ));$skip(25); 
	val two = new Succ(one);System.out.println("""two  : week4.Succ = """ + $show(two ));$skip(23); 
	val three = one + two;System.out.println("""three  : week4.Nat = """ + $show(three ))
}

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
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