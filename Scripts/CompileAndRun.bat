@echo off

javac .\src\*.java -d .\build\
java -cp .\build\ %1