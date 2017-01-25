class Rational(n:Int,d:Int) {
    
    require(d!=0)
    
    private val g = gcd(n.abs,d.abs)

    val numer: Int = n/g
    val denom: Int = d/g
    
    def this(n:Int) = this(n,1) //auxiliary constructor
    
    override def toString = numer + "/" + denom
    
    def add(that: Rational):Rational =  
        new Rational(
            numer*that.denom + that.numer*denom,
            denom*that.denom
        )
 
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)

    def lessThan(that: Rational) = numer*that.denom < that.numer*denom

    def max(that: Rational) = if (this.lessThan(that)) that else this

    def min(that: Rational) = if (this.lessThan(that)) this else that

    def + (that:Rational):Rational = 
        new Rational(
            numer*that.denom+that.numer*denom,
            denom*that.denom
        )

    def * (that:Int):Rational =
        new Rational(
            numer*that,
            denom
        )

    def * (that:Rational):Rational = 
        new Rational(
            numer*that.numer,
            denom*that.denom
        )

    def - (that:Int):Rational =
        new Rational(
            numer-that*denom,denom
        )

    def - (that:Rational):Rational = 
        new Rational(
            numer*that.denom - that.numer*denom,
            denom*that.denom
        )

    def + (that:Int):Rational = 
        new Rational(
            numer+that*denom,denom
        )

    def / (that:Rational):Rational = 
        new Rational(
            numer*that.denom,
            denom*that.numer
        )
 
    def / (that:Int):Rational = 
        new Rational(
            numer*1,
            denom*that
        )
}

implicit def intToRational(x:Int) = new Rational(x)
