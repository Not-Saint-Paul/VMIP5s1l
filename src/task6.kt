fun main() {
    val args = readLine()

    val sortedArgs = args.sortedArray()
    val counts = sortedArgs.groupingBy { it }.eachCount()
    val out = sortedArgs.distinct().toTypedArray()
    val sortedOut = out.sortedWith(compareByDescending<String> { counts[it] }.thenBy { it })

    for (element in sortedOut) {
        println("$element ${counts[element]}")
    }
}