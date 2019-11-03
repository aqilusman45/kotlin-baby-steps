// There are two types of data type
// Primitive and Non Primitive
// Primitive data type are basic data type like int, char, boolean
// While Non primitive are array, list, objects
// When we add a type annotation to a variable its "boxes" the
// value of the variable in an object number
// it is automatically done by kotlin compiler

//e.g
fun main(args: Array<String>){
    val myNum: Number = 2 // now I can access the the methods available for number object using dot notation
    print(myNum.toString())
}