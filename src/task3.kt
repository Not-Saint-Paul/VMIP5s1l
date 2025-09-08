fun main(args: Array<String>) {
    args.sort().distinct()
    args.forEach { println(it) }
}