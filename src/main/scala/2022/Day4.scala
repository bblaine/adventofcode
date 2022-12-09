def loadData4(fileName: String): List[Range] = {
  val pairs = scala.io.Source.fromResource(fileName)
    .getLines
    .flatMap(_.split(",")
    .map(xs => xs.split("-")
    .map(xs => xs.toInt)))
    .map(xs => Range.Inclusive(xs(0), xs(1), 1))
    .toList
  pairs
}

def assignmentContainsSum(assignments: List[Range]) = {
  assignments.grouped(2).filter(xss => xss(0).forall(xss(1).contains) || xss(1).forall(xss(0).contains)).toList.size
}

def assignmentOverlapSum(assignments: List[Range]) = {
  assignments.grouped(2).filter(xss => xss(0).exists(xss(1).contains) || xss(1).exists(xss(0).contains)).toList.size
}
