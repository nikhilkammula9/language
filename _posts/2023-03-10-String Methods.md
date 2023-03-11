---
title: "String Methods"
date: 2023-03-10
---
There are useful methods to use in Strinuse concatgs. We have string methods 
```
length()
concat()
equals()
indexOf()
charAt()
substring()
toUpperCase() / toLowerCase()
```
**length()**
we use length() method to know or feed how many characters are used in the string. example if we want to know whether a post reaches maximum character limit, then we check the number of characters with length() method.
```
String hello = "Hello World!";  
 
System.out.println(hello.length());
```
**concat()**
we use concat() to join two strings together.twe can write for concat() is firstString.concat(secondString). concat() doesn't modify the first string. Also it is similar to "+". 
```
String h = "hello";
String w = "world";
System.out.println(h.concat(w));
```
**equals()**
we use equals() to check equality of two string which couldnt be done with **==** . if two strings are equal then the result will printed as true.if not, false.
```
String h = "hello";
System.println(h.equals("hello");
```
this prints out the result as true because hello in string h to is equals to hello in the print statement.

**indexOf()**
we use indexOf() to check or know the index of a character or a group of characters in a string. The index always starts with 0 and if the character couldnt be found on the string it return -1.
```
String l = "ABCD"; 
System.out.println(l.indexOf("C"));
```
**charAt()**
we use charAt() to check or know which index has which character. If the index is out of the indexlength of the string we get IndexOutOfBoundsException error.
```
String A = "Name";
System.out.println(A.charAt(2));
```
we get output as m.

**subString()**
we use subString to extract a part of a string. If we have a long sentence and we want a specific part of the sentence or specific part of a word, then we use subString().we need to pass two arguments in the substring method the first one is inclusive and the second is exclusive.
```
String line = "Example code for the subString method"; 
System.out.println(line.substring(21, 25));
```
**toUpperCase() / toLowerCase()**
we use toUpperCase() / toLowerCase() to change uppercase string to lowercase string and vice versa.
```
String input = "helloworld!";
System.out.println(input.toUpperCase());
System.out.println(input.toLowerCase());
```

This week I have majorly made some progress mainly in the for loop concept which I was struggling last week and not a big challenge but I got confused with charAt(),equals().



Example [Program]https://github.com/nikhilkammula9/language/blob/main/Progress/stringMethods.java

