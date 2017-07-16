package learn.groovy.groovyForJavaEyes

def openFile(fileName){
    new FileInputStream(fileName)
}

try{
    openFile("noexistentfile")
}catch (FileNotFoundException ex){
    println "Oops: " + ex
}
// 捕获所有异常
try{
    openFile("")
}catch (ex){
    println "Oops: " + ex
}