object Sum {
	// higher  order function used
	/* Compute sum of numbers from a to b */
	def sum(f: Int => Int, a: Int, b: Int): Int = 
		if (a > b)	0
		else	f(a) + sum(f, a+1, b)

	// example
	def main(args: Array[String]) = {

		def cube(x: Int): Int = x * x * x
	
		def id(x: Int): Int = x
	
		def sumOfCubes(a: Int, b: Int): Int = sum(cube, a, b)
	
		def sumOfInts(a: Int, b: Int): Int = sum(id, a, b);
		
		println("Sum of cubes from 2 to 5: " + sumOfCubes(2, 5))
		println("Sum of integers from 4 to 10: " + sumOfInts(4, 10))
	}
}
