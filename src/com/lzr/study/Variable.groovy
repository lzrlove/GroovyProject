package com.lzr.study

//强类型 groovy中的基本数据类型都是以对象的形式存在的 强类型没有初始值可以正常使用
//int x = 1
//double y = 3.14
//char ch = 'a'
//boolean flag = true

//class java.lang.Integer
//class java.lang.Double
//class java.lang.Character
//class java.lang.Boolean


//弱类型 弱类型没有初始值不可以正常使用
def x =1  //java.lang.NullPointerException: Cannot get property 'class' on null object
def y = 3.14
def ch = 'a'
def flag = true

//class java.lang.Integer
//class java.math.BigDecimal
//class java.lang.String
//class java.lang.Boolean

//弱类型是可以自动转型的
x = 'hello'
y = "hello"
ch = '''hello'''
//class java.lang.String
//class java.lang.String
//class java.lang.String

println x.class
println y.class
println ch.class
//println flag.class

