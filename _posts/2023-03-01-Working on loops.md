---
title: "Working on loops"
date: 2023-03-01
---
I have started learning loops. When the loop body is executed, the starting condition is first evaluated. If the starting condition is true, and after executing the last line of the loop body, the loop will continue to iterate. While a conditional statement such as an if statement will only execute the code inside its block if the condition is true, a **while** loop will repeatedly execute the code inside its block as long as the condition remains true. The loop will continue to execute until the condition evaluates to false, at which point the loop will terminate and execution will continue with the code following the loop.When we need to repeat a certain block of code multiple times, we often use a counter variable to keep track of the number of times the block has been executed. This variable is incremented by a certain amount each time the loop executes, and the loop continues until the counter reaches a specified limit. Essentially, the counter variable allows us to control the number of times the code inside the loop is executed.Practice [Code]https://github.com/nikhilkammula9/language/blob/main/Progress/While.java.

Next part of the loops,i have learned about the **for** loop, just like while loop for loop is also used for repeating a block of code but the usage may be different. for loops are useful for situations where we know the exact number of iterations we need to perform, while while loops are more flexible and can run indefinitely until a particular condition is satisfied. The for loop headers has three parts - Initalization, boolean expression and increment or decrement statements. Seperated with semi colons. It will look like this.
```
for (int i = 0; i < 5; i++) { 
}
```
Partice [example]https://github.com/nikhilkammula9/language/blob/main/Progress/Hi.java   

