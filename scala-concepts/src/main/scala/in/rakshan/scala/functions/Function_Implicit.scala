package in.rakshan.scala.functions

import in.rakshan.scala.functions.DonutConverstions._

object Function_Implicit extends App {
  def totalCost(donutType: String, quantity: Int)(implicit discount: Double): Double = {
    println(s"Calculating the price for $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }


  implicit val discount: Double = 0.1 // Define implicit value

  println(s"""Total cost with discount of 5 Glazed Donuts = ${totalCost("Glazed Donut", 5)}""")

  val glazedDonut = "Glazed Donut"
  val vanillaDonut = "Vanilla Donut"

  println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavoriteDonut}")
  println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavoriteDonut}")

}




