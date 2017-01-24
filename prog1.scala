def length(lis:List[Int]):Int = {
lis.foldRight(5){(z,i)=>i+1}
}
