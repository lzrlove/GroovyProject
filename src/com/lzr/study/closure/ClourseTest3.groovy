package com.lzr.study.closure

import javax.print.DocFlavor

/**
 * String 相关的API
 */

String str = "2and3is5"

//each遍历
str.each {
    //println it
    //对每一个字符2倍
    String s -> print s.multiply(2)//22aanndd33iiss55
}

//find查找符合条件的第一个字符
println str.find{
    String s->s.isNumber() //2
}

//findAll查找所有符合条件的
def list = str.findAll{
    String s ->s.isNumber() //[2, 3, 5]
}
println list.toListString()

//any 查找是否存在符合条件的字符
def result = str.any {
    String s ->s.isNumber()
}
println result //true

//every 查找是否所有字符都符合条件
def result2 = str.every {
    String s ->s.isNumber()
}
println result2 //false

//对每个一个字符操作后保存到一个集合里面
def list2 = str.collect {
    it.toUpperCase()
}
println list2.toListString() //[2, A, N, D, 3, I, S, 5]