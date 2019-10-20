

// Increment Decrement
// ++ increment
// ++ before variable means pre increment
// ++ after variable means post increment
// -- before variable means pre decrement
// -- after variable means post decrement

fun main(){
    var n1 = 10
    var n2 = 20
    // Increment is number increased by one so <number> == <number> +1 == ++<number> == <number>++
    println(++n1) // Expected Output 11
    println(n1) // Expected Output 11
    println(n1++) /* Expected Output 11 */
    println(n1) // Expected Output 12

    // Decrement is number decreased by one so <number> == <number> +1 == --<number> == <number>--
    println(--n2) // Expected Output 19
    println(n2) // Expected Output 19
    println(n2--) /* Expected Output 19 */
    println(n2) // Expected Output 18

    var sum = ++n1 + n2 // Expected Output 31
    println(sum)
    sum = n1-- + n2 // 30
    println(sum)

    sum = --n1 + n2 // Expected Output 29
    println(sum)
    sum = n1-- + n2 // Expected Output 29
    println(sum)

    n1 = 10
    n2 = 10
    // In the expression below the variable "n1" will first be incremented
    // then an edition will be performed
    sum = n1+++n2;

    println("$sum , $n1, $n2")
}