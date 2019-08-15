package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-15 15:20
  *
  */
object UnionTest extends App {
  var sc=BaseConn.open()
  var r1 = sc.parallelize(1 to 10,2)
  var r2 = sc.parallelize(5 to 15,2)
  var r3 = r1.union(r2).distinct().coalesce(2)
  println(r3.getNumPartitions)
  r3.foreachPartition(f=>{
    f.foreach(println)
    println("*********************")
  })

}
