fun main(args: Array<String>) {
    args.sort()
    args.distinct()
    args.forEach { println(it) }
}