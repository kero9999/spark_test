package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-15 15:46
  *
  */
trait WpApp extends App {
  protected var sc = BaseConn.open()
}
