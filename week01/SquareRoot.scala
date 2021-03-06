object SquareRoot {
	// Newton method for square root calculations
	def sqrt(x: Double): Double = {
		def sqrtIter(guess: Double): Double = 
		 	if (isGoodEnough(guess)) guess 
		 	else sqrtIter(improve(guess));

		def isGoodEnough(guess: Double): Boolean = 
			abs(guess * guess - x)/x < 0.001;

		def abs(x: Double): Double = 
			if (x >= 0) x else -x;

		def improve(guess: Double): Double = 
			(guess + x/guess) / 2;

		sqrtIter(1.0);
	}

	def main(args: Array[String]) = {
		println(sqrt(2));
		println(sqrt(4));
	}	
}
