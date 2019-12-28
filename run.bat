javac -cp ./lib/* src/stepDefinitions/mySoapUITestNegTest.java src/testRunner/TestRunner.java
java -cp ./src/;./lib/* org.junit.runner.JUnitCore testRunner.TestRunner
