package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-15 16:31
  *
  */
object MapValuesTest extends  WpApp {
  var r1=sc.parallelize(List(("admin",11),("root",22),("zhangsan",33)))
  r1.mapValues(_*2).foreach(println)
}
