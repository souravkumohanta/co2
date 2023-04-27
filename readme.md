# SAP CO2 Greenhouse calculator with Command Line Interface
#solution by : Sourav kumar Mohanta - Souravku457@gmail.com
#+91 9438478320

## References

## Built using a Java Maven Project with unit test cases . Maven supports CI/CD frameworks like jenkins for easy compilation
and test execution

## Pre requisites to run the jar file - java8  
## Build commands (follows generic maven build commands) :
### mvn package - to rebuild the jar spanshot
### mvn test - to test the project junit test cases
### mvn clean - to remove the created jar files

#RUNNING INSTRUCTIONS : 
##For Windows We have a bat file created so shortened commands for java jar can be used : 
###example - co2-calculator --transportation-method train --distance 14500 --unit-of-distance m

##For Other OS : We need to enter the whole path to the jar with java running commands :
### example - java -jar target/greenhouse-0.0.1-SNAPSHOT-jar-with-dependencies.jar --transportation-method train --distance 14500 --unit-of-distance m

##As a monolithic application it all OOPS framework based singleton pattern.
###The final result is calculated here using the provided table . 
###It can also extend onto more complex data if needed as the design supports upsclaing .

##Logic :
##the program takes 2 necessary inputs as shown in the examples and 2 non required inputs
##The weight value is set to g if unspecified as per given criteria 
##The distance value is set to km unless specified 
## The code then refers the data from the Map using the keys as input to return the given value 
##This is then passed to the main method driver.java where it is passed to the console.    