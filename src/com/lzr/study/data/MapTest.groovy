package com.lzr.study.data
//定义与读取
def colors=[red:'ff0000',green:'00ff00']
//println colors['red']
//println colors.red
//如果使用colors.class  会把class当成一个键
//class java.util.LinkedHashMap
//println colors.getClass()

//1.添加普通对象
//colors.yellow='ffff00'
//println colors
////添加集合对象
//colors.map = [key1:1,key2:2]
//
////[red:ff0000, green:00ff00, yellow:ffff00, map:[key1:1, key2:2]]
//println colors.toMapString()

//遍历map
def teachers = [
        1: [number: '001', name: 'jett'],
        4: [number: '004', name: 'alven'],
        3: [number: '003', name: 'lance'],
        8: [number: '008', name: 'jett']
]
//用键值对的方式
//teachers.each {def key,def value ->
//    println "key=${key}---value=${value}"
//}
//用entry对象的方式
//teachers.each {def teacher ->
//    println "key=${teacher.key}---value=${teacher.value}"
//}
//带索引的方式
//teachers.eachWithIndex{ def teacher,int index->
//    println "index=${index}---key=${teacher.key}---value=${teacher.value}"
//}
//teachers.eachWithIndex{ def key,def value,int index->
//    println "index=${index}---key=${key}---value=${value}"
//}

//map的查找
//def entry=teachers.find{def teacher ->
//    return teacher.value.name=='jett'
//}
//println entry //1={number=001, name=jett}

//def entry=teachers.findAll{def teacher ->
//    return teacher.value.name=='jett'
//}
//println entry//[1:[number:001, name:jett], 8:[number:008, name:jett]]

//def count=teachers.count{def teacher ->
//    return teacher.value.name=='jett'
//}
//println count //2

//实现嵌套查询
//def number=teachers.findAll{def teacher->
//    return teacher.value.name=='jett'
//}.collect(){
//    return it.value.number
//}
//println number.toListString() //[001, 008]
//实现分组查询
//def group=teachers.groupBy {def teacher ->
//    return teacher.value.name=='jett' ? 'group1' : 'group2'
//}
////[group1:[1:[number:001, name:jett], 8:[number:008, name:jett]], group2:[4:[number:004, name:alven], 3:[number:003, name:lance]]]
//println group.toMapString()
//排序  注意：map会返回一个新的map   list是在原来的list中进行排序
def sort=teachers.sort{def t1,def t2 ->
    return t1.key > t2.key ? 1 : -1
}
//[1:[number:001, name:jett], 3:[number:003, name:lance], 4:[number:004, name:alven], 8:[number:008, name:jett]]
println sort.toMapString()