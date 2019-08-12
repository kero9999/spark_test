package com.kero99.wp

import org.apache.spark.{SparkConf, SparkContext}

/**
  *
  * @author wp
  * @date 2019-08-12 16:36
  *
  */
object HelloWorldTest extends App {
  val cfg = new SparkConf().setAppName("helloworld").setMaster("local[*]")
  val sc = new SparkContext(cfg)
  val basepath = System.getProperty("user.dir")
  val inpath = basepath+"/input"
  val outnpath = basepath+"/output"


  sc.textFile(inpath).flatMap(_.split(",")).map((_,1)).reduceByKey(_+_).saveAsTextFile(outnpath)
}
