# Introduction

This repository is used to try out Scala functionality as I read through a few Scala book.

The lessons follow what is presented in the book [Functional Programming,Simplified](https://www.amazon.com/Functional-Programming-Simplified-Alvin-Alexander-ebook/dp/B076J7CJKY)



To run the tests in IntelliJ, create the following file;

```
~/.sbt/0.13/plugins/build.sbt
```

with the content

```
resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")
addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.3")
```
