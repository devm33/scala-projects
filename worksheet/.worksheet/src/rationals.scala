object rationals {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(47); 
  val x = new Rational(1, 3);System.out.println("""x  : Rational = """ + $show(x ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(29); 
  val y = new Rational(5, 7);System.out.println("""y  : Rational = """ + $show(y ));$skip(8); val res$2 = 
  x + y;System.out.println("""res2: Rational = """ + $show(res$2));$skip(5); val res$3 = 
  -x;System.out.println("""res3: Rational = """ + $show(res$3));$skip(8); val res$4 = 
  y - x;System.out.println("""res4: Rational = """ + $show(res$4));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : Rational = """ + $show(z ));$skip(12); val res$5 = 
  x - y - z;System.out.println("""res5: Rational = """ + $show(res$5));$skip(8); val res$6 = 
  y + y;System.out.println("""res6: Rational = """ + $show(res$6));$skip(10); val res$7 = 
  x max y;System.out.println("""res7: Rational = """ + $show(res$7));$skip(8); val res$8 = 
  x < y;System.out.println("""res8: Boolean = """ + $show(res$8));$skip(8); val res$9 = 
  x + y;System.out.println("""res9: Rational = """ + $show(res$9))}
  
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