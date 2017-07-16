package learn.groovy.groovyForJavaEyes

class WizardTest{
    def static learn(trick, action){
        println trick
        action()
        //返回Class
        return this
    }
}
WizardTest.learn('alohomora',{println ' alohomora'})
.learn('expelliarmus',{println 'hehe'})