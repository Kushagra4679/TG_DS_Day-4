import scala.collection.mutable._
class ParenthesesGeneration {
  def generateParentheses(n: Int): List[String] = {
    val validParentheses = new ListBuffer[String]

    def parentheseHelper(left: Int, right: Int, s: String): Unit = {
      if (left == 0 && right == 0) validParentheses.append(s)
      if (left > 0) parentheseHelper(left - 1, right, s + "(")
      if (left < right) parentheseHelper(left, right - 1, s + ")")
    }

    parentheseHelper(n, n, "")
    validParentheses.toList
  }
}

