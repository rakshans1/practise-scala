package in.rakshan.scala.functions

object Functions extends App {
  def favoriteDonut(): String = {
    "Glazed Donut"
  }

  val myFavoriteDonut = favoriteDonut()
  println(s"My favorite donut is $myFavoriteDonut")


  def printDonutSalesReport(): Unit = { // Function with no return type
    println("Printing donut sales report... done!")
  }
  printDonutSalesReport()

  def calculateDonutCost(donutName: String, quantity: Int): Double = { // Function with parameters
    println(s"Calculating cost for $donutName, quantity = $quantity")

    2.50 * quantity
  }

  val totalCost = calculateDonutCost("Glazed Donut", 5)
  println(s"Total cost of donuts = $totalCost")

  def calculateDonutCost2(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = { // Function with default value
    println(s"Calculating cost for $donutName, quantity = $quantity, couponCode = $couponCode")
    2.50 * quantity
  }

  val totalCostWithDiscount = calculateDonutCost2("Glazed Donut", 4, "COUPON_12345")
  val totalCostWithoutDiscount = calculateDonutCost2("Glazed Donut", 4)

  def calculateDonutCost3(donutName: String, quantity: Int, couponCode: Option[String]  = None): Double = { // Function with option
    println(s"Calculating cost for $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1
      val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case _ => 2.50 * quantity
    }
  }

  println(s"""Total cost = ${calculateDonutCost3("Glazed Donut", 5)}""")

  def dailyCouponCode(): Option[String] = { // Function with option return type
    val couponFromDb = "COUPON_1234"
    Option(couponFromDb).filter(_.nonEmpty)
  }

  val todayCoupon: Option[String] = dailyCouponCode()
  println(s"Today's coupon code = ${todayCoupon.getOrElse("No Coupon's Today")}")

  def applyDiscount[T](discount: T) { // Typed Function
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")

      case d: Double =>
        println(s"$d discount will be applied")

      case _ =>
        println("Unsupported discount type")
    }
  }

  applyDiscount[String]("COUPON_123")
  applyDiscount[Double](10)


  def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")
        Seq[T](discount)

      case d: Double =>
        println(s"$d discount will be applied")
        Seq[T](discount)

      case d @ _ =>
        println("Unsupported discount type")
        Seq[T](discount)
    }
  }
  println(s"Result of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}")
  println(s"Result of applyDiscountWithReturnType with Double parameter = ${applyDiscountWithReturnType[Double](10.5)}")
  println(s"Result of applyDiscountWithReturnType with Char parameter = ${applyDiscountWithReturnType[Char]('U')}")


  def printReport(names: String*) { // Variable number of arguments
    println(s"""Donut Report = ${names.mkString(" - ")}""")
  }

  printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport("Chocolate Donut")

  val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport(listDonuts: _*)

  val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donut")
  printReport(seqDonuts: _*)

  val arrDonuts: Array[String] = Array("Coconut Donut")
  printReport(arrDonuts: _*)
}
