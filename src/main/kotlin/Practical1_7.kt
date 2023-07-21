fun main() {
    print("Enter Number: ")
    var number = readln().toInt()
    val factorial = fact(number)
    println("By Telrec Keyword ,Factorial of $number = $factorial")
}

tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}



