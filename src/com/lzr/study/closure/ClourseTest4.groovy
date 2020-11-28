package com.lzr.study.closure

//在同一个闭包中，都是相同的对象
//def scriptClouser = {
//    println this//代表闭包定义处的类
//    println owner//代表闭包定义处的类或者对象
//    println delegate//代表任意对象，delegate默认为owner指向的对象
//}
//scriptClouser.call()
//com.lzr.study.closure.ClourseTest4@42530531
//com.lzr.study.closure.ClourseTest4@42530531
//com.lzr.study.closure.ClourseTest4@42530531

//在普通类或方法中定义闭包，三者是相同的
class Person {
//    def static classClouser = {
//        println "classClouser:" + this
//        println "classClouser:" + owner
//        println "classClouser:" + delegate
//    }
//
//    def static method() {
//        def classClouser = {
//            println "methodclassClouser:" + this
//            println "methodclassClouser:" + owner
//            println "methodclassClouser:" + delegate
//        }
//        classClouser.call()
//    }
}
//Person.classClouser.call()
//Person.method()
//classClouser:class com.lzr.study.closure.Person

//闭包内定义闭包    this内部对象    owner和delegate是外部对象
//def nestClouser = {
//    def innerClouser = {
//        println "innerClouser:" + this
//        println "innerClouser:" + owner
//        println "innerClouser:" + delegate
//    }
//    innerClouser.call()
//}
//nestClouser.call()
//innerClouser:com.lzr.study.closure.ClourseTest4@5ba88be8
//innerClouser:com.lzr.study.closure.ClourseTest4$_run_closure1@1c33c17b
//innerClouser:com.lzr.study.closure.ClourseTest4$_run_closure1@1c33c17b

//修改默认的delegate对象
//Person p=new Person();
//def nestClouser = {
//    def innerClouser = {
//        println "innerClouser:" + this
//        println "innerClouser:" + owner
//        println "innerClouser:" + delegate
//    }
//    innerClouser.delegate=p;
//    innerClouser.call()
//}
//nestClouser.call()
//innerClouser:com.lzr.study.closure.ClourseTest4@c94fd30
//innerClouser:com.lzr.study.closure.ClourseTest4$_run_closure1@77102b91
//innerClouser:com.lzr.study.closure.Person@45312be2

/**
 * 闭包的委托策略
 * Closure.OWNER_FIRST 优先owner
 * Closure.OWNER_ONLY  只允许owner
 * Closure.DELEGATE_FIRST 优先delegate
 * Closure.DELEGATE_ONLY  只允许delegate
 */
class Student{
    String name
    def pretty={"My name is ${name}"}
    String toString(){
        pretty.call()
    }
}
def student=new Student(name:'lzr')

class Teacher{
//    String name
}
//def teacher=new Teacher(name:'andy')

//只写这一句话不能改变委托对象,因为其默认的委托策略还是Closure.OWNER_FIRST(优先从owner中找),
//所以要设置为Closure.DELEGATE_FIRST(让他优先从delegate中找)
student.pretty.delegate=teacher
student.pretty.resolveStrategy=Closure.DELEGATE_FIRST
println student.toString() //My name is andy

//如果把Teacher的name去掉，优先delegate，找不到再去owner找
//当把stu的委托策略改成Closure.DELEGATE_ONLY时,会报错,因为此时找不到name
def teacher=new Teacher()
student.pretty.resolveStrategy=Closure.DELEGATE_FIRST
println student.toString() //My name is lzr