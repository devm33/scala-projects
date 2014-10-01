object factorial {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def fac(a: Int, b: Int = 1): Int =
  	if (a == 0) b*1 else fac(a-1, a*b)        //> fac: (a: Int, b: Int)Int
  
  fac(1)                                          //> res0: Int = 1
  fac(2)                                          //> res1: Int = 2
  fac(3)                                          //> res2: Int = 6
  fac(4)                                          //> res3: Int = 24
  fac(5)                                          //> res4: Int = 120
  fac(6)                                          //> res5: Int = 720
  
}