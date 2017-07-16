
String [] greetings = ["Hello", "Hi", "Howdy"]
for(String greeting : greetings) {
    println greeting
}
for(greeting in greetings) {
    println greeting
}
greetings.each { println it }