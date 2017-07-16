package learn.groovy.groovyForJavaEyes

class Car{
    def miles = 0
    final year

    Car(theYear){ year = theYear }
}
Car2 car = new Car2(2008)
println "Year: $car.year"
println "Miles: $car.miles"
println "Setting miles"
car.miles = 25
println "Miles: $car.miles"