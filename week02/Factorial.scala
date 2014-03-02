object Factorial {
	// Tail recursive form of factorial
	def factorial(x: Int): Int = {
		def loop(acc: Int, x: Int): Int = 
			if (x == 1) acc
			else loop(acc * x, x - 1)
		loop(1, x)
	}
	
	/* For unit testing */
	def main(args: Array[String]) = {
		println(factorial(5))
	}
}

