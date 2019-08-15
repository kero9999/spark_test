package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-15 16:41
  *
  */
object CombineByKeyTest extends WpApp {
  var r1 = sc.parallelize(List(("admin",11),("admin",22),("admin",33),("root",12),("root",32)),2)
}
