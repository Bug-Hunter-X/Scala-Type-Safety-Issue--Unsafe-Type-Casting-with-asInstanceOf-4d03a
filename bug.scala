```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    value match {
      case x: Int => value + other.value.asInstanceOf[Int] //This causes runtime error
      case _ => value //handle other type as needed 
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
println(result2) //Output:hello
```