package utils

import com.typesafe.scalalogging.Logger

object ExecutionTimeUtils {

  val logger = Logger("ExecutionTime")

  def time[R](function: => R): R = {
    val t0 = System.nanoTime()
    val result = function
    val t1 = System.nanoTime()
    logger.info(" Elapsed time: " + (t1 - t0) + "ns")
    result
  }
}
