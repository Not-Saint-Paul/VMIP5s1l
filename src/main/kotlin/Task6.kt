fun main(args: Array<String>) {
    val adArgs : Array<String> = if (args.isEmpty()) {
        arrayOf(readln())
    }
    else {
        args
    }

    val counter = adArgs.groupingBy { it }.eachCount()
    for (element in adArgs.sorted().distinct().sortedByDescending{ counter[it] }) {
        println("$element ${counter[element]}")
    }
}