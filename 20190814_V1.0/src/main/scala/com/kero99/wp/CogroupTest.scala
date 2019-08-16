package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-16 16:15
  *
  */
object CogroupTest extends WpApp {
  var r1=sc.parallelize(List("zhangsan"->11,"lisi"->33),2)
  var r2=sc.parallelize(List("zhangsan"->22,"wangwu"->66),2)

  var r3=r1.cogroup(r2)

  r3.foreach(f=>{
    println(s"key:${f._1},${f._2._1.mkString},${f._2._2.mkString}")
  })
}
