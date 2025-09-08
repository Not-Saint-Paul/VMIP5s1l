fun main(args: Array<String>) {
    val sortedArgs = args.sort()
    val counts = sortedArgs.groupingBy { it }.eachCount()
    val sortedOut = out.sortedWith(compareByDescending<String> { counts[it] }.thenBy { it })

    for (element in sortedOut) {
        println("$element ${counts[element]}")
}