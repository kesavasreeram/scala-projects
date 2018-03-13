package fileSearcher

import java.io.File

trait IOObject {
  val file: File
  val name = file.getName()
}

class FileObject(val file: File) extends IOObject  // if there is no internal implementation within class, you can remove the {}
class DirectoryObject(val file: File) extends IOObject