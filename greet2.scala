val greetStrings = new Array[String](3)

greetStrings(0) = "Sandeep";
greetStrings(1) = "Maity";
greetStrings(2) = "Ha ha Ha";

for(i<-1 to 2)
println(greetStrings(i))

greetStrings(0) = "Maity";
greetStrings(1) = "Sandeep";
greetStrings(2) = "He He He";

for(i<-0 to 2)
println(greetStrings(i))

greetStrings.update(0,"Hello");
greetStrings.update(1,", ");
greetStrings.update(2,"World!\n");

for(i<-0.to(2))
print(greetStrings.apply(i))
