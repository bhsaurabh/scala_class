object Sum1 {
	// use currying
	/*def sum(f: Int => Int): (Int, Int) => Int = {
		def sumF(a: Int, b: Int): Int = 
			if (a > b) 0
			else	f(a) + sumF(a+1, b)
		sumF	// return last statement
	}*/


	def sum(f: Int => Int)(a: Int, b: Int):Int = 
		if (a > b) 0
		else f(a) + sum(f)(a+1, b)

	/* Unit testing */
	def main(args: Array[String]) {
		println(sum(x => x)(1, 10))
	}
}
