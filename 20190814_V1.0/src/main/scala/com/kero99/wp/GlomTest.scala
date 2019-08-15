package com.kero99.wp

import org.apache.spark.rdd.RDD

/**
  *
  * @author wp
  * @date 2019-08-15 15:12
  *
  */
object GlomTest extends App {
  var sc = BaseConn.open()
  var r1:RDD[String]=sc.parallelize(List("a1","a2","b1","b2","c1","c2"),3)
  r1.glom().foreach(f=>{
    println(f.mkString)
  })
}
