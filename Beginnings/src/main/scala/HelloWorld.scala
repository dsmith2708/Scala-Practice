class HelloWorld(var name: String, var age: Int)

object Main extends App {

  val newPerson = new HelloWorld("Daniel", 22);

  println("Hello World");
  println("The name of newPerson is:" + newPerson.name);
  println("The age of newPerson is:" + newPerson.age);

}
