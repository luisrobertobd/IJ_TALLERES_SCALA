object square_root  {


def abs(x:Double) = if (x < 0) -x else x

def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

def isGoodEnough(guess: Double, x: Double) =  abs ( guess*guess -x) < 000.1

def improve(guess: Double, x: Double) = (guess + x / guess) / 2

def sqrt(x: Double) = sqrtIter(1, x)
}


object calcular_raiz extends App {
  val raiz = square_root.sqrt(9)
  println ( "solucion:" + raiz )
}

