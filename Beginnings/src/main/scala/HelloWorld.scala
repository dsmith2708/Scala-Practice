class HelloWorld(var name: String, var age: Int)

object Main extends App {

  def agePerson(personToAge: HelloWorld): Unit = {
    personToAge.age += 1
  }

  val newPerson = new HelloWorld("Daniel", 22)

  println("Hello World")
  println("The name of newPerson is:" + newPerson.name)
  println("The age of newPerson is:" + newPerson.age)
  agePerson(newPerson)
  println("after adding 1 to their age, newPerson is now " + newPerson.age + " years old.")

  val personArray: Array[HelloWorld] = Array(new HelloWorld("John", 35),
    new HelloWorld("Gareth", 40), new HelloWorld("David", 38))
  println("Array of people:")
  for(person <- personArray) {
    println("name: " + person.name);
  }


}
