name := "FileSearcher"  //name of the project. Make sure that the project name does not have any spaces to avoid unwanted glitches

version := "0.1"  // version number of the project

scalaVersion := "2.12.4" // this is not mandatory but it is recommended. If you omit this, it will take the version of scala
			 			// used to build the sbt to build the project. Which is not desired in most of the situations.

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

// In this case two dependencies are added separately. However you can choose to add them simultaneously using following syntax
// libraryDependencies ++= "org.scalatest" %% "scalatest" % "3.0.5" % "test" , "com.novocode" % "junit-interface" % "0.11" % "test"
// notice that instead of "+=" we have "++=" and two dependencies are separated by ","


