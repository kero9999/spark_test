package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-15 16:09
  *
  */
object FilterTest extends WpApp {
  var r1=sc.parallelize(1 to 10,3)
  r1.filter(f=>{
    f%2==0 && f>5
  }).foreach(println)
}
