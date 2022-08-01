def matchInt(x:Int)={
    x match
        case x if x<=0 => println("Negative/Zero")
        case x if x%2==0 => println("Even")
        case x if x%2!=0 => println("Odd")   
}

@main
def main()={
    matchInt(-1)
    matchInt(0)
    matchInt(1)
    matchInt(10)
}