```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val evenNumbersRemovedList = list.filter { it % 2 != 0 }.toMutableList() //Use filter to create a new list
    println(list) // Output: [1, 2, 3, 4, 5]
    println(evenNumbersRemovedList) //Output: [1, 3, 5] 

    val map = mutableMapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    val oddNumbersMap = map.filter { it.value % 2 != 0 }.toMutableMap() //Use filter to create a new map
    println(map) // Output: {a=1, b=2, c=3}
    println(oddNumbersMap) // Output: {a=1, c=3}

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val oddNumbersSet = set.filter { it % 2 != 0 }.toMutableSet() //Use filter to create a new set
    println(set) // Output: [1, 2, 3, 4, 5]
    println(oddNumbersSet) // Output: [1, 3, 5]
}
```