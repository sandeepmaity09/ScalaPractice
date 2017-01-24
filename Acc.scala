class CheckSumAcc {
private var sum = 0;

def add(b:Int):Unit = {
sum = sum +b;
}

def check():Int = {
return sum;
}

}
