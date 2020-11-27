package com.lzr.study

//单引号
//def name = 'lzr \n hh'  //换行使用\n
def name = 'lzr'

//双引号
//def name2 = "lzr"
//双引号可以进行一些变量的操作赋值 这时候类型： org.codehaus.groovy.runtime.GStringImpl
def name2 = "hello:${name}"

//三引号 原始格式
//def name3 ='''lzr'''
//换行这样写
def name3 ='''lzr   
hh'''


//println name
//println name2
//println name3

//正常都是String类型
//println name.class
//println name2.class
//println name3.class


def string='hello'
//def string2='Hello'
def string2='el'
//groovy中常用的string相关的API
println string>string2 //hello 和Hello比较  true
println string[1..2]  //el
//减法
println string.minus(string2) //hlo
//逆序
println string.reverse() //olleh
//首字母大写
println string.capitalize() //Hello
//字符串中是否有数字字符
println string.isEmpty() //false