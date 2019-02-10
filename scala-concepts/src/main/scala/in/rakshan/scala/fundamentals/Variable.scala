package in.rakshan.scala.fundamentals

object Variable extends App {
  println("Step 1: Immutable variable")
  val donutsToBuy: Int = 5

  println("\nStep 2: Mutable variable")
  var favoriteDonut: String = "Glazed Donut"
  favoriteDonut = "Vanilla Donut"


  println("\nStep 3: lazy initialization")
  lazy val donutService = "initialize some donut service"

  println("\nStep 4: Scala Types")
  val donutsBought: Int = 5

  val bigNumberOfDonuts: Long = 100000000L

  val smallNumberOfDonuts: Short = 1

  val priceOfDonut: Double = 2.50

  val donutPrice: Float = 2.50f

  val donutStoreName: String = "Allaboutscala Donut Store"

  val donutByte: Byte = 0xa

  val donutFirstLetter: Char = 'D'

  val nothing: Unit = () // Similar to void in Java

  println("\nStep 5: Declare a variable without initialization")
  var leastFavoriteDonut: String = _

  leastFavoriteDonut = "Plain Donut"

}
