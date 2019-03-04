package in.rakshan.scala.traits

trait DonutShoppingCartDao {

  def add(donutName: String): Long

  def update(donutName: String): Boolean

  def search(donutName: String): String

  def delete(donutName: String): Boolean

}

trait DonutInventoryService {

  def checkStockQuantity(donut: String): Int

}


class DonutShoppingCart extends DonutShoppingCartDao with DonutInventoryService {

  override def add(donutName: String): Long = {
    println(s"DonutShoppingCart-> add method -> donutName: $donutName")
    1
  }

  override def update(donutName: String): Boolean = {
    println(s"DonutShoppingCart-> update method -> donutName: $donutName")
    true
  }

  override def search(donutName: String): String = {
    println(s"DonutShoppingCart-> search method -> donutName: $donutName")
    donutName
  }

  override def delete(donutName: String): Boolean = {
    println(s"DonutShoppingCart-> delete method -> donutName: $donutName")
    true
  }

  override def checkStockQuantity(donut: String): Int = {
    println(s"DonutShoppingCart-> checkStockQuantity method -> donut: $donut")
    10
  }
}

object extendtrait extends App {
  val donutShoppingCart1: DonutShoppingCart = new DonutShoppingCart()
  donutShoppingCart1.add("Vanilla Donut")
  donutShoppingCart1.update("Vanilla Donut")
  donutShoppingCart1.search("Vanilla Donut")
  donutShoppingCart1.delete("Vanilla Donut")
  donutShoppingCart1.checkStockQuantity("Vanilla Donut")
}