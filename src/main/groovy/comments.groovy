// Комментарии: https://stepik.org/lesson/686401/step/6?unit=685496

// Это однострочные комментарии
println('Hello, World!') // выводит сообщение

/* Это многострочные
комментарии
 */

/**
 * Этот код для очень занятого студента, который не хочет вводить его руками!
 */
class Passenger {
    /** Фамилия и имя типа String */
    String firstName
    String lastName

    /**
     * Это метод hello
     *
     * @param принимает строку
     * @return возвращает строку
     */
    String hello() {
        "Hello ${firstName} ${lastName}"
    }
}

Passenger p = new Passenger()
p.firstName = "Alex"
p.lastName = "Fox"
p.hello()
