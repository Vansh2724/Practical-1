fun main(args: Array<String>) {
//    val array = intArrayOf(12,32,45,65,67)
    print("Enter the size of the array: ")
    val size = readln().toInt()
    val array = IntArray(size)
    for (i in 0 until size) {
        print("${i + 1}-element: ")
        array[i] = readln().toInt()
    }
    println("The Array :-")
    var max = array[0]
    for (i in 0 until array.size) {
        if (array[i] > max) {
            max = array[i]
        }
        println("array[$i] = ${array[i].toInt()}")
    }
    println("Maximum element among the array list is :- $max")
}