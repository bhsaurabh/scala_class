class Rational(x: Int, y: Int) {
    // constructor for only 1 arg given...call primary constructor
    def this(x: Int) = this(x, 1)
    
    // a test that is performed...throws IllegalArgumentException if test fails
    // enforce a pre-condition
    require(y != 0, "Denominator must be non-zero")
    
    // tail recursive GCD function for simple fractions
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    private val g = gcd(x, y)
    val numer = x / g
    val denom = y / g
    
    
    // operations
    def add(that: Rational): Rational = 
        new Rational(numer * that.denom + denom * that.numer, denom * that.denom)
    
    def neg: Rational = new Rational(-numer, denom)
    
    def subtract(that: Rational): Rational = add(that.neg)
    
    
    // For representing rational
    override def toString = numer + "/" + denom
    
    // Comparison operations
    def less(that: Rational) = numer * that.denom < that.numer * denom
    
    // get max rational
    def max(that: Rational) = if (this.less(that)) that else this
}