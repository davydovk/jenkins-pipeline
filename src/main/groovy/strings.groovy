// Строки: https://stepik.org/lesson/686406/step/1?unit=685501

// строки в одинарных кавычках ( Java Strings )
jstring = 'Java string'

// строки в двойных кавычках ( Groovy Strings )
gstring = "Groovy string"

// Интерполяция строк
 println("GString: $gstring\nJString: ${jstring}")

// Конкатенация строк
println(jstring + ' - ' + gstring)

// Escape-последовательность Unicode
println('Japan currency symbol: \u00A5')

// Экранирование
println('Экранируем: одинарную ковычку \', двойную ковычку \", обратный слеш \\')

// В отличие от Java, в Groovy нет явного символьного литерала. Однако вы можете явно указать,
// что строка Groovy является фактическим символом, тремя различными способами:
char c1 = 'X'
def c2 = 'Y'
def c3 = (char)'Z'

// Индексация
def step = 'Study Stepik'
println(step[0])
println(step[-1])

// Нарезка строк
def slicing = 'Нарезка строк'
println(slicing[0..6]) // срез Нарезка
println(slicing[1..<3]) // срез ар
println(slicing[6..0])  // обратный срез акзераН
println(slicing[4, 1, 8])  // избирательная нарезка зас


// Основные операции над строками (https://groovy-lang.org/gdk.html)
def baseop = 'Study Stepik'

// конкатенацию двух строк String s
println('Study' + 'Stepik!')

// дублирование String s
println('Hi' * 5)

// метод - минус (перегруженный - оператор) удаляет первое вхождение подстроки
println(baseop - 'Step')

// определение длины String
println(baseop.length())
println(baseop.size())

// метод count() определяет количество вхождений подстроки
println(baseop.count('t'))

// метод contains() определяет, содержит ли строка заданную подстроку
println(baseop.contains('pik'))


// Cравнение строк
println('Stepik' == 'Stepik') // возвращает true, т.к. строки равны
println('Stepi' == 'Stepik') // возвращает false, т.к. строки не равны
println('Stepik' <=> 'Stepik') // возвращает 0, т.к. строки равны
println('pik' <=> 'Stepik') // возвращает 1, т.к. pik следует за строкой Stepik
println('Stepik' <=> 'pik') // возвращает -1, т.к. Stepik предшествует строке pik

println('ABCDEFGHIJKLMNOPQRSTUVWXYZ'[0] + 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'[-1])
println('ABCDEFGHIJKLMNOPQRSTUVWXYZ'[0, ('ABCDEFGHIJKLMNOPQRSTUVWXYZ'.size() - 1)])
