package fileSearcher

class Matcher(filter: String, rootLocation: String) {
  def execute() = {
    
  }
}

object Matcher {
  def apply(filter: String, rootLocation: String) = new Matcher(filter, rootLocation)
}