val firstArg = if (args.length > 0) args(0) else ""

firstArg match {
  case "salt" => println("Pepper")
  case "chips" => println("Salsa")
  case "eggs" => println("Becon")
  case _ => println("huh?")
}
