//> using scala 2.13.18

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello from Scala 2 in a devcontainer. It works!")
    anotherFunction()
  }

  private def anotherFunction(): Unit =
    println(
      "This is another function that can be called from the main function."
    )
}
