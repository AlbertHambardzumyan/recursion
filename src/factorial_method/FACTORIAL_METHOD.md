# Factorial Method

Let’s write a recursive program to perform a popular mathematical calculation. Consider the factorial of a positive 
 integer n, written n!, which is the product
 ``` text
  n · (n – 1) · (n – 2) · ... · 1
 ```
 with 1! equal to 1 and 0! defined to be 1. For example, 5! is the product 5 · 4 · 3 · 2 · 1, which is equal to 120.
 
The factorial of integer number (where number ≥ 0) can be calculated iteratively (non- recursively) using a *for* 
 statement as follows:
 ``` java
  factorial = 1;
  for ( int counter = number; counter >= 1; counter-- )
    factorial *= counter;
 ```

A recursive declaration of the factorial method is arrived at by observing the following relationship:
 ``` text
  n! = n · (n–1)!
 ```
 
For example, 5! is clearly equal to 5 · 4!, as shown by the following equations:
 ``` text
   5! = 5 · 4 · 3 · 2 · 1 
   5! = 5 · (4 · 3 · 2 · 1) 
   5! = 5 · (4!)
 ```

The evaluation of 5! would proceed as shown in bellow. Figure (a) shows how the succession of recursive calls 
 proceeds until 1! (the base case) is evaluated to be 1, which terminates the recursion. Figure (b) shows the values 
 returned from each recursive call to its caller until the final value is calculated and returned.
 
![factorial method](https://github.com/AlbertHambardzumyan/recursion/blob/master/doc/factorial-method.png "Recursive evaluation of 5!")

 ``` text
  0! = 1
  1! = 1
  2! = 2
  3! = 6
  4! = 24
  5! = 120
  ...
  12! = 479001600   12! causes overflow for int variables
  ...
  20! = 2432902008176640000
  21! = -4249290049419214848   21! causes overflow for long variables
 ```

Either omitting the base case or writing the recursion step incorrectly so that it does not converge on the base case
 can cause a logic error known as infinite recursion, where recursive calls are continuously made until memory is 
 exhausted. This error is analogous to the problem of an infinite loop in an iterative (nonrecursive) solution.