def gcdRecurse(x: Long, y: Long) : Long = {
  var a = x
  var b = y
  if(b==0)
    a
  else
    gcdRecurse(b,a%b)
}
