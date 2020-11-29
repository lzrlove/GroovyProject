package com.lzr.study.objectclass

def person = new Person(name:'lzr',age:18)
println "name="+person.name+"  age="+person.age
println "name="+person.getName()+"  age="+person.getAge()

person.inCreateAge(10)

person.eat()