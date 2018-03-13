package fileSearcher

import org.scalatest.FlatSpec

class MatcherTests extends FlatSpec {
  "When a file matching filter is passed to Matcher" should "return a list with file name" in {
    var results = Matcher("fakeFilter", "fakeFilterPath") execute
    
    assert(results == List("fakeFilterPath"))
  }
}