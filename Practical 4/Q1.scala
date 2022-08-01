import scala.compiletime.ops.float
def interet(amount:Float)={
    amount match
        case amount if amount<20000.00 => amount*0.02
        case amount if amount>20000.00 => amount*0.035
        case amount if amount<200000.00 => amount*0.04
        case amount if amount>200000.00 => amount*0.065
    
}

@main
def main()={
    println(interet(10000.00))
    println(interet(30000.00))
    println(interet(100000.00))
    println(interet(300000.00))
}