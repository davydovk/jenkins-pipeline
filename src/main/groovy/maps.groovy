// Карта: https://stepik.org/lesson/686407/step/3?unit=685502

/*
Карта (также известная как ассоциативный массив, словарь, таблица и хэш) — это неупорядоченная коллекция ссылок
на объекты. Доступ к элементам в коллекции Map осуществляется по значению ключа. Ключи, используемые в Map,
могут быть любого класса. Когда мы вставляем в коллекцию Map, требуются два значения: ключ и значение.
Индексация карты с тем же ключом может затем получить это значение.
 */

def passengers = ['name': 'Valera', 'age': 33]
def divisors = [3 : [3, 1], 12: [6, 4, 3, 2]]

println("Имя пассажира: ${passengers['name']}")
println("Возраст пассажира: ${passengers['age']}")
println(passengers['test'])
println(divisors[3])
println(divisors[12][1])


def m = ['first' : 100, 'second' : 500, 'last' : 999]
m.put('age', 33) // добавит ключ : значение
println m.containsKey('age') // вернет true or false в зависимости есть ли ключ
println m.values().asList() // вернет список значений[100, 500, 999, 33]
println m.keySet() // вернет список ключей [first, second, last, age]
println m.size()  // вернет размер карты 4
println m.get('second') // вернет значения ключа second, т.е 500


// Итерация Map
def map = [
            Apple: 42,
            Raspberry: 54,
            Onion: 13,
            Pear: 70
]

map.each {entry -> println("key: ${entry.key} | value: ${entry.value}")}
map.eachWithIndex{entry, int i -> println("$i - Name: $entry.key Price: $entry.value")}
