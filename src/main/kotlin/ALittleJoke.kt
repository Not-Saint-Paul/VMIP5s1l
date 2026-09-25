fun aLittleJoke() {
    var balls = 2
    var newBalls : String?

    println("Muzhik enters a river.")

    while (balls > 0) {
        print("Something grabs his balls and says:\n- What you choose: +$balls or -$balls?\nHis answer was: ")
        newBalls = readln()

        if (newBalls.isEmpty()) {
            println("Muzhik was Gordon Freeman.")
            break
        }
        else if (("+$balls" == newBalls) or (balls.toString() == newBalls)) {
            balls += newBalls.toInt()
            print("Something let him go. Muzhik came out of the river with $balls balls.\nHe enters again to return his balls.")

            if (balls == Int.MIN_VALUE) {
                print("Muzhik was a 32 bit variable.")
            }
        }
        else if ("-$balls" == newBalls) {
            println("Something let him go. Muzhik came out of the river with no balls.")
            break
        }
        else {
            println("Something said:\n- Don't break an anecdote, suka!")
            break
        }
    }
}
fun aLittleJokeTest(newBalls : String) {
    var balls = 2
    print("Muzhik enters a river.\nSomething grabs his balls and says:\n- What you choose: +$balls or -$balls?\nHis answer was: \"$newBalls\"\n")

    if (("+$balls" == newBalls) or (balls.toString() == newBalls)) {
        balls += newBalls.toInt()
        print("Something let him go. Muzhik came out of the river with $balls balls.\nHe enters again to return his balls.")

        if (balls == Int.MIN_VALUE) {
            print("Muzhik was a 32 bit variable.")
        }
    }
    else if ("-$balls" == newBalls) {
        println("Something let him go. Muzhik came out of the river with no balls.")
    }
    else if (newBalls.isEmpty()) {
        println("Muzhik was Gordon Freeman.")
    }
    else {
        println("Something said:\n- Don't break an anecdote, suka!")
    }
    println()
}