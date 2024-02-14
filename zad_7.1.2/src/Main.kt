import kotlin.math.abs
fun main() {
    try {
        var a = readln().toDouble()
        var b = readln().toDouble()
        var c = readln().toDouble()
        if (a >= b && b >= c){
            a*=2
            b*=2
            c*=2
        }
        else{
            a = abs(a)
            b = abs(b)
            c = abs(c)
        }
        println("$a,$b,$c")
    }
    catch (a: Exception) {
        println("Вы не ввели цифру")}
}