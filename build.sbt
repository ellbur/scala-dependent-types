
organization := "com.github.ellbur"

name := "dependent-types"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.1"

scalaSource in Compile <<= baseDirectory(_ / "src")

