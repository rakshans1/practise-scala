package in.rakshan.scala.classes

class Donut1(name: String, productCode: Long) {
  def print = println(s"Donut name = $name, productCode = $productCode")
}


object Donut1 {

  def apply(name: String, productCode: Long): Donut = {
    new Donut(name, productCode)
  }

}


object CompanionObject extends App {

  val glazedDonut =  Donut1("Glazed Donut", 1111)
  val vanillaDonut =  Donut1("Vanilla Donut", 2222)

  glazedDonut.print
  vanillaDonut.print

}