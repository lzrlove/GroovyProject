package com.lzr.study.parse

import groovy.json.JsonOutput
import groovy.json.JsonSlurper


//对象转成json字符串
def list=[new Person(name:'lzr',age:18),new Person(name:'loy',age:18)]
def json = JsonOutput.toJson(list)
println json //[{"age":18,"name":"lzr"},{"age":18,"name":"loy"}]
//格式化
/**
 * [
 *  {
 *    "age": 18,
 *    "name": "lzr"
 *  },
 *  {
 *     "age": 18,
 *      ":loy"
 *   }
 * ]
 */
println JsonOutput.prettyPrint(json)

//json字符串转成对象
def jsonSluper=new JsonSlurper()
def object=jsonSluper.parse("[{\"age\":18,\"name\":\"lzr\"},{\"age\":18,\"name\":\"loy\"}]".getBytes())
println object //[[age:18, name:lzr], [age:18, name:loy]]
println object.name
