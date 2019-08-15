package com.kero99.wp

import org.apache.spark.{SparkConf, SparkContext}

/**
  *
  * @author wp
  * @date 2019-08-15 14:38
  *
  */
class BaseConn {

}

object BaseConn {
  def open():SparkContext={
    var sc:SparkContext = new SparkContext(new SparkConf().setAppName("FlatMapTest").setMaster("local[2]"))
    sc.setLogLevel("WARN")
    sc
  }
}
