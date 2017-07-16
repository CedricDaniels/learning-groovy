package learn.groovy.groovyForJavaEyes
//safe-navigation ?.
def foo(str){
    str?.reverse()
}
println foo('evil')
println foo(null)