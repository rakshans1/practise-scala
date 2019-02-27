package in.rakshan.scala.functions

object Function_Curry extends App {
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }


  println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")
}
