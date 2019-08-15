package com.kero99.wp

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

/**
  *
  * @author wp
  * @date 2019-08-15 14:12
  *
  */
object FlatMapTest extends  App {
  var sc:SparkContext = new SparkContext(new SparkConf().setAppName("FlatMapTest").setMaster("local[*]"))
  sc.setLogLevel("WARN")

  var r1:RDD[String]=sc.parallelize(List("a1,a2,a3","b1,b2,b3","c1,c2,c3"),3)

//
//  r1.foreachPartition(f=>{
//    f.foreach(t=>{
//      println(t)
//    })
//    println("*********************")
//
//  })

  var r2 = r1.flatMap(_.split(","))

  var result:RDD[String] = r2.mapPartitions(f=>{
    var list=Nil

    f.foreach(t=>{
      println(t)
    })
    println("***************")

    list.iterator
  })
  println(result.collect().mkString)

//  var r2:RDD[(String,Int)]=r1.map(("",_));
//  println(r2.getNumPartitions)

//  var r3:RDD[String]=r1.flatMap[String](_.split(","));
//  println(r3.getNumPartitions)
}
