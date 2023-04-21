// Обработка исключений: https://stepik.org/lesson/686409/step/1?unit=685504

/*
try – блок кода, в котором может произойти исключение
catch – блок кода, в котором происходит обработка исключения
finally – блок кода, который является необязательным, но при его наличии выполняется в любом случае независимо от результатов выполнения блока try.
throw – используется для возбуждения исключения
throws – используется в сигнатуре методов для предупреждения, о том что метод может выбросить исключение.

Общий синтаксис такой:

try {
    // тут отслеживаются ошибки
}
catch (type_exception_1 exceptionObj) {
    // обрабатываем Error1
}
catch (type_exception_2 exceptionObj) {
    // обрабатываем Error2
}
finally {
    // код, который будет выполнен всегда после завершения блока try
}
 */

try {
    println '0xb3'.toLong()   // это вызовет исключение
    println 'finished'        // эта точка никогда не должна быть достигнута
} catch ( e ) {
    println e
    println e.getMessage()
    println e.printStackTrace()
}

try {
    def a = 5, b = 0
    println(a / b)
}
catch (error) {
    println(error)
}
finally {
    println('It\'s OK!')
}

try {
    def a = 5, b = 0, c = 'gg'
    println(a / b)
}
catch (MissingMethodException | ArithmeticException err) {
    println(err)
}
finally {
    println('It\'s finally!')
}
