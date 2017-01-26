// variable scoping when printing a multiplication table.

def printMultiTable() = {
  var i = 1   // only i in scope here
  while (i <= 10) {
    var j =1  // both i and j in scope here
    while( j <= 10) {
      val prod = (i*j).toString  //i,j,prod and k in scope here
      var k = prod.length
      while(k<4) {
        print(" ")
        k+=1
      }
      print(prod)
      j+=1
    }
   println()
   i+=1
  }
}
