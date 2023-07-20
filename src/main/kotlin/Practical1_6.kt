fun main() {
    fun sum(a: Int , b: Int , c: Int): Int {
        return a + b + c
    }
    fun sub(a: Int , b: Int , c: Int): Int {
        return a - b -c
    }
    fun mul(a: Int , b: Int , c: Int): Int {
        return a * b * c
    }
    fun div(a: Int , b: Int ): Int {
        return a / b
    }
    print("enter the first number:- ")
    var x = readln().toInt()
    print("enter the first number:- ")
    var y = readln().toInt()
    print("enter the third number:- ")
    var z = readln().toInt()


    println("The Addition of $x,$y and $z is:-  " +sum(x,y,z))
    println("The Subtraction of $x,$y and $z is:- " +sub(x,y,z))
    println("The Multiplication of $x,$y and $z is:- " +mul(x,y,z))
    println("The Division of $x and $y   is:- " +div(x,y))

}