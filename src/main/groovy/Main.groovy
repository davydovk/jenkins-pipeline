a = 3
b = 4

if (a == 2) {
  println("a = ${a}")
}
else if (b == 3) {
  println("b = ${b}")
}
else {
  println("a = ${a}, b = ${b}")
}


static def testMethod() {
  'This is Test Method'
}


static String strMethod() {
  'This is string from method'
  return "This is Zero 0"
}


static def paramMethod(param) {
  "Parameter: $param"
}


def paramDefault(String a, String b = 'This is string default argument', def c = 100) {
  println("Text a: ${a}")
  println("Default b, c: ${b}, $c")
}


def exampleList = [1, 'GG', [2, 3, 4]]


println(testMethod())
println(strMethod())
println(paramMethod(1))
paramDefault('Some text')

println(exampleList)
println(exampleList[2])
exampleList.add(100)
println(exampleList)

for ( i in exampleList ) {
  println(i)
}
