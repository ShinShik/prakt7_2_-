import kotlin.math.roundToInt

fun main(){
    try {
        val k = readln().toDouble()
        val a = readln().toDouble()
        val b = readln().toDouble()
        val discriminant = a * a - 4 * b
        if (discriminant >= 0) {
            var x1 = (-a + Math.sqrt(discriminant.toDouble())) / 2
            var x2 = (-a - Math.sqrt(discriminant.toDouble())) / 2
            if (x1 >= -k && x1 <= k) {
                x1 = (x1*1000).roundToInt().toDouble()/1000
                println("x1 = $x1 в интервале (-$k, $k)")
            }
            else {
                x1 = (x1*1000).roundToInt().toDouble()/1000
                println("x1 = $x1 не в интервале (-$k, $k)")
            }
            if (x2 >= -k && x2 <= k) {
                x2 = (x2*1000).roundToInt().toDouble()/1000
                println("x2 = $x2 в интервале (-$k, $k)")
            }
            else {
                x2 = (x2*1000).roundToInt().toDouble()/1000
                println("x2 = $x2 не в интервале (-$k, $k)")
            }
        }
        else {
            println("Не имеет вещественных корней")
        }
    }
    catch (a: Exception) {
        println("Вы не ввели цифру")}
}