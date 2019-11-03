fun main(args:Array<String>){
    // List with two null items
    // Method 1
    listOf(null, null)
    // Method 2
    // Here the items with in the list can be null
    var myList1: List<String?> = listOf(null, null)
    // Method 3
    // here the variable in whole can contain null value
    var myList2: List<String>? = null
    // Method 4
    // Here the list itself and the items within it both can be null
    var myList3: List<String?>? = listOf(null, null)
}