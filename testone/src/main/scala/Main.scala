object Main extends App {
  val persons = List(
    Person(firstName = "Akira", lastName = "Sakura", age = 12),
    Person(firstName = "Peter", lastName = "Müller", age = 34),
    Person(firstName = "Nick", lastName = "Tagart", age = 52),
    Person(firstName = "Joe" , lastName = "Garfield", age = 18),
    Person(firstName = "Eliza", lastName = "Brown", age = 25))

  val adults = Person.filterAdult(persons)
  val descriptions = adults.map(p => p.description).mkString("\n\t")
  println(s"The adults are \n\t$descriptions")
}
