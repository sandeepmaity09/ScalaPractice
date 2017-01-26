// Try-Catch Implementation

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
  val f = new FileReader("input.txt")

} catch {
  case ex: FileNotFoundException => println("FileNotFoundException") //Handle missing File
  case ex: IOException => println("IOException")  //Handle other I/O error
}

finally {
  f.close()  //Be sure to close the file
}
