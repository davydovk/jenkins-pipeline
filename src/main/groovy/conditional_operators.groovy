// Операторы отношений: https://stepik.org/lesson/686402/step/2?unit=685497

int x = 15
int y = 15

if (x > y) {
    println("$x больше ${y}")
}
else if (x < y) {
    println("$y больше $x")
}
else {
    println("$y равен $x")
}

def z = 5
def result = ""

switch (z) {
    case "bar":
        result += "bar"

    case [1, 2, 3, 4, 'inList']:
        result = 'list'
        break

    case 10..20:
        result = 'range'
        break

    case Integer:
        result = 'integer'
        break

    case Number:
        result = 'number'
        break

    default:
        result = "default"
}

println(result)

def string = 'Hello'
result = ( string != null && string.length() >0 ) ? 'Found' : 'Not found'
result2 = string ? 'Found' : 'Not found'
println(result)
println(result2)
