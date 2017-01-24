class CheckSumAccumulator {
private var sum = 0;

def add(b:Byte):Unit={sum+=b;}
def check():Int={~(sum&0xff)+1}

}

import scala.collection.mutable

object CheckSumAccumulator {

//private val cache = mutable.Map.empty[String,Int]
private val cache = mutable.Map.empty[String,Int]

def calculate(s:String):Int = 
if(cache.contains(s))
cache(s);
else
{
val acc = new CheckSumAccumulator;
for(c<-s)
acc.add(c.toByte);
val cs = acc.check()
cache+=(s->cs)
cs
}
}

