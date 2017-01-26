//Iteration through collection: using for loop
//I/O is provided in scala through Java API

import java.io._

val fileHere = (new java.io.File(".")).listFiles
for(file <- fileHere)
  println(file)
