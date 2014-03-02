object Factorial {
	def factorial(n: Int): Int = 
		if (n == 1) 1 else n*factorial(n-1)

	def main(args: Array[String]) =
		println(factorial(4));
}
