class rational(x:Int,y:Int){
    def numer=x
    def denom=y

    def neg=new rational(-this.numer,this.denom)

    override def toString=numer+"/"+denom
}

object a{
    def main(args:Array[String])={
        val x=new rational(3,4)
        println("x="+x)
        println("x.neg="+x.neg)
    }
}