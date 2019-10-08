fun main() {

    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    println("Hipotenusa: ${pitagoras(x, y)}")
}

fun pitagoras(x: Int, y: Int): Double {
    var hip: Double

    hip = Math.sqrt(((x*x) + (y*y)).toDouble())

    return hip
}

