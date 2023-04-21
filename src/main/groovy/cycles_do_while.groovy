// Цикл do - while: https://stepik.org/lesson/686405/step/4?unit=685500

/*
do {
    инструкция
} while(условие)
 */

def count = 5
def fact = 1
do {
    fact *= count--
} while(count > 1)
println fact // fact: 120
