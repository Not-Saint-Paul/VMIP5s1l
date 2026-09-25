fun main(args : Array<String>) {
    val counter = args.groupingBy { it }.eachCount()
    for (element in args.sorted().distinct().sortedByDescending{ counter[it] }) {
        println("$element ${counter[element]}")
    }
}