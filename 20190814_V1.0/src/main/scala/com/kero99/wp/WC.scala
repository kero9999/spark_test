package com.kero99.wp

import org.apache.spark.{SparkConf, SparkContext}

/**
  *
  * @author wp
  * @date 2019-08-14 16:21
  *
  */
object WC extends App {

    val cfg = new SparkConf().setAppName("WC").setMaster("local[4]")

    var inpath =System.getProperty("user.dir")+"/input"
    var outpath =System.getProperty("user.dir")+"/output"
    val sc = new SparkContext(cfg)
    sc.textFile(inpath,4).flatMap(_.split(",")).map((_,1)).reduceByKey(_+_).saveAsTextFile(outpath)
}
