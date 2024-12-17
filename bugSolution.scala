```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): Any = {
    (value, other.value) match {
      case (x: Int, y: Int) => x + y
      case (x: String, y: String) => x + " " + y
      case _ => "Type not supported"
    }
  }
}

val obj1 = new MyClass[Int](10);
val obj2 = new MyClass[Int](20);
val result = obj1.myMethod(obj2);
println(result) //Output: 30

val obj3 = new MyClass[String]("hello");
val obj4 = new MyClass[String]("world");
val result2 = obj3.myMethod(obj4);
println(result2) //Output:hello world

val obj5 = new MyClass[Double](10.5);
val obj6 = new MyClass[Double](20.5);
val result3 = obj5.myMethod(obj6);
println(result3) //Output:Type not supported
```