fun main(){
    try {
        var k = readln().toDouble()
        var l = readln().toDouble()
        var n = readln().toDouble()
        var m = readln().toDouble()
        if (l%k==0.0 && n%k==0.0 && m%k==0.0){
            println("k является делителем для всех чисел")
        }
        else{
            println("k не является делителем для всех чисел")
        }
    }
    catch (a: Exception) {
        println("Вы не ввели цифру")}
}