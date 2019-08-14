package wp

import org.apache.spark.{SparkConf, SparkContext}

/**
  *
  * @author wp
  * @date 2019-08-12 16:36
  *
  */
object HelloWorldTest extends App {
  val cfg = new SparkConf().setAppName("helloworld")
  val sc = new SparkContext(cfg)
  sc.textFile(args(0)).flatMap(_.split(",")).map((_,1)).reduceByKey(_+_).saveAsTextFile(args(1))
}



