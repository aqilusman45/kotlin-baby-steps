//import java.math.BigDecimal
//import java.math.BigInteger

fun main(args:Array<String>){
    // Null Test
    val nullTest: Int ? = 4
//    nullTest?.inc() ?:0.
    val i = nullTest?.plus(1) ?: 0
    println(i)
}