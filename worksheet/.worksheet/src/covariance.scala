object covariance {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
  val a: Array[NonEmpty] = Array(new NonEmpty(1, Empty, Empty));System.out.println("""a  : Array[NonEmpty] = """ + $show(a ));$skip(29); 
  val b: Array[IntSet]  =  a;System.out.println("""b  : Array[IntSet] = """ + $show(b ));$skip(15); 
  b(0) = Empty;$skip(25); 
  val s: NonEmpty = a(0);System.out.println("""s  : NonEmpty = """ + $show(s ))}
}


abstract class IntSet

class NonEmpty(v: Int, l: IntSet, r: IntSet) extends IntSet

object Empty extends IntSet