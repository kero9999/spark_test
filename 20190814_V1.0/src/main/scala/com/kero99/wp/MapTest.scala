package com.kero99.wp

import org.apache.spark.rdd.RDD

/**
  *
  * @author wp
  * @date 2019-08-15 14:37
  *
  */
object MapTest extends App {
  var sc = BaseConn.open()

  var r1:RDD[String] = sc.parallelize(List("a1","a2","a3","b1","b2","b3","c1","c2","c3"),3)
//  r1.map((_,1)).foreach(println)
  var r2 = r1.mapPartitions(f=>{
    var tmp:String=""
    var count =0;
    f.foreach(t=>{
      tmp+=t+","
      count+=1
    })
    ((tmp,count) :: Nil).iterator
  })
  println("***************************")
  r2.foreach(println)
  println("***************************")
}
