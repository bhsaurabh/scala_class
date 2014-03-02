object GCD{
	def gcd(x: Int, y: Int): Int = 
		if (y == 0) x else gcd(y, x%y);
	def main(args: Array[String]) =
		println(gcd(21, 14));
}
