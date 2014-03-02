object Sum {
	// higher  order function used
	/* Compute sum of numbers from a to b -> Using tail recursion */
	def sum(f: Int => Int, a: Int, b: Int): Int = { 
		def loop(a: Int, acc: Int): Int = 
			if (a > b)	acc
			else	loop(a+1, acc+f(a))
		loop(a, 0)		
}

	// unit testing...use anonymous functions 
	def main(args: Array[String]) = {
		def sumOfCubes(a: Int, b: Int): Int = sum((x: Int) => x*x*x, a, b)
	
		def sumOfInts(a: Int, b: Int): Int = sum((x: Int) => x, a, b);
		
		println("Sum of cubes from 2 to 5: " + sumOfCubes(2, 5))
		println("Sum of integers from 4 to 10: " + sumOfInts(4, 10))
	}
}
