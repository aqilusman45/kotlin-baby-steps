
//VARIABLES / CONSTANTS / Datatypes
fun main(args: Array<String>){
    // variable can be declared with the keyword "var"
    // type annotation is similar to typescript
    // As name wont change we can assign it to a constant
    // constant are declared using keyword "val"
    val name = "Usman Aqil" //not necessary to declare type as
    // variable is assigned type as per the given value
    var myNum:Int // variable declared but not assigned which means we need type here
    // While declaring a variable we need to make sure that we add a null
    myNum = 4
    // NULL SAFETY
    // VARIABLES can also be null, because of which we use null safety,
    // using this will give compilation errors if we try to access some property
    // of that variable without checking if its null or no, this reduces errors significantly
    var myDep:String? // here we have declared a variable with null safety operator "?"
    myDep = "Software Engineering"
    // myDep = null; // Both are acceptable assignments
    // however if we try to traverse string functions for the var "myDep"
    // this would give compilation error as "myDep" can be null
    //val l = myDep.length // We must use conditions

    val l = if (myDep !== null) myDep.length else null

    // SAFE CALLS
    // use NULL Safety Operator while traversing objects
    print(myDep?.length);

    // ANONYMOUS OBJECT, can be declared without inheriting an interface
    // and can be declared locally
    val human = object {
        var body = object {
            var legs = 2;
            var hands = 2;
            var head = object {
                var eyes = 2;
                var nose = 1;
            }
        }
    }
    // SAFE CALLS can also be used in chains validating each property of the object while traversal

    println("Humans Have: " + human?.body?.legs + "Legs"); // concatenation
    println("name:"+ name); // concatenation
    println("number:$myNum"); // string template
    println("My department" + myDep);// concatenation
    println("Letters (including space) in the name of my depart are: $l"); // string template
}