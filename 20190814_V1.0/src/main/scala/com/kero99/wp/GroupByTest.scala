package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-15 15:46
  *
  */
object GroupByTest extends WpApp {
  var r1 = sc.parallelize(1 to 10,2)
//  r1.groupBy(_%2).foreach(println)
//  r1.map(f=>{
//    var result = if(f%2==0) "even" else "odd"
//    (result,f)
//  }).groupBy(_._1).foreach(println)

}
