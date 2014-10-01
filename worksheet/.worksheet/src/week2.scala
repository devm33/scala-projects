object week2 {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(105); 
	def sum(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 0 else f(a) + sum(f)(a + 1, b);System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(101); 
	
	def product(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 1 else f(a) * product(f)(a + 1, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(28); val res$0 = 
	product((x:Int) => x)(1,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(62); 
	
	def factorial(a: Int): Int =
		product((x: Int) => x)(1,a);System.out.println("""factorial: (a: Int)Int""");$skip(17); val res$1 = 
		
	factorial(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(16); val res$2 = 
	
	factorial(5);System.out.println("""res2: Int = """ + $show(res$2))}
	
	
}