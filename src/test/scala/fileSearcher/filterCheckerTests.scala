package fileSearcher

import org.scalatest.FlatSpec
import java.io.File

//import org.scalatest._  instead of using specific package/class imports if you specify '_', it acts as a wild card and imports everything

class filterCheckerTests extends FlatSpec {
  "When a list where one file matches the filter is given to FilterChecker" should "return a list with that file" in {
    val matchingFile = new FileObject(new File("match"))
    val listOfFiles = List(new FileObject(new File("random")), matchingFile)
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles
    assert(matchedFiles == List(matchingFile))
  }
  
  "When a list where a directory name matches the filter is given to FilterChecker" should "not return directory" in {
    val listOfFiles = List(new FileObject(new File("random")), new DirectoryObject(new File("match")))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles
    assert(matchedFiles.length == 0)
  }
}