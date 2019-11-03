// Strings
fun main() {
    var trout = "trout"
    var haddock = "haddock"
    var snapper = "snapper"
    println("I like eating $trout, $haddock and $snapper.")

    // Switch Cases "When" in Kotlin
    val fishName = "Trout"

    when(fishName.length){
        0-> println("Invalid FishName")
        in 3..12 -> println("Good Fish Name")
        else -> println("Please Enter Fishname again")
    }
}