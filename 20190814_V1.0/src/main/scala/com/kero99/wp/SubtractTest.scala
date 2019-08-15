package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-15 16:27
  *
  */
object SubtractTest extends WpApp {
  var r1=sc.parallelize(1 to 10,2)
  var r2=sc.parallelize(5 to 15,2)
  var r3=r1.subtract(r2)
  r3.foreach(println)
  println("***********************")
  var r4=r2.subtract(r1)
  r4.foreach(println)
}
