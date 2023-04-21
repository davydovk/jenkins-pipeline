// Методы: https://stepik.org/lesson/686410/step/1?unit=685505

/*
Метод определяется с помощью ключевого слова def. Простейшая форма определения метода без параметров:

def methodName() {
    // инструкции

Метод с параметрами

def step(name) {
  println "${name} Welcome !!!"
}

step('Valera')

параметры - это переменные, которые используются при создании функции. Здесь это name
аргументы - это фактические значения (данные), которые передаются функции при вызове. Здесь это 'Valera'

}
 */

def step() {
    println('Welcome!')
}


def step2(name) {
    println("Hi, ${name}")
}


static def step3(int a, int b) {
    return a + b
}


// В Groovy последнее выражение,  в теле метода, может быть возвращено без обязательного использования
// ключевого слова return. Специально для коротких методов  его лучше опустить для краткости:
static String toStr1() { return "hello" }
static String toStr2() { "hello" }

static def someMethod() { 'method called' }                 // метод без объявленного возвращаемого типа и параметра
static String anotherMethod() { 'another method called' }   // метод с явным типом возврата и без параметра
static def thirdMethod(param1) { "$param1 passed" }         // метод с параметром без определенного типа
static String fourthMethod(String param1) {                 // статический метод со строковым параметром
    "$param1 passed"
}


// Именованные параметры
def user(Map args) { "${args.name}: ${args.password}" }
user(name: 'Alex', password: 1234)


// Смешивание именованных и позиционных параметров
def user(Map args, Integer id) { println "${args.name}: ${args.password}, #ID is ${id}" }

user(name: 'Alex', password: 1234, 1)  // Вызов метода с доп числовым аргументом типа Integer
user(2, name: 'Petro', password: 3909) // Вызов метода с измененным порядком следования аргументов


/*
Groovy поддерживает методы с переменным числом аргументов.
Они определяются следующим образом:
def methodName(p1, …, pn, T… args)
Здесь methodName поддерживает n аргументов по умолчанию, а также неопределенное
количество дополнительных аргументов, превышающих n.
 */

def check(Object... args) { args.length }
// В этом примере определяется метод check(), который может принимать любое количество аргументов, в том числе
// вообще не иметь аргументов. args.length вернет количество переданных аргументов
println check() == 0 // true
println check(1) == 1 // true
println check(1, 2) == 2 // true



step()
step2('Max')
result = step3(5, 7)
println(result)
println(toStr1())
println(toStr2())
