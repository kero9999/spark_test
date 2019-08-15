package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-15 15:37
  *
  */
object CartesianTest extends App {
  var sc = BaseConn.open()
  var r1 = sc.parallelize(1 to 5 ,3)
  var r2 = sc.parallelize(List("大褶子","王岩","哲学家张寒"),2)
  var r3 = r1.cartesian(r2);
  println("分区数:"+r3.getNumPartitions)
  r3.foreachPartition(f=>{
    f.foreach(println)
    println("**************************")
  })
}
