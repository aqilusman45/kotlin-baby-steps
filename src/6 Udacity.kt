fun main() {
    // val is not changeable if you reassign its reference
    // but if you want to change the array that this val points to
    // you can mutate it.
    val myList: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    myList.remove(1);
    print(myList);

    // LOOPS
    // To loop we need something to loop on lets use arrays
    // Lets create a new array


    val myArray: Array<String> = arrayOf("Usman", "Umer", "Ali")
    print(myArray[0]);
    myArray

}