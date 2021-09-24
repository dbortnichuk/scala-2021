def fib(n: Int): Long = {
  n match {
    case 0 => 0
    case 1 => 1
    case x => fib(x - 1 ) + fib (x - 2)
  }
}

fib(2)