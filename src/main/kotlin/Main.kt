fun main() {
    println("Введите натуральное число в десятичной системе:")
    val decimalNumber = readLine()?.toIntOrNull()

    if (decimalNumber != null && decimalNumber >= 0) {
        val binaryRepresentation = convertToBinary(decimalNumber)
        println("Двоичное представление числа $decimalNumber: $binaryRepresentation")
    } else {
        println("Введено некорректное число. Пожалуйста, введите натуральное число.")
    }
}

fun convertToBinary(decimalNumber: Int): String {
    return Integer.toBinaryString(decimalNumber)
}