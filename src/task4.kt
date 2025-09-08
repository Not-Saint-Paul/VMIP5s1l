fun main(args: Array<String>) {
    args.sort()
    val counts = args.groupingBy { it }.eachCount()
    val out = args.distinct()

    for (element in out) {
        println("$element ${counts[element]}")
    }
}