// Классы: https://stepik.org/lesson/686411/step/1?unit=685506

// Обычный класс
class Person {   // начало класса с именем Person
    String name  // строковое поле с именем name
    Integer age  // целочисленное поле с именем age

    def increaseAge(Integer years) {  // это определение метода класса Person
        this.age += years
    }
}


def person = new Person()
person.name = 'Vanya'
person.age = 37
println(person.name)
person.increaseAge(3)
println(person.age)


// Внутренний класс
class Outer {
    private String privateStr = 'outer'

    def callInnerMethod() {
        new Inner().methodA()   // создается экземпляр внутреннего класса и вызывается его метод
    }

    class Inner {      // определение внутреннего Inner класса, внутри внешнего Outer класса
        def methodA() {
            // будучи закрытым, доступ к полю вшешнего класса есть у внутреннего классом
            println "${privateStr}."
        }
    }
}


def outer = new Outer()
outer.callInnerMethod()


// Анонимный внутренний класс
class Outer2 {
    private String privateStr = 'some string'

    def startThread() {
        new Thread(new Runnable() {    // безымяный внутрений класс обратите внимание на ()
            void run() {
                println "${privateStr}."
            }
        }).start() // метод start вызывается
    }
}


def o = new Outer2()
o.startThread()


// Абстрактный класс
// абстрактные классы должны быть объявлены с ключевым словом abstract

abstract class Abstract {
    String name

    // абстрактные методы также должны быть объявлены с помощью ключевого слова abstract
    abstract def abstractMethod()

    def concreteMethod() {
        println 'concrete'
    }
}

// Суперклассы
// Родительские классы имеют общие видимые поля, свойства или методы с дочерними классами.
// Дочерний класс может иметь не более одного родительского класса.
// Ключевое слово extends используется непосредственно перед указанием типа суперкласса.
