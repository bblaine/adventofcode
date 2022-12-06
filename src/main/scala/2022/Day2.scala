import scala.io.Source

def loadData2(fileName: String): List[Array[String]] = {

  val lines = Source.fromResource(fileName).getLines.toList

  val data = lines.map(line => line.split(" "))

  data

}

def totalScore(xs: List[Array[String]]): Int = {

  def roundScore(ys: Array[String]): Int = ys match {
    case Array("A", "X") => 1 + 3
    case Array("A", "Y") => 2 + 6
    case Array("A", "Z") => 3 + 0
    case Array("B", "X") => 1 + 0
    case Array("B", "Y") => 2 + 3
    case Array("B", "Z") => 3 + 6
    case Array("C", "X") => 1 + 6
    case Array("C", "Y") => 2 + 0
    case Array("C", "Z") => 3 + 3
  }

  xs.map(x => roundScore(x)).sum

}

def elfStrategy(xs: Array[String]): Array[String] = xs match {
    case Array("A", "X") => Array("A", "Z")
    case Array("A", "Y") => Array("A", "X")
    case Array("A", "Z") => Array("A", "Y")
    case Array("B", "X") => Array("B", "X")
    case Array("B", "Y") => Array("B", "Y")
    case Array("B", "Z") => Array("B", "Z")
    case Array("C", "X") => Array("C", "Y")
    case Array("C", "Y") => Array("C", "Z")
    case Array("C", "Z") => Array("C", "X")
}
