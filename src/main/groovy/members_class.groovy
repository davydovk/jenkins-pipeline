// Члены класса: https://stepik.org/lesson/686411/step/3?unit=685506

// Позиционные параметры
class Animal {
    String name
    Integer age
    // Объявление конструктора
    Animal(name, age) {
        this.name = name
        this.age = age
    }
}

def p1 = new Animal('Alex', 1)    // вызов конструктора, как в Java
def p2 = ['Valera', 2] as Animal  // конструктор с использованием принуждения с ключевым словом as
Animal p3 = ['Marie', 3]          // конструктор с использованием принуждения в присваивании


// Именованные параметры
class People {   // конструктор не объявлен в классе
    String name
    Integer age
}

def people1 = new People()                 // в экземпляре не указаны параметры
def people2 = new People(name: 'Valera')   // параметр name, указанный в экземпляре
def people3 = new People(age: 1)           // age параметр, указанный в экземпляре
def people4 = new People(name: 'Petro', age: 2) // параметры name & age, указанные в экземпляре


// Поля
class Field {
    String name    // создает резервное поле частного имени String, методы getName и setName
    int age       // создает резервное частное целое поле age, методы getAge и setAge
}

Field p = new Field()
p.setName('Valera')
println p.getName()
Field a = new Field()
a.setAge(33)
println(a.getAge())

// Доступ к свойствам осуществляется по имени, и геттер или сеттер будут вызываться прозрачно,
// если только код не находится в классе, который определяет свойство:
class Person2 {
    String name
    void name(String name) {
        /* this.name будет напрямую обращаться к полю,
           доступ к свойству осуществляется из класса, который его определяет. */
        this.name = "Wonder $name"
    }
    String title() {
        /* аналогично доступ для чтения осуществляется непосредственно в поле имени */
        println this.name
    }
}
def person2 = new Person2()

// доступ на запись к свойству осуществляется вне класса Person, будет неявно вызывать setName
person2.name = 'Diana'

// доступ для чтения к свойству осуществляется вне класса Person, будет неявно вызывать getName
println person2.name == 'Diana'

person2.name('Woman') // вызовет метод name для Person, который выполняет прямой доступ к полю

// вызовет метод title для Person, который выполняет прямой доступ для чтения к полю
println (person2.title() == 'Wonder Woman')


