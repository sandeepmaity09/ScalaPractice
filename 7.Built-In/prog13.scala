// Looping without break or continue

var i = 0
var foundIt = false

while(i<args.length && !foundIt) {
  if(!args(i).startsWith("-")) {
    if(args(i).endsWith(".scala"))
      foundIt = true
  }
  i = i+1
}
