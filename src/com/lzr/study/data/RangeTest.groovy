package com.lzr.study.data

//定义
//Range相当于一个轻量级的List
def range=1..10
println range[0]
println range.contains(8)
println range.from //起点
println range.to   //终点

//遍历
//range.each {
//    println it
//}
//for(i in range){
//    println i
//}

def getGrade(Number score){
    def result
    switch(score){
        case 0..<60:
            result='不及格'
            break;
        case 60..100:
            result='及格'
            break;
        default:
            result='输入异常'
    }
//    return result
}
println getGrade(50)
println getGrade(80)



