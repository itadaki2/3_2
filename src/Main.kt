fun main() {
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()

    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()

    print("Введите третье число: ")
    val num3 = readLine()!!.toInt()

    if (num1 == num2 || num1 == num3 || num2 == num3) {
        println("есть одинаковые числа")
    } else {
        val sum = num1 + num2 + num3
        val srednie = sum / 3
        println("Среднее: $srednie")
    }
}
