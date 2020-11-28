package com.lzr.study.closure

import jdk.nashorn.internal.ir.ReturnNode

//闭包的定义与使用
//无参数
def closure = {
    println "hello"
}
//调用
closure()
closure.call()

//默认的参数
def closure2 = {
    println "hello:${it}"
}
closure2.call("lzr")

//有参数
def closure3 = { String name, int age ->
    println "hello ${name} : age${age}"
}
closure3.call("lzr", 22)

//闭包的返回值
def closure4 = {
    println "hello"
    return "123"
}
def result = closure4.call()
println "result:" + result