import scala.io.Source

def splitBy(splitChar: String, xs: List[String]): List[List[String]] = {
  def splitByR(splitChar: String, xs: List[String], acc: List[String]): List[List[String]] = xs match{
    case Nil             => List(acc) 
    case h::t if h == "" => acc :: splitByR(splitChar, t, List[String]())
    case h::t            => splitByR(splitChar, t, h :: acc)
  }
  splitByR(splitChar, xs, List[String]())
}

def loadData(fileName: String): List[List[Int]] = {
  val lines = Source.fromResource(fileName).getLines.toList
  
  val data = splitBy("", lines).map(xs => xs.map(_.toInt))

  data
}

