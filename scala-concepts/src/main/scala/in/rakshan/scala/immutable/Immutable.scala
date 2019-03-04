package in.rakshan.scala.immutable

import scala.collection.immutable._


object Immutable extends App {
  val list: List[String] = List("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of list = $list")

  val listSet: ListSet[String] = ListSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of listSet = $listSet")

  val listMap: ListMap[String, String] = ListMap("PD" -> "Plain Donut", "SD" ->"Strawberry Donut", "CD" -> "Chocolate Donut")
  println(s"Elements of listMap = $listMap")

  val map: Map[String, String] = Map("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of map1 = $map")

  val hashMap: HashMap[String, String] = HashMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of hashMap = $hashMap")

  val treeMap: TreeMap[String, String] = TreeMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of treeMap = $treeMap")

  val queue: Queue[String] = Queue("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of queue = $queue")

  val seq: Seq[String] = Seq("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of seq = $seq")

  val set: Set[String] = Set("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of set = $set")

  val hashSet: HashSet[String] = HashSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of hashSet = $hashSet")

  val treeSet: TreeSet[String] = TreeSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of treeSet = $treeSet")

  val sortedSet: SortedSet[String] = SortedSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of sortedSet = $sortedSet")

  val bitSet: BitSet = BitSet(3, 2, 0)
  println(s"Elements of bitSet = $bitSet")

  val stack: Stack[String] = Stack("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of stack = $stack")

  val vector: Vector[String] = Vector("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of vector = $vector")
}
