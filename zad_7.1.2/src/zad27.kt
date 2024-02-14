fun main(){
    try {
        val a = readln().toDouble()
        val b = readln().toDouble()
        val c = readln().toDouble()
        if (a+b>c || b+c>a || a+c>b){
            val S = (a*b*c)/2
            val P = a+b+c
            println("Площадь = $S, периметр = $P")
        }
        else{
            println("Не треугольник")
        }
    }
    catch (a: Exception) {
        println("Вы не ввели цифру")}
}