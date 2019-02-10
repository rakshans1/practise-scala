package in.rakshan.scala.fundamentals

object Enum extends App {
  object Donut extends Enumeration {
    type Donut = Value

    val Glazed      = Value("Glazed")
    val Strawberry  = Value("Strawberry")
    val Plain       = Value("Plain")
    val Vanilla     = Value("Vanilla")
  }

  println(s"Vanilla Donut string value = ${Donut.Vanilla}")
}
