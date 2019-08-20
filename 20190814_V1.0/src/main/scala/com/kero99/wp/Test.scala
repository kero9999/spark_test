package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-20 14:04
  *
  *
  */

/**
  * admin,2018/10/01,math,30
  * admin,2018/10/02,math,55
  * admin,2018/10/03,math,99
  * admin,2018/10/04,math,77
  * admin,2018/10/05,math,66
  * admin,2018/10/06,math,59
  * admin,2018/10/01,english,20
  * admin,2018/10/02,english,65
  * admin,2018/10/03,english,89
  * admin,2018/10/04,english,37
  * admin,2018/10/05,english,56
  * admin,2018/10/06,english,79
  * admin,2018/10/01,chinese,90
  * admin,2018/10/02,chinese,15
  * admin,2018/10/03,chinese,89
  * admin,2018/10/04,chinese,27
  * admin,2018/10/05,chinese,76
  * admin,2018/10/06,chinese,89
  */
//求admin和root用户每一科的总成绩和平均成绩，每个科目的合格率和总合格率
//统计成绩最好的一次考试日期
object Test extends WpApp {
  type Score=(Int,Int,Int)
  var inpath = System.getProperty("user.dir")+"/testinput"
//  sc.textFile(inpath).map(f=>{
//    var strs=f.split(",")
//    (strs(0)->strs(2),strs(3).toInt)
//  }).combineByKey(
//    f=>(f,1,if(f>59) 1 else 0),//总成绩，总次数，总合格数
//    (s:Score,sc:Int)=>(s._1+sc,s._2+1,if(sc>59) s._3+1 else s._3),
//    (s1:Score,s2:Score)=>(s1._1+s2._1,s1._2+s2._2,s1._3+s2._3)
//  ).foreach(f=>{
//    //((admin,chinese),(386,6,4))
//    println(s"name:${f._1._1},subject:${f._1._2},总成绩:${f._2._1},平均成绩:${f._2._1/f._2._2},合格率:${f._2._3*100.0/f._2._2}%")
//  })


  //统计成绩最好的一次考试日期 Top N
  var r1=sc.textFile(inpath).map(f=>{
    var strs=f.split(",")
    (strs(0)->strs(1),strs(3).toInt)
  }).reduceByKey(_+_).groupBy(f=>f._1._1).map(f=>{
    var maxDate=f._2.head._1._2
    var max=f._2.head._2
    for(tmp <- f._2.tail){
      if(tmp._2>max){
        maxDate=tmp._1._2
        max=tmp._2
      }
    }
    (f._1,maxDate,max)
  })
  r1.foreach(println)
}
