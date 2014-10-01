object factorial {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(81); 
  
  
  def fac(a: Int, b: Int = 1): Int =
  	if (a == 0) b*1 else fac(a-1, a*b);System.out.println("""fac: (a: Int, b: Int)Int""");$skip(12); val res$0 = 
  
  fac(1);System.out.println("""res0: Int = """ + $show(res$0));$skip(9); val res$1 = 
  fac(2);System.out.println("""res1: Int = """ + $show(res$1));$skip(9); val res$2 = 
  fac(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(9); val res$3 = 
  fac(4);System.out.println("""res3: Int = """ + $show(res$3));$skip(9); val res$4 = 
  fac(5);System.out.println("""res4: Int = """ + $show(res$4));$skip(9); val res$5 = 
  fac(6);System.out.println("""res5: Int = """ + $show(res$5))}
  
}