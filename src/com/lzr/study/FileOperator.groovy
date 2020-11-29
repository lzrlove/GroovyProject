package com.lzr.study

def file = new File("E:\\enjoy\\code\\gradle\\GroovyProject\\GroovyProject.iml")
//遍历文件 一行一行的读取
//file.eachLine {line->
//    println line
//}
//返回所有文本 一次性返回所有的
//def text = file.getText()
//println text

//以List<String>返回文件的每一行
def text = file.readLines()
println text.toListString()

//以java中流的方式读取文件内容
def reader = file.withReader {reader->
    char [] buffer = new char[100]
    reader.read(buffer)
    return buffer
}
println reader

//写入数据
file.withWriter {writer->
    writer.write("abc")
}

