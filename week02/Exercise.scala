object Exercise {
	// calculate product of all numbers in an interval
	
	def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
		if (a > b)	zero
		else	combine(f(a), mapReduce(f, combine, zero)(a+1, b))

	def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x*y, 1)(a, b)

	def fact(n: Int): Int = product(x => x)(1, n)

	/* Unit testing */
	def main(args: Array[String]) = {
		println("Factorial of 5: " + fact(5))
	}
}
