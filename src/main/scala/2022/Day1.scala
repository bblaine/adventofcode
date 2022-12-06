def maxCalories(data: List[List[Int]]): Int = {

  val maxCalories = data.map(xs => xs.sum).max

  maxCalories
}
def topThreeCalories(data: List[List[Int]]) = {

  val topThreeCalories = data.map(xs => xs.sum).sorted.reverse.take(3).sum

  topThreeCalories

}
