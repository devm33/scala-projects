/*
object rationals {
  val x = new Rational(1, 3)
  x.numer
  x.denom
  val y = new Rational(5, 7)
  x + y
  -x
  y - x
  val z = new Rational(3, 2)
  x - y - z
  y + y
  x max y
  x < y
  x + y
  
}

class Rational(x: Int, y: Int) {
	require(y != 0, "denominator must be nonzero")
	
	def this(x: Int) = this(x, 1)
	
	private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
	val numer = x / gcd(x, y)
	val denom = y / gcd(x, y)
	
	def < (that: Rational) = numer * that.denom < denom * that.numer
	
	def * (that: Rational) = new Rational(numer * that.numer, denom * that.denom)
	
	def max(that: Rational) = if(this < that) that else this
	
	def + (that: Rational) =
		new Rational(
			numer * that.denom + denom  * that.numer,
			denom * that.denom
		)
	
	def  - (that: Rational) = this + (-that)
		
	def unary_- = new Rational(-numer, denom)
	
	override def toString = numer + "/" + denom
	
}
*/