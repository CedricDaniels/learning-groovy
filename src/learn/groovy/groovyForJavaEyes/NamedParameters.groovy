package learn.groovy.groovyForJavaEyes

class Robot {
    def type, height, width
    def access(location, weight, fragile){
        println "Received fragile? $fragile, weigth: $weight, loc: $location"
    }
}
//几个具名参数组合作为Map形参
robot = new Robot(type:'arm', width: 10, height: 50)
println "$robot.type, $robot.height, $robot.width"

robot.access(x:30, y:20, z:10, 50, false)
//修改具名参数位置
robot.access(50, false, x:30, y:20, z:10)
robot.access(50, x:30, y:20, false, z:10)
