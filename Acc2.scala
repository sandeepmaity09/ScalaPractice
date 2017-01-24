class CheckSumAcc {
private var sum = 0;

def add(b:Byte):Unit={sum+=b}
def check():Int={~(sum & 0xff)+1}

}
