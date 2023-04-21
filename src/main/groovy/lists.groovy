// Список: https://stepik.org/lesson/686407/step/2?unit=685502

// https://groovy-lang.org/gdk.html

def numbers = [5, 7, 11, 15, 30]

println("Первое число списка ${numbers[0]}") // 5
println("Длина списка: ${numbers.size()}") // 5
println(numbers[0..2]) // [5, 7, 11]
println(numbers[0..<2]) // [5, 7]

// Добавление элементов в список
println(numbers<<100) // Добавляем число 100 в конец списка

// Объединение списков
def new_list = ['a', 'b', 'c']
def union_list = numbers + new_list
println(union_list)

// Удаление элементов из списка
println(numbers-[7]) // удаляем число 7 из списка
println(numbers)

// Итерация по списку
/*
Перебор элементов списка обычно выполняется с помощью методов each и eachWithIndex,
которые выполняют код для каждого элемента списка
 */

numbers.each {
    println("Item: $it") // it - неявный параметр, соответствующий текущему элементу
}

for (i in numbers) {
    println(i)
}

['Valera', 'Vovan', 'Petro', 'Dmitro'].eachWithIndex {
    it, i -> println("$i: $it")  // it — текущий элемент,  i — индекс
}


// Методы для списков
/*
add         Добавить новое значение в конец списка
addAll      Добавить новые значения в конец списка
contains    Возвращает истину, если список содержит указанное значение
flatten     Возвращает истину, если список содержит указанное значение
get         Возвращает элемент в указанной позиции в списке
getAt       Возвращает элемент в указанной позиции в списке. Эквивалент оператор []
intersect   Возвращает новый список всех элементов, общих для обоих исходный список и входной список
isEmpty     Возвращает истину, если список не содержит элементов
leftShift   Перегружает оператор сдвига влево, чтобы упростить добавление элемента в список
 */

def my_list = [11, 22, 33, 44, 55]
println(my_list)

my_list.add(77)
println(my_list)

my_list.addAll([88, 99])
println(my_list)

println(my_list.contains(88))
println(my_list.get(1))
println(my_list.getAt(1))
println(my_list.isEmpty())
