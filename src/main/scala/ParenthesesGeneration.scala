import scala.collection.mutable._
class ParenthesesGeneration {
  def generateParentheses(n: Int): List[String] = {
    val validParentheses = new ListBuffer[String]

    def parentheseHelper(left: Int, right: Int, s: String): Unit = {
      if (s.size == 2*n ) validParentheses.append(s)
      if (left < n) parentheseHelper(left + 1, right, s + "(")
      if (left > right && right <= n) parentheseHelper(left, right + 1, s + ")")
    }

    parentheseHelper(0, 0, "")
    validParentheses.toList
  }
}

