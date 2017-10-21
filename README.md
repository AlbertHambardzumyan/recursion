# recursion
The concept of recursion.


## Introduction

The programs are generally structured as methods that call one another in a hierarchical manner. For some problems, 
 it’s useful to have a method call itself. A method that does so is known as a *recursive method*. A recursive method 
 can call itself either directly or indirectly through another method.
  
Recursion examples and exercises we consider:
* [Factorial Method](https://github.com/AlbertHambardzumyan/recursion/blob/master/src/factorial_method/FACTORIAL_METHOD.md)
* Fibonacci Method (Fig. 18.5)
* [Find the Error in the Following Code (Exercise)](https://github.com/AlbertHambardzumyan/recursion/blob/master/src/find_error/FIND_ERROR.md)
* [Raising an Integer to an Integer Power (Exercise)](https://github.com/AlbertHambardzumyan/recursion/blob/master/src/power_method/POWER_METHOD.md)
* [Greatest Common Divisor (Exercise)](https://github.com/AlbertHambardzumyan/recursion/blob/master/src/greatest_common_divisor/GREATEST_COMMON_DIVISOR.md)
* [Print an Array Forward-Backward (Exercise)](https://github.com/AlbertHambardzumyan/recursion/blob/master/src/print_array/PRINT_ARRAY.md)
* [What Does This Code Do? (Exercise)](https://github.com/AlbertHambardzumyan/recursion/blob/master/src/what_does_this_code_do/WHAT_DOES_THIS_CODE_DO.md)
* [Minimum Value in an Array (Exercise)](https://github.com/AlbertHambardzumyan/recursion/blob/master/src/minimum_value_in_array/MINIMUM_VALUE_IN_ARRAY.md)
* [Determine Whether a String Is a Palindrome (Exercise)](https://github.com/AlbertHambardzumyan/recursion/blob/master/src/palindrome/PALINDROME.md)
* [Linear Search (Exercise from searching)](https://github.com/AlbertHambardzumyan/searching/blob/master/src/recursive_linear_search/RECURSIVE_LINEAR_SEARCH.md)
* [Binary Search (Exercise from searching)](https://github.com/AlbertHambardzumyan/searching/blob/master/src/recursive_binary_search/RECURSIVE_BINARY_SEARCH.md)
* [Towers of Hanoi](https://github.com/AlbertHambardzumyan/recursion/blob/master/src/towers_of_hanoi/TOWERS_OF_HANOI.md)
* [Fractals](https://github.com/AlbertHambardzumyan/recursion/blob/master/src/koch_curve_fractal/FRACTALS.md) 
* Eight Queens (Exercise 18.15)
* Star Fractal (Exercise 18.19)
* Maze Traversal Using Recursive Backtracking (Exercise 18.20)
* Generating Mazes Randomly (Exercise 18.21)
* Mazes of Any Size (Exercise 18.22)
* Time Needed to Calculate a Fibonacci Number (Exercise 18.23)
* Merge Sort (Figs. 19.10 and 19.11)
* Quicksort (Exercise 19.10)
* Binary-Tree Insert (Fig. 22.17)
* Preorder Traversal of a Binary Tree (Fig. 22.17)
* Inorder Traversal of a Binary Tree (Fig. 22.17) 
* Postorder Traversal of a Binary Tree (Fig. 22.17) 
* Print a Linked List Backward (Exercise 22.20) 
* Search a Linked List (Exercise 22.21)


## Recursion Concepts

When a recursive method is called to solve a problem, it actually is capable of solving only the simplest case(s), 
 or *base case(s)*. If the method is called with a base case, it returns a result. If the method is called with a more 
 complex problem, it typically divides the problem into two conceptual pieces — a piece that the method knows how to do
 and a piece that it does not know how to do. To make recursion feasible, the latter piece must resemble the original 
 problem, but be a slightly simpler or smaller version of it. Because this new problem looks like the original problem, 
 the method calls a fresh copy of itself to work on the smaller problem — this is referred to as a *recursive call* and
 is also called the *recursion step*. The recursion step normally includes a return statement, because its result will 
 be combined with the portion of the problem the method knew how to solve to form a result that will be passed back to 
 the original caller. This concept of separating the problem into two smaller portions is a form of the 
 divide-and-conquer approach introduced.

The recursion step executes while the original method call is still active (i.e., it has not finished executing). It 
 can result in many more recursive calls as the method divides each new subproblem into two conceptual pieces. For the
 recursion to eventually terminate, each time the method calls itself with a simpler version of the original problem, 
 the sequence of smaller and smaller problems must converge on a base case. When the method recognizes the base case, 
 it returns a result to the previous copy of the method. A sequence of returns ensues until the original method call 
 returns the final result to the caller.

A recursive method may call another method, which may in turn make a call back to the recursive method. This is known 
 as an *indirect recursive call* or *indirect recursion*. For example, method A calls method B, which makes a call back
 to method A. This is still recursion, because the second call to method A is made while the first call to method A is 
 active — that is, the first call to method A has not yet finished executing (because it’s waiting on method B to
 return a result to it) and has not returned to method A’s original caller.

To better understand the concept of recursion, let’s look at an example that’s quite familiar to computer users — the
 recursive definition of a directory on a computer. A computer normally stores related files in a directory. A
 directory can be empty, can contain files and/or can contain other directories (usually referred to as subdirectories).
 Each of these subdirectories, in turn, may also contain both files and directories. If we want to list each file in a 
 directory (including all the files in the directory’s subdirectories), we need to create a method that first lists the
 initial directory’s files, then makes recursive calls to list the files in each of that directory’s subdirectories. 
 The base case occurs when a directory is reached that does not contain any subdirectories. At this point, all the 
 files in the original directory have been listed and no further recursion is necessary.


## Recursion vs. Iteration

Methods such as factorial or fibonacci can easily be implemented either recursively or iteratively. Why you might 
 choose one approach over the other in a particular situation?
 
Both iteration and recursion are based on a control statement: Iteration uses a repetition statement (e.g., for, while 
 or do...while), whereas recursion uses a selection statement (e.g., if, if...else or switch). Both iteration and 
 recursion involve repetition: Iteration explicitly uses a repetition statement, whereas recursion achieves repetition 
 through repeated method calls. Iteration and recursion each involve a termination test: Iteration terminates when the 
 loop-continuation condition fails, whereas recursion terminates when a base case is reached. Iteration with 
 counter-controlled repetition and recursion both gradually approach termination: Iteration keeps modifying a counter 
 until the counter assumes a value that makes the loop-continuation condition fail, whereas recursion keeps producing 
 smaller versions of the original problem until the base case is reached. Both iteration and recursion can occur 
 infinitely: An infinite loop occurs with iteration if the loop-continuation test never becomes false, whereas infinite
 recursion occurs if the recursion step does not reduce the problem each time in a manner that converges on the base 
 case, or if the base case is not tested.
 
Recursion has many negatives. It repeatedly invokes the mechanism, and consequently the overhead, of method calls. This
 repetition can be expensive in terms of both processor time and memory space. Each recursive call causes another copy
 of the method (actually, only the method’s variables, stored in the activation record) to be created—this set of
 copies can consume considerable memory space. Since iteration occurs within a method, repeated method calls and extra
 memory assignment are avoided.
 
Any problem that can be solved recursively can also be solved iteratively (nonrecursively). A recursive approach is 
 normally preferred over an iterative approach when the recursive approach more naturally mirrors the problem and 
 results in a program that is easier to understand and debug. A recursive approach can often be implemented with fewer
 lines of code. Another reason to choose a recursive approach is that an iterative one might not be apparent.
 
Avoid using recursion in situations requiring high performance. Recursive calls take time and consume additional memory.
