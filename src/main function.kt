

// Type Annotations are similar to Typescript
// User Defined Function
fun myString(msg: String):String{
    // Msg is of type string, therefore IntelliSense gives
    // all the string functions.
   return msg.toUpperCase()
}

// This is the Top Level main function, runs every time we run the app.
// kotlin scripts wont work without it.
fun  main(args:Array<String>){
    println("Hello World");
    println("Welcome to Kotlin");
    var newMsg = myString("all lowercase msg");
    print(newMsg);
}