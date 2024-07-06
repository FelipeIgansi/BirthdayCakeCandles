import kotlin.random.Random

fun birthdayCakeCandles(candles: Array<Int>): Int {
    if (candles.isEmpty()) return 0

    var bigCandle = candles.first()
    var count = 0

    for (candle in candles) {
        if (candle > bigCandle) {
            bigCandle = candle
            count = 1
        } else if (candle == bigCandle) {
            count++
        }
    }

    return count
}


fun main() {
//    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val candles = randomCandleGenerate().trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}


fun randomCandleGenerate(): String {
    val size = Random.nextInt(1, 10)
    var candles = ""
    for (i in 0..size) {
        candles += "${Random.nextInt(1, 5)} "
    }
    return candles
}
