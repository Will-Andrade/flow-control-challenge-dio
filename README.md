# Flow Control Application
This project is a simple terminal-based counter application developed in Java. The application accepts two integer inputs from the user, takes the difference between them and prints it to the console. The project includes basic exception handling and unit tests to ensure it's integrity.

## Table of Contents

- [Tools](#tools)
- [Installation & Running the Application](#installation--running-the-application)
- [How to Use The Project](#how-to-use-the-project)
- [Challenges Faced](#challenges-faced)
- [Next Steps](#next-steps)
- [Credits](#credits)

## Tools

For this project, I used: 
- Java
- Scanner class for user input
- Custom exception handling
- JUnit for testing

This project was an opportunity to practice Java fundamentals, exception handling, and unit testing.

## Installation & Running the Application

You can clone this project to your local machine with this command on your CLI:

- HTTPS
```bash
$ git clone https://github.com/Will-Andrade/flow-control-challenge-dio.git
```

- SSH
```bash
$ git clone git@github.com:Will-Andrade/flow-control-challenge-dio.git
```

To compile and run the application, use the following commands:

```bash
$ cd flow-control-challenge-dio
$ javac -d bin src/br/com/andraDev/main/java/*.java src/br/com/andraDev/main/java/exception/*.java
$ java -cp bin br.com.andraDev.main.java.Counter
```

## How to Use The Project

After running the application, you'll be prompted to input two integers:

- First parameter: The starting number of the count.
- Second parameter: The ending number of the count.

The application will then print the numbers between the two parameters. If the first parameter is greater than or equal to the second parameter, a custom exception (InvalidParamException) will be thrown.

Demo:
```bash
Enter the first parameter.
3
Enter the second parameter.
7
Printing number 1
Printing number 2
Printing number 3
Printing number 4
```

## Challenges Faced

I considered this project pretty easy and was able to finish it rather quickly. However, I had little experience in testing exceptions in Java and had to learn the fundamentals to successfully test the use cases on the application. Other than that, it was a nice experience.

## Next Steps

I am content with the project as it is but something nice to add would be:
- Add input validation for non-integer values.

## Credits
The idea for this project and starter Counter class came from the Digital Innovation One (DIO) Java with Spring Boot bootcamp. The original challenge features can be read [here](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo) (Brazillian Portuguese README 🇧🇷) but other than that, all code was created by me, Willian Andrade.
