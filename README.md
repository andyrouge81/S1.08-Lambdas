# S1.06 - Java Lambdas & Functional Interfaces 🧠⚡

## 🧾 Task Objectives

- Practice the use of Lambda Expressions, Streams, and Functional Interfaces in Java 8+.
- Apply concise, functional-style programming in Java.
- Understand sorting, filtering, and mapping with lambdas.
- Push your progress to a remote GitHub repository using Git.

---

## 📚 Documentation

[Java Lambda Expressions (Oracle)](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)

[Java Stream API (Oracle)](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)

[Baeldung - Java Lambdas](https://www.baeldung.com/java-8-lambda-expressions-tips)

---

## 🧪 Proposed Exercises

## 🔹 Level 1

<details> 
  
### Exercise 1

From a list of Strings, write a method that returns a list of all strings containing the letter ‘o’. Print the result.
  
### Exercise 2


Repeat the previous task, but now return only the strings that both contain the letter ‘o’ and have more than 5 characters. Print the result.

  
### Exercise 3

Create a list with the names of the months of the year. Print all elements using a lambda expression.

  
### Exercise 4

Repeat the same task as in Exercise 3, but using a method reference instead of a lambda.

### Exercise 5

Create a Functional Interface with a method called `getPiValue()` that returns a `double`.
In your `main()` method, instantiate the interface using a lambda expression and assign it the value `3.1415`. Call the method and print the result.

### Exercise 6

Create a list of numbers and strings. Sort the list based on the length of the strings, from shortest to longest.

### Exercise 7

Sort the same list as above, but now in reverse order: from longest to shortest.

### Exercise 8

Create a Functional Interface with a method called `reverse()` that receives and returns a `String`.
Using a lambda, implement the method so that it returns the reversed version of the input string.
Test it from `main()` to ensure it works correctly.

</details>


## 🔹 Level 2

<details> 
  
### Exercise 1

Create a list of proper names. Write a method that returns a list of all names that start with 'A' and have exactly 3 letters. Print the result.

### Exercise 2

Write a method that returns a comma-separated string, based on a list of Integers.
Each element should be prefixed with `"e"` if it’s even or `"o"` if it’s odd.
Example: for the input `(3, 55, 44)`, the output should be `"o3, o55, e44"`. Print the result.

### Exercise 3

Create a Functional Interface with a method called `operacio()` that returns a `float`.
Use lambdas to implement it for addition, subtraction, multiplication, and division operations.

### Exercise 4

Create a list containing both text strings and numbers (as Strings).

Perform the following:

1. Sort alphabetically by the first character `(charAt(0))`.
2. Place strings containing the letter `“e”` first, others after (write the logic inside the lambda).
3. Modify all elements that contain the letter `'a'`, replacing `'a'` with `'4'`.
4. Show only the elements that are numeric strings.

</details>

---

## 💻 Technologies Used

- Java 17 or higher
- IntelliJ IDEA / Eclipse / VS Code
- Git & GitHub

## 📋 Requirements

- Java SDK 17+
- IDE with Java support (IntelliJ recommended)
- Git installed in your terminal
- Internet access to clone the repository

If you're using Maven, include this dependency for testing with JUnit (optional):
  ```xml
  <dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.2</version>
    <scope>test</scope>
  </dependency>
  ```
  

## 🚀 INstallation

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/S1.06-Lambdas.git

2. Open the project with your preferred IDE.
3. Run the Main.java or related files to test each exercise.

## ▶️ Execution

- Locate the Main.java file or relevant files for each exercise.
- Right-click and run the file from your IDE.
- Output will be printed to the console.
- Modify the lambda expressions or input data to experiment with new behaviors.

## 🌐 Deployment

This is a practice-based educational project. It’s not intended for deployment in production, but:

- You can generate an executable `.jar` file using your IDE or with Maven:
    ```bash
    mvn package
- The resulting `.jar` will be located in the `/target directory`.
  
## 🤝 Contributing

1. Fork this repository

2. Create a new branch:
   ```bash
    git checkout -b feature/myExerciseSolution

3. Commit your changes:
    ```bash
    git commit -m "feat: solved Exercise X with lambda"

4. Push teh branch:
    ```bash
    git push origin feature/myExerciseSolution

5. Open a Pull Request.

## 💌 Contact

For questions or feedback, feel free to open an Issue or reach out via [GitHub Profile](https://github.com/your-username/S1.06-Lambdas.git)


