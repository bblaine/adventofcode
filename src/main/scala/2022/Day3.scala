def loadData3(fileName: String): List[String] = {

  val lines = scala.io.Source.fromResource(fileName).getLines.toList

  lines

}

def getItemPriority(c: Char): Int = c.isUpper match{
  case true  => c.getNumericValue + 26 - 9
  case false => c.getNumericValue - 9
}

def ruckSackPrioritySum(ruckSack: List[String]): Int = {

  val prioritiesSum = ruckSack
    .map(rs => rs.splitAt(rs.length / 2))
    .map(t => (t._1.toCharArray, t._2.toCharArray))
    .flatMap(t => t._1.intersect(t._2).distinct)
    .map(c => getItemPriority(c))
    .sum

  prioritiesSum
}

def groupPrioritySum(ruckSack: List[String]) = {
  ruckSack
    .grouped(3)
    .map(rss =>  rss.map(_.toCharArray))
    .flatMap(rss => (rss(0) intersect rss(1) intersect rss(2)).distinct)
    .map(c => getItemPriority(c))
    .sum
}

