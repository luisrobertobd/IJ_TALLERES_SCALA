package com.pkg_dataframe

object objSuma    {
  def funSuma(par1 : Int  ,  par2: Int ) : Int = {
    //var sum ////:Int =0
    var sum=par1+par2
  return sum


  }


  /*def main(args: Array[String]) : Unit = {
   println ("suma:" + funSuma(3,4))
  }*/


  }


object Application extends App {

  def funSuma(par1 : Int  ,  par2: Int ) : Int = {
    //var sum ////:Int =0
    //var sum=par1+par2
   // return sum
    par1+par2
  }
  val res = funSuma(10, 2888)
  println("adding two numbers - " + res)
}


object Calculator_P {
  def funSumaPrima(par1: Int, par2: Int): Int = {
    //var sum ////:Int =0
    //var sum=par1+par2
    // return sum
    par1 + par2
  }
}

object Application_prima extends App {
  val res = Calculator_P.funSumaPrima(10, 30)
  println("adding two numbers - " + res)
}

/*--------------------------------------------*/
/*
object Calculator {
  def apply(x : Int)  = x + x  ///Int =  x+y
}
object Application_1 extends App {
  val res = Calculator // using Calculator object in function notation
  println("adding two numbers - " + res)
}



*/