import scala.compiletime.ops.string
def toUpper(name:String)={
    name.toUpperCase
}

def toLower(name:String)={
    name.toLowerCase
}

def toFirstUpper(name:String)={
    name.substring(0,2).toUpperCase+name.substring(2)
}

def toFirstAndLastUpper(name:String)={
    name.substring(0,1).toUpperCase+name.substring(1,name.length-1).toLowerCase+name.substring(name.length-1).toUpperCase
}

def formatName(name:String,fun:String=>String)={
    fun(name)
}

@main
def main()={
    println(formatName("benny",toUpper))
    println(toFirstUpper("niroshan"))
    println(formatName("SAMAN",toLower))
    println(toFirstAndLastUpper("kumara"))
}