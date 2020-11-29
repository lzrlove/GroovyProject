package com.lzr.study.objectclass
//1.在groovy中所有的类型   默认都是public
//2.所有的类都是继承自GroovyObject
class Person implements DefaultTrait{
    String name
    Integer age
    def inCreateAge(Integer year){
        this.age += year
    }

    @Override
    void eat() {
        println "action eat"
    }

    @Override
    void play() {
        println "action eat"
    }
}
