import scala.collection.mutable.ArrayBuffer

class Methods {

  def sum(a:Int) = a*2

  def foo: Unit = {
    val xs = List(1,2,3)
    xs.map(sum)


  }

  def filter(f:(Int)=>Boolean,list:Seq[Int]):Seq[Int]={
    var arr = ArrayBuffer[Int]()
    for(x<-list){
      if(f(x)){
        arr+=x
      }
    }
    arr
  }
}
