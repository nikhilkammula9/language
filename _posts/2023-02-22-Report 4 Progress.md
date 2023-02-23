---
title: "Report 4 Progress"
date: 2023-02-22
---
This week i started to learn about arrays and arrays lists.Arrays are a data structure that allows you to store a fixed number of values of the same type in contiguous memory locations. This means that arrays can hold values of various data types, such as doubles, integers, booleans, characters, strings, and even user-defined data types, as long as all the values in the array are of the same type.
```
Example : String[] Articles = {"Oil", "Invention", "Computers", "Vegetables", "Unknown World"};
    int[] Viewers = {87, 32, 13, 11, 7};
    double[] Ratings = {2.5, 3.2, 5.0, 1.7, 4.3};
```
In java we use **import java.util.Arrays;** to import Array packages
For Printing the above String we use toString() method which is available in Array Package
My Practice [Program] https://github.com/nikhilkammula9/language/blob/main/Progress/Newsfeed.java
we use square brackets, [ and ], to access or retrieve data stored at a specific index or position within an array.
For example, if we have an array named myArray containing integers, and we want to access the value stored at the second position (index 1) in the array, we can do so by using square brackets as follows:
```
int[] myA = {10, 20, 30, 40, 50};
int value = myA[1];
```
The starting index is 0 and ends with one number less than no. of elements in arrays.
If we try to reach the index out of array then we get **ArrayIndexOutOfBoundsException** error
Also we create empty arrays and then fill the array. Empty arrays have to be initialized with a fixed size:
String[] menuItems = new String[2];
Once size is declared, we cannot change it! This array is always size 2.
"ArrayName.length" gives length of the array.
[Example]https://github.com/nikhilkammula9/language/blob/main/Progress/Newsfeed1.java

Another small Practice program is [classroomExample]https://github.com/nikhilkammula9/language/blob/main/Progress/Classroom.java

I had a hard time understanding the arguments passsed on the arrays. By looking severals videos on the youtube I understood them. 
Few Notes on ArrayList:
- An ArrayList is a collection in Java that can hold a group of objects.
- We use ArrayLists **import java.util.ArrayList;** to improt Array List packages
- to add an item to a list we use .add() [Practise]https://github.com/nikhilkammula9/language/blob/main/Progress/ToDos.java
- We can add to a certain index to an array by .add(**Index**, **item**);
- We use .size() for arrayList just as we use .length in arrays
- To get a value in array we use arrayName[indexNumber] but for Array List we use **.get()** to to get a value of an ArrayList at a certain index
- To replace an element in an arrayList instead of add or removing it we use **.set()** for arrayList.
- .set() doesn't change the size of an ArrayList.
- .remove() is used to remove an element from an Array List.
- to find a certain element's index we use .indexOf().

My Practice for [ArrayList]https://github.com/nikhilkammula9/language/blob/main/Progress/Playlist.java

I had a hard time understanding the arguments passsed on the arrays. By looking severals videos on the youtube I understood them.
