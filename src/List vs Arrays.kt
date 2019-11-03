// There are collections in Kotlin
// There are two types of collection
// 1- Arrays
// 2- Lists


// Arrays are classes
// Arrays are a container that holds fixed number of items of same data type
// We can mutate object or array the val reference points to

// Lists are Interfaces
// There are two types of Lists
// Mutable and Immutable
// We can change Mutable but cant change Mutable

fun main(args: Array<String>) {
    // Creating Lists in Kotlin "listof()"
    val words = listOf("cup","cup","dog","spectacles")
    println("This is list of words $words")

    // Basic List operations
    val num = listOf(1,2,3,4,5,6,7)

    var sum = num.sum()
    var max = num.max()
    var min = num.min()
    var len = num.count()
    var avg = num.average()

    // List Index methods
    val newWords = words + listOf("coal", "spectacles", "cup", "cement", "person")

    // get value by index
    println("Value on index 4 is ${newWords.get(4)}")

    // get value using sqaure bracket notation
    println("Value on index 4 is ${newWords[4]}")

    // get index of element
    println("Index of cup is ${newWords.indexOf("cup")}")

    // Get the index of the last occurrence of the word
    println("Last index of cup is ${newWords.lastIndexOf("cup")}")

    // Get the index number of last occurrence in list
    println("Element at last index is ${newWords.lastIndex}")

    val myNumbers: Array<Int?> = arrayOf(1,2,3,4,5,6,7)
}
