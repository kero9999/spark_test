package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-15 16:41
  *
  */
object CombineByKeyTest extends WpApp {
//  var r1 = sc.parallelize(List("admin"->60.6,"root"->66.6,"admin"->70.6,"root"->77.6,"admin"->80.6,"root"->100.0,"admin"->55.6),3)
//
//  var r2 = r1.combineByKey(
//    f=>(1,f),
//    (f:(Int,Double),newNum:Double)=>(f._1+1,f._2+newNum),
//    (p1:(Int,Double),p2:(Int,Double))=>(p1._1+p2._1,p1._2+p2._2)
//  )
//  r2.foreach(f=>println(s"student:${f._1},score:${f._2._2},avg:${f._2._2/f._2._1}"))

//  var r2 = r1.combineByKey(
//    f=>{f},
//    (oldNum:Int,newNum:Int)=>oldNum+newNum,
//    (proOldNum:Int,proNewNum:Int)=>proNewNum+proOldNum
//  )
//
//  r2.foreach(println)

  //求admin和root用户每一科的总成绩和平均成绩，每个科目的合格率和总合格率
  //统计成绩最好的一次考试日期
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
  var r1 = sc.parallelize(List("admin"->("math",77)))














}
