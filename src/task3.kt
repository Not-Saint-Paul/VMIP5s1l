fun main(args: Array<String>) {
    args.sort()
    val out = args.distinct()
    out.forEach { println(it) }
}