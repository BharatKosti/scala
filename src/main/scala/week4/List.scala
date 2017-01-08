package week4

trait List[T]{

  def isEmpty : Boolean
  def head : T
  def tail : List[T]
  def nth(n : Int, list : List[T]) : T
}

class Cons[T] (val head : T, val tail : List[T]) extends List[T]{
  override def isEmpty: Boolean = false

  override def nth(n: Int, list: List[T]): T = {

    if(list.isEmpty) throw new IndexOutOfBoundsException("Nil.nth")

    if(n==0) {
      list.head
    }
    else nth(n-1,list.tail)
  }
}

class Nil[T] extends List[T]{
  override def isEmpty: Boolean = true

  override def head: Nothing = throw new NoSuchElementException("Nil.head")

  override def tail: List[T] = throw new NoSuchElementException("Nil.tail")

  override def nth(n: Int, list: List[T]): T = throw new IndexOutOfBoundsException("Nil.nth")
}