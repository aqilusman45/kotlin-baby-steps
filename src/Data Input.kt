

fun main(args: Array<String>){
    // Use readLine() to read user input
    // this stops the program there
    print("Please Enter Your Name");
    var name: String = readLine()!!;
    print("Please Enter Your Age");
    // Here we use "!!" operator to make sure name or age are non nullable
    //ype casting is a process of converting one data type to another type
    // , for example – converting int to long, long to double etc.
    // here toInt() is typecasting
    var age: Int = readLine()!!.toInt();
    print("Your name is $name\n Your age is $age")
}