---
title: "Learning about Variable and Class in Java"
date: 2023-02-08
---

I read about the variables in Java and I found that Variables in Java play important role in manipulating and storing the data. I have learn to implement them in java programming. Just to make notes I have learnt the implementation of the follwing variables.
```
Boolean Data Type : For true or false
String Data Type : For text
Int Data Type : For whole number
Char Data Type : For characters
Final Keyword : To fix a value
Double Data Type : For loating numbers of wide range
Math Operations : +,-,/,*
Comparison Operators: >,<
Compound Assignment Operators: +=,-=,*=,/=
Increment and Decrement Operators: ++,--
```
Example code to practice. [Variables Practice] https://github.com/nikhilkammula9/language/blob/main/Progress/BankAccount.java 
Few notes :
1. In java any number divided by 0 results in an Arthemeticexception error 
2. Int rounds the result for example if the actual result is 2.5 ,with int the result is 2.
3. Order of Operations are
    Parentheses
    Exponents
    Modulo/Multiplication/Division
    Addition/Subtraction


After learning about the variables, I have learnt about the Class and Objects in Java. 
Few takeaways are:

1. Constructor method is used to create objects of a class. 
2. In class instance are created.

```
Example 
public class Register {
  // declare instance fields here!
  String Name;
  
  // constructor method
  
  }
  
  // main method
  }
}
```

4. new keyword is used in order to create a new object of a class.

```
ClassName instanceName = new Classame(parameters);
```
6. Constructor parameters should be same as the instance variables in the class.
7. We can have as many instances as we want as long as the parameter should match with the variables.
8. This is order a genral program runs 
        1. The program is executed by running the main() method
        2. An instance of a class is created, which causes a switch from the main() method to the class constructor 
        3. The code inside the class constructor is executed
        4. Once the class constructor finishes running, control returns to the main() method.
 I have practised these linking one of the example [Here] https://github.com/nikhilkammula9/language/blob/main/Progress/Car.java
 

