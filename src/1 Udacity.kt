

fun main(args: Array<String>){
    println("Lets build an Aquarium")
    // I have 2 fish that breads to times
    var parentFish = 1 + 1;
    println("There are ${parentFish} parent fish" )
    var childrenAfterFirstBreed = 71
    println("They breed ${childrenAfterFirstBreed} fishes for the first time.")
    var childrenAfterSecondBreed = 233
    println("They breed ${childrenAfterSecondBreed} fishes for the second time.")
    var totalFish = childrenAfterFirstBreed + childrenAfterSecondBreed + parentFish
    println("That makes a total of ${totalFish} fishes")
    var preyedUponFish = totalFish - 13
    println("After being preyed upon there were ${preyedUponFish} fish left.")
    println("If one aquarium can accommodate 30 fishes you will need ${preyedUponFish / 30} aquarium ")


    // Object Chaining a more sophisticated approach
   var result = 2.plus(72).plus(233).minus(13).div(30).plus(1)
    print(result);
}