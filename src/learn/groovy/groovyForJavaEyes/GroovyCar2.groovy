package learn.groovy.groovyForJavaEyes

class Car2 {
    final year
    private miles = 0

    Car2(theYear){ year = theYear }

    def getMiles(){
        println "getMiles called"
        miles
    }

    private void setMiles(miles){
        throw  new IllegalAccessException("you're not allowed to change miles")
    }

    def drive(dist){ if (dist > 0) miles += dist}
}
def car = new Car2(2012)

println "Year: $car.year"
println "Miles: $car.miles"
println "Driving"
car.drive(10)
println "Miles: $car.miles"

try{
    print 'Can I set the year? '
    car.year = 1900
}catch (ReadOnlyPropertyException ex){
    println ex.message
}

try{
    print 'Can I set the miles? '
    car.miles = 12
}catch (IllegalAccessException ex){
    println ex.message
}