package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-20 15:40
  *
  */
object AccumulatorTest extends WpApp {
//  val count = sc.longAccumulator("test")
//  var r1 = sc.parallelize(1 to 10,2).map(f=>{
//    count.add(f)
//  }).collect()
//  println



  var count = sc.accumulator(0)
  sc.parallelize(1 to 10,2).coalesce(1).foreach(f=>count+=f)
  println(count.value)
}
