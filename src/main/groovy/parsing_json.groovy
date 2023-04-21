// Парсинг и создание JSON: https://stepik.org/lesson/723841/step/4?unit=724965

//import groovy.json.JsonSlurper // сделайте импорт JsonSlurper
//
//def jsonSlurper = new JsonSlurper() // создаем объект JsonSlurper
//
//// Затем мы используем функцию parseText класса JsonSlurper для анализа некоторого текста JSON.
//def object = jsonSlurper.parseText('{ "name": "Evgeniy Lestopadov" } ')
//
//// Когда мы получаем объект, мы можем получить доступ к значениям в строке JSON через ключ.
//println object.getClass()  // class org.apache.groovy.json.internal.LazyMap
//println object         // [name:Evgeniy Lestopadov]
//println object.name    // Evgeniy Lestopadov


// JsonOutput

//import groovy.json.JsonOutput // сделайте импортJsonOutput
//def json = JsonOutput.toJson([name: 'John Doe', age: 42])
//
//println json // {"name":"John Doe","age":42}
