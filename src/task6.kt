fun main() {
    val input = readLine() ?: ""
    val args = input.split(" ")

    val counts = args.groupingBy { it }.eachCount()
    val out = args.distinct()
    val sortedOut = out.sortedWith(compareByDescending<String> { counts[it] }.thenBy { it })

    for (element in sortedOut) {
        println("$element ${counts[element]}")
    }
}