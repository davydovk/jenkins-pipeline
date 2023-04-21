// Интерфейсы: https://stepik.org/lesson/686411/step/2?unit=685506

/*
интерфейс должен быть объявлен с использованием ключевого слова interface

interface Shape {
    void draw(String name)  // интерфейс определяет только сигнатуры методов, реализации НЕТ
}
 */


// Класс реализует интерфейс, если он определяет интерфейс в своем списке реализаций или
// если это делает любой из его суперклассов:
interface Shape {
    void draw(String name)  // интерфейс определяет только сигнатуры методов, реализации НЕТ
}
// Прямоугольник объявляет интерфейс Shape с помощью ключевого слова Implements.
class Rectangle implements Shape {
    // Затем реализует требуемый метод draw(String name)
    void draw(String name) {
        println "painted $name"
    }
}

def rectangle = new Rectangle()
// Любой экземпляр Rectangle также является экземпляром интерфейса Shape.
println rectangle instanceof Shape // вернет true


// Интерфейс может расширять другой интерфейс:
interface Shape2 {
    void draw(String name)  // интерфейс определяет только сигнатуры методов, реализации НЕТ
}
// интерфейс ExtendedShape расширяет интерфейс Shape с помощью ключевого слова extends
interface ExtendedShape extends Shape2 {
    void delete(String name)
}
