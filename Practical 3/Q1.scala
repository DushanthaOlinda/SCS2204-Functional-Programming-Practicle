import scala.math.Pi

//Question 1
def disk(r:Int)=r*r*Pi

//Question 2
def far(cel:Int)=cel*1.8000+32.00

//Question 3
def sphere(r:Int)=4/3*r*r*r*Pi

//Question 4
val price = 24.95f
val discount = 0.4f
val shippingCostForEach__First50 = 3.00f
val shippingCostForEach__Additional = 0.75f

def TotalPrice(copies: Int) : Float = copies * price
def DiscountedPrice(totalPrice: Float) : Float = totalPrice * (1 - discount)
def ShippingCost(copies: Int) : Float = copies > 50 match {
    case true => 50 * shippingCostForEach__First50 + (copies - 50) * shippingCostForEach__Additional
    case false => copies * shippingCostForEach__First50
}

def TotalWholeSaleCost(copies: Int) : Float = {
    val totalPrice = TotalPrice(copies)
    val discountedPrice = DiscountedPrice(totalPrice)
    val shippingCost = ShippingCost(copies)
    discountedPrice + shippingCost
}

//Question 5
val minPerKm__EasyPace = 8
val minPerKm__TempoPace = 7

def RunningTime(pace: Array[Int], minPerKm: Int) : Int = {
    var temp = 0
    for (d <- pace) temp = temp + (d * minPerKm)
    temp
}

def TotalRunningTime(easyPace: Array[Int], tempoPace: Array[Int]): Int = RunningTime(easyPace, minPerKm__EasyPace) + RunningTime(tempoPace, minPerKm__TempoPace)

@main
def run()={
    println(disk(5))
    println(far(35))
    println(sphere(5))
    println(TotalWholeSaleCost(60))
    
    val easy = Array(2, 2)
    val tempo = Array(3)
    println(TotalRunningTime(easy, tempo))
}