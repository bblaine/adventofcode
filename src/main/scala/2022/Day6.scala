import scala.io.Source

def loadData6(fileName: String) = Source.fromResource(fileName).mkString

def packetMarker(s: String): Int = {
  s.sliding(4).map(xs => xs.distinct.size).indexOf(4) + 4
}
