import java.util.*

fun main(){
    // Input
    println("Please Enter Your Year of Birth")
    var year = readLine()!!.toInt();

    // Process
    var currentYear = Calendar.getInstance().get(Calendar.YEAR);
    var age = currentYear - year

    // Output
    println("You are $age years old, $currentYear");
}