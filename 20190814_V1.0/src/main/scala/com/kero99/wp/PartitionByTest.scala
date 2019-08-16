package com.kero99.wp
import org.apache.spark._
/**
  *
  * @author wp
  * @date 2019-08-16 15:03
  *
  */
object PartitionByTest extends WpApp {
  var r1 = sc.parallelize(List("zhangsan"->18,"lisi"->88,"zhangsi"->55,"zhanghan"->38,"zhaoliu"->22,"tianqi"->77,"admin"->22,"heihei"->22,"llll"->22,"mmm"->222,"qqq"->323),3)

  var r2 = r1.partitionBy(new WpPartitioner(r1.getNumPartitions))
  r2.saveAsTextFile(System.getProperty("user.dir")+"/output")


//  r2.mapPartitionsWithIndex((index,f)=>{
//    print(s"第${index}分区:")
//    f.foreach(c=>print(c+"\t"))
//    println("\n***********************")
//    f.toIterator
//  })



//  r2.foreachPartition(f=>{
//    while(f.hasNext){
//      print(f.next()+"\t")
//    }
//    println("\n******************************")
//  })

//  r2.mapPartitions(f=>{
//    println(f.mkString(","))
//    println("********************************")
//    f.toIterator
//  }).collect()

}
//class WpPartitioner extends Partitioner
/**
  * A-F   0
  * G-L   1
  * M-R   2
  * S-Z   3
  * @param num
  */
class WpPartitioner (pnum:Int) extends Partitioner{
  override def numPartitions: Int = pnum

  override def getPartition(key: Any): Int = {
    var num=key.toString.charAt(0).toInt
    if(num<97) {
      num -= 65
    }else{
      num -= 97
    }
    var tmp=26/pnum
    for(i <- 0 until pnum){
      if(tmp*i<=num&&tmp*(i+1)>num){
        //println(key+":"+num+s"，第${i}分区")
        return i
      }
    }
    return pnum-1
  }
}