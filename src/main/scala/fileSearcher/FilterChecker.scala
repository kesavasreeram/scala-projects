package fileSearcher

class FilterChecker(filter: String) {
  def matches(content: String) = content.contains(filter) // can be rewritten as " content contains filter "
    
  def findMatchedFiles(iOObjects: List[IOObject]) =
    for(iOObject <- iOObjects
        if(iOObject.isInstanceOf[FileObject])
        if(matches(iOObject.name)))
    yield iOObject // yield will be sent back to the caller without closing the loop, thus creating a list
}

// a scala companion object is a singleton which allows the methods to be called on it without using the "new" keyword to create another instance
// In order to create a companion object, the name should match the name of the class
object FilterChecker {
  def apply(filter: String) = new FilterChecker(filter)
}