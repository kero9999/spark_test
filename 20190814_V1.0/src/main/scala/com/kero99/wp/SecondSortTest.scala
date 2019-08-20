package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-20 15:11
  *
  */
object SecondSortTest extends WpApp {
  var inpath = System.getProperty("user.dir")+"/sortinput"
  var r1=sc.textFile(inpath).map(f=>{
    var strs = f.split(" ")
    (new WpSort(strs(0).toInt,strs(1).toInt),f)
  }).coalesce(1).sortByKey(false).map(_._2)
  r1.foreach(println)
}

class WpSort (val first:Int,val second:Int) extends Ordered[WpSort] with Serializable {
  override def compare(that: WpSort): Int = {
    if(this.first!=that.first){
      this.first-that.first
    }else{
      that.second-this.second
    }
  }
}
