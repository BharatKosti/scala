import week4._

object nth {

  def nth[T](n: Int, list: List[T]): T = {

    if (list.isEmpty) throw new IndexOutOfBoundsException("Nil.nth")

    if (n == 0) {
      list.head
    }
    else nth(n - 1, list.tail)
  }
}