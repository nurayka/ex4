object Main {
def repeatedNTimes(A:Array[Int]):Int={
val res = A.map(x => A.count(y=>x==y))
  for((value,index)<-res.zipWithIndex) {
    if (value==A.length/2) {
      return A(index)
    }
    -1
  }
  def test1(): Unit = {
    val nums=Array(1,2,3,3)
    print(repeatedNTimes(nums))
  }
  def test2(): Unit = {
    val nums=Array(2,1,2,5,3,2)
    print(repeatedNTimes(nums))
  }
  def test3(): Unit = {
    val nums=Array(5,1,5,2,5,3,5,4)
    print(repeatedNTimes(nums))
  }

}
}
