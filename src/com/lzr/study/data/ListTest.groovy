package com.lzr.study.data

//List定义使用
//def list = new ArrayList()
def list = [1, 2, 3, 4, 5]
//println list.class //class java.util.ArrayList
//println list.size()
//定义数组
def array = [1, 2, 3, 4, 5] as int[]

//1.添加
list.add(6) //[1, 2, 3, 4, 5, 6]
list << 2   //[1, 2, 3, 4, 5, 6, 2]
//println list

def plusList = list + 5 //[1, 2, 3, 4, 5, 6, 2, 5]
plusList.add(3, 9) //[1, 2, 3, 9, 4, 5, 6, 2, 5]
//println plusList

//2。删除
list.remove(2) //删除下标位置的
list.remove((Object) 2) //删除2这个对象
list.removeElement(5) //删除5这个对象
list.removeAll {
    return it % 2 == 0
}
//println list-[2,4] //删除2,4

//3.查找
def findList = [5, -2, 1, 4, 3]
//查找满足条件的第一个数据
int result = findList.find {
    return it % 2 == 0
}
println result //-2
//查找所有满足条件的
def result2 = findList.findAll {
    return it % 2 == 0
}
println result2 //[-2, 4]
//查找是否有满足条件的数据
def result3 = findList.any {
    return it % 2 == 0
}
println result3 //true

//查找是否全部满足条件
def result4 = findList.every {
    return it % 2 == 0
}
println result4 //false

//查找最大值与最小值
def result5 = findList.min {
    return Math.abs(it) //1
}
println result5
def result6 = findList.max {
    return Math.abs(it)
}
println result6 //5
//统计
int result7 = findList.count {
    return it > 0
}
println result7 //4

//4.排序
def sortList=[5,-2,1,4,3]
sortList.sort({a,b ->
    a == b ? 0 : Math.abs(a)>Math.abs(b) ? 1 :-1
})
println sortList //[1, -2, 3, 4, 5]

//对象排序
def sortStringList=['aaaaa','bbbb','c','ddd','ee']
sortStringList.sort({it ->
    return it.size()
})
println sortStringList //[c, ee, ddd, bbbb, aaaaa]