object week2 {
	def sum(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 0 else f(a) + sum(f)(a + 1, b)
                                                  //> sum: (f: Int => Int)(a: Int, b: Int)Int
	
	def product(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 1 else f(a) * product(f)(a + 1, b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
	product((x:Int) => x)(1,4)                //> res0: Int = 24
	
	def factorial(a: Int): Int =
		product((x: Int) => x)(1,a)       //> factorial: (a: Int)Int
		
	factorial(4)                              //> res1: Int = 24
	
	factorial(5)                              //> res2: Int = 120
	
	
}