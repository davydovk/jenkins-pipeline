// Цикл for: https://stepik.org/lesson/686405/step/2?unit=685500

/*
for (инициализация; условие; итерация) {
    инструкция
}
 */

// Пример 1
String msg = ''
for (int i = 0; i < 4; i++) {
    msg += 'Hi '
}
println msg

// Пример 2
for ( i in 0..9 ) {
    print i + ' | '
}

// Пример 3
def text = "QWERTY"
def list = []
for (ch in text) {
    list.add(ch)
}
println list
