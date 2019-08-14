package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-14 16:37
  *
  */
object LazyTest extends App {
  def initName()={
    println("initName方法被调用")
    "张寒"
  }
  lazy val name = initName()
  println("******************")
  println(name)

}
