
object Empty extends IntSet {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); 
	def contains(x: Int): Boolean = false;System.out.println("""contains: (x: Int)Boolean""");$skip(58); 
	def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty);System.out.println("""incl: (x: Int)IntSet""")}
}


object intsets {;$skip(63); 

  val t1 = new NonEmpty(3, Empty, Empty);System.out.println("""t1  : NonEmpty = """ + $show(t1 ));$skip(21); 
  val t2 = t1 incl 4;System.out.println("""t2  : IntSet = """ + $show(t2 ));$skip(21); 
  val t3 = t2 incl 1;System.out.println("""t3  : IntSet = """ + $show(t3 ));$skip(36); 
  val t4 = t3 incl 5 incl 6 incl -6;System.out.println("""t4  : IntSet = """ + $show(t4 ))
}



abstract class IntSet {
	def incl(x: Int): IntSet
	def contains(x: Int): Boolean
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
	def incl(x: Int): IntSet =
		if (x < elem) new NonEmpty(elem, left incl x, right)
		else if (x > elem) new NonEmpty(elem, left, right incl x)
		else this
		
	def contains(x: Int): Boolean =
		if (x < elem) left contains x
		else if (x > elem) right contains x
		else true
		
	override def toString = "{" + left + elem + right + "}"
}