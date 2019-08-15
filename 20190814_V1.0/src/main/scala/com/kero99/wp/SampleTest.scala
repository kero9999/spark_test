package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-15 16:13
  *
  */
object SampleTest extends WpApp {
  var r1 = sc.parallelize(1 to 20,4)
  r1.sample(true,0.5).foreachPartition(f=>{
    f.foreach(println)
    println("********************")
  })
}
