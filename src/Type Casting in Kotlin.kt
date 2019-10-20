


fun main(args: Array<String>){
    var n1 = 2; // this is an int
    var n2 = 3; // this is an int
    var n2Str = "3" // this is a string
    // we cannot assign a variable with different data types
    // n1 = n2Str; // this gives an error as n2str is string and n1 is variable

    // To make this work we need typecasting
    // KotLin like any other language have builtin functions for
    // TypeCasting
    // So to add these two we will do the following

    n2 += n2Str.toInt();

    print("n2 + n2Str = $n2")
}