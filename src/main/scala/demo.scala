object demo {
  def main(args: Array[String]) {
    var personOne = new Person("test", 40)
    var personTwo = new Person("testAgain", 45)
    personOne.check(personTwo)
  }
}
