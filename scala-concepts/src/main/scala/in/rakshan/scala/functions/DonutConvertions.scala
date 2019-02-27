package in.rakshan.scala.functions


class DonutString(s: String) {

  def isFavoriteDonut: Boolean = s == "Glazed Donut"

}

object DonutConverstions {
  implicit def stringToDonutString(s: String) = new DonutString(s)
}
