package in.rakshan.scala.basic

import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithScalaLogging extends App with LazyLogging {
  logger.info("Hello World from Scala Logging")
}
