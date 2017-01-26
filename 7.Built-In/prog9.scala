//Producing a new collection

val filesHere = (new java.io.File("./")).listFiles

def scalaFiles = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file


def fileLines(file: java.io.File) = 
  scala.io.Source.fromFile(file).getLines().toList


val forLineLengths =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length
