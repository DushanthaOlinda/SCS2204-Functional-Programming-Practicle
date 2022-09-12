var bank: List[BankAccount] = List()

class BankAccount(balance: Double){
    var b=balance

    def transfer(a: BankAccount, d: Double): BankAccount={
        this.b=this.b-d
        a.b=a.b+d   
        a
    }

    override def toString: String ="Balance: " + b
}

object Account{
    def main(args: Array[String])={
        val a = new BankAccount(100)
        val b = new BankAccount(200)
        val c = new BankAccount(300)
        bank = a::b::c::Nil
        println(bank)
        println(a.transfer(b, 50))
        println(bank)
    }
}