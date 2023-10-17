package com.rockthejvm

object Basics extends App {
    //Defining a value
  val meaningOfLife: Int = 42

  val aBoolean = false // type is optional (most of the time)

  //Int, Boolean, Char, Double, Float, String (commonly used)

  //Strings and string operations
  val aString = "I love Scala"
  val cComposedString = "I" + "" + "love" + "" + "Scala"
  val anInterlopatedString = s"The meaning of life is $meaningOfLife"

  //Expressions = structures that can be reduced to a value
  val anExpression = 2 + 3

  //if-expression
  val ifExpression = if(meaningOfLife > 43) 56 else 999
  val chainedIfExpression =
    if(meaningOfLife >43) 56
    else if(meaningOfLife < 0) -2
    else if(meaningOfLife > 999) 78
    else 0

  val aCodeBlock = {
    //definitions
    val aLocalValue = 67

    //Value of block = the value of the last expression
    aLocalValue + 3
  }

  //Defining a function
  def myFunction(x: Int y: String): String = {
    y + " " + x
  }

  //Recursive Function
  def factorial(n: Int): Int =
    if(n <= 1) 1
    else n * factorial(n-1)

  //In Scala we don't use loops or iteration, we use RECURSION!

  //the Unit type = no meaningful value === "void" in other languages
  // type of SIDE EFFECTS
  println("I love Scala")

  def myUnitReturningFunction(): Unit = {
    println("I don't love returning Unit")
  }

  val theUnit = ()

}

