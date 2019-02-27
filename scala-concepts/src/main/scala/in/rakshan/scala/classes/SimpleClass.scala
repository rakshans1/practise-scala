package in.rakshan.scala.classes

class Donut(name: String, productCode: Long) {
  def print = println(s"Donut name = $name, productCode = $productCode")
}

object SimpleClass extends App {


  val glazedDonut = new Donut("Glazed Donut", 1111)
  val vanillaDonut = new Donut("Vanilla Donut", 2222)

  glazedDonut.print
  vanillaDonut.print

}
