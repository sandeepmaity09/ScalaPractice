def gcdLoop(x: Long, y: Long) = {
  var a = x
  var b = y

  do {
    val temp = a
    a = b % a
    b = temp
  } while(a != 0)
  b
}
