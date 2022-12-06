def topThreeCalories(data: List[List[Int]]) = {

  val topThreeCalories = data.map(xs => xs.sum).sorted.reverse.take(3).sum

  topThreeCalories

}
