fun main(){
    try {
        val x1 = readln().toDouble()
        val y1 = readln().toDouble()
        val x2 = readln().toDouble()
        val y2 = readln().toDouble()
        val R = readln().toDouble()
        val P = readln().toDouble()
        val centerDistance1 = Math.sqrt((x1 - P) * (x1 - P) + y1 * y1)
        val centerDistance2 = Math.sqrt((x2 - P) * (x2 - P) + y2 * y2)
        if (y1 < 0 || y2 < 0) {
            println("False")
        }
        else if (centerDistance1 > R || centerDistance2 > R) {
            println("False")
        }
        else{
            println("Да, попадают");
        }
    }
    catch (a: Exception) {
        println("Вы не ввели цифру")}
}