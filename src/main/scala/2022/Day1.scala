def maxCalories(data: List[List[Int]]): Int = {

  val maxCalories = data.map(xs => xs.sum).max

  maxCalories
}
