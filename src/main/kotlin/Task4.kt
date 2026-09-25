fun main(args : Array<String>) {
    val counter = args.groupingBy { it }.eachCount()
    for (element in args.sorted().distinct()) {
        println("$element ${counter[element]}")
    }
//    print(counter.toString().replace("{", "").replace("=", " ").replace(", ", "\n").replace("}", ""))
}