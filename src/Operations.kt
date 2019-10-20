fun main(args:Array<String>){
    println("+++++MATH CALCULATOR+++++")
    println("Enter Number 1")
    var n1 = readLine()!!.toInt();
    println("Enter Number 2")
    var n2 = readLine()!!.toInt();
    var sum: Int?;
    sum = n1 + n2;
    println("Sum = $sum");
}