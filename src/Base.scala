class Base {
  def varDump(name: String, variable: Any) {
    println(name + ": " + variable.getClass + " = " + variable.toString)
  }
}
