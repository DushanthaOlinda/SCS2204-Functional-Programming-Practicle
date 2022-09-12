class rational(x:Int,y:Int){
    def numer=x
    def denom=y

    def +(that:rational)=new rational(numer*that.denom+that.numer*denom,denom*that.denom)
    def -(that:rational)=new rational(numer*that.denom-that.numer*denom,denom*that.denom)
    def neg=new rational(-this.numer,this.denom)

    override def toString=numer+"/"+denom
}

object a{
    def main(args:Array[String])={
        val x=new rational(3,4)
        val y=new rational(5,8)
        val z=new rational(2,7)
        println(x-y-z)
    }
}