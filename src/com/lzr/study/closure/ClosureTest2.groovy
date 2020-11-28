package com.lzr.study.closure

import javax.xml.transform.Result

/**
 * 匿名内联函数，也称为一个闭包。
 * 基本类型相关的API
 */
int x = fab(5)

//upto 1*2*3*4*5

int fab(int number) {
    int result = 1
    1.upto(number, { num -> result *= num })
    return result
}
//源码如下：
//public static void upto(Number self, Number to, @ClosureParams(FirstParam.class) Closure closure) {
//    int self1 = self.intValue();    //1
//    int to1 = to.intValue();       //number
//    if (self1 > to1) {
//        throw new GroovyRuntimeException("");
//    } else {
//        for(int i = self1; i <= to1; ++i) {
//            closure.call(i);   //result = result *i
//        }
//    }
//}
println x

//5*4*3*2*1
int fab2(int number) {
    int result = 1
    number.downto(1) {
        num -> result *= num
    }
    return result
}
//源码：
//public static void downto(Number self, Number to, @ClosureParams(FirstParam.class) Closure closure) {
//    int self1 = self.intValue();
//    int to1 = to.intValue();
//    if (self1 < to1) {
//        throw new GroovyRuntimeException("");
//    } else {
//        for(int i = self1; i >= to1; --i) {
//            closure.call(i);
//        }
//
//    }
//}
println fab2(5)

//0+1+2+3+4
int sum(int number){
    int result = 0
    number.times {
        num->result += num
    }
    return result
}
//源码：
//public static void times(Number self, @ClosureParams(value = SimpleType.class,options = {"int"}) Closure closure) {
//    int i = 0;
//    for(int size = self.intValue(); i < size; ++i) {
//        closure.call(i);
//        if (closure.getDirective() == 1) {
//            break;
//        }
//    }
//}
println sum(5)