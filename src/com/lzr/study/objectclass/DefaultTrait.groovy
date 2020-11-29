package com.lzr.study.objectclass

//声明trait中的方法和任何常规方法一样
//trait声明抽象方法需要在实现类中实现
trait DefaultTrait {
    abstract void eat()
    void play(){
        println "play"
    }
}