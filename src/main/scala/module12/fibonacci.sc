import scala.annotation.tailrec

def fib(n: Int): Long = {
  n match {
    case 0 => 0
    case 1 => 1
    case x => fib(x - 1) + fib(x - 2)
  }
}

fib(7)

def fibTail(n: Int): Long = {
  @tailrec
  def loop(idx: Int, curr: Int, prev: Int): Long = {
    if(idx <= 0) {
      prev
    } else {
      loop(idx - 1, curr + prev, curr)
    }
  }

  loop(n, 1, 0)
}

fibTail(7)