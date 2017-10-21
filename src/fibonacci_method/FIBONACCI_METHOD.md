# Fibonacci Method

The Fibonacci series,
 ``` text
  0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 ```
 begins with 0 and 1 and has the property that each subsequent Fibonacci number is the sum of the previous two. This 
 series occurs in nature and describes a form of spiral. The ratio of successive Fibonacci numbers converges on a 
 constant value of 1.618..., a number that has been called the golden ratio or the golden mean. Humans tend to find the
 golden mean aesthetically pleasing. Architects often design windows, rooms and buildings whose length and width are in 
 the ratio of the golden mean. Postcards are often designed with a golden-mean length-to-width ratio.
 
The Fibonacci series may be defined recursively as follows:
 ``` text
  fibonacci(0) = 0
  fibonacci(1) = 1
  fibonacci(n) = fibonacci(n – 1) + fibonacci(n – 2)
 ```

There are two base cases for the Fibonacci calculation: *fibonacci(0)* is defined to be 0, and *fibonacci(1)* to be 1.
 The call to method fibonacci from main is not a recursive call, but all subsequent calls to fibonacci are recursive, 
 because at that point the calls are initiated by method fibonacci itself. Each time fibonacci is called, it immediately
 tests for the base cases—number equal to 0 or number equal to 1. If the condition is true, fibonacci simply returns 
 number, because fibonacci(0) is 0 and fibonacci(1) is 1. Interestingly, if number is greater than 1, the recursion step
 generates two recursive calls, each for a slightly smaller problem than the original call to fibonacci.

![fibonacci method](https://github.com/AlbertHambardzumyan/recursion/blob/master/doc/fibonacci-method.png "Recursive evaluation of fibonacci( 3 )")

 ``` text
  Fibonacci of 0 is: 0
  Fibonacci of 1 is: 1
  Fibonacci of 2 is: 1
  Fibonacci of 3 is: 2
  Fibonacci of 4 is: 3
  Fibonacci of 5 is: 5
  Fibonacci of 6 is: 8
  Fibonacci of 7 is: 13
  Fibonacci of 8 is: 21
  Fibonacci of 9 is: 34
  Fibonacci of 10 is: 55
  ...
  Fibonacci of 37 is: 24157817
  Fibonacci of 38 is: 39088169
  Fibonacci of 39 is: 63245986
  Fibonacci of 40 is: 102334155
 ```
Fibonacci numbers tend to become large quickly (though not as quickly as factorials).

### Analyzing the Calls to Method Fibonacci

The above Figure shows how method fibonacci evaluates fibonacci(3). At the bottom of the figure we’re left with the 
 values 1, 0 and 1 — the results of evaluating the base cases. The first two return values (from left to right), 1 and 
 0, are returned as the values for the calls fibonacci(1) and fibonacci(0). The sum 1 plus 0 is returned as the value 
 of fibonacci(2). This is added to the result (1) of the call to fibonacci(1), producing the value 2. This final value 
 is then returned as the value of fibonacci(3).


From Figure, it appears that while fibonacci(3) is being evaluated, two recursive calls will be made—fibonacci(2) and 
 fibonacci(1). But in what order will they be made? The Java language specifies that the order of evaluation of the 
 operands is from left to right. Thus, the call fibonacci(2) is made first and the call fibonacci(1) second.
 
Each invocation of the fibonacci method that does not match one of the base cases (0 or 1) results in two more recursive
 calls to the fibonacci method. Hence, this set of recursive calls rapidly gets out of hand. Calculating the Fibonacci 
 value of 20 requires 21,891 calls to the fibonacci method, calculating the Fibonacci value of 30 requires 2,692,537 
 calls! As you try to calculate larger Fibonacci values, you’ll notice that each consecutive Fibonacci number you use 
 the application to calculate results in a substantial increase in calculation time and in the number of calls to the 
 fibonacci method. For example, the Fibonacci value of 31 requires 4,356,617 calls, and the Fibonacci value of 32 
 requires 7,049,155 calls! As you can see, the number of calls to fibonacci increases quickly — 1,664,080 additional 
 calls between Fibonacci values of 30 and 31 and 2,692,538 additional calls between Fibonacci values of 31 and 32! The
 difference in the number of calls made between Fibonacci values of 31 and 32 is more than 1.5 times the difference in 
 the number of calls for Fibonacci values between 30 and 31. Problems of this nature can humble even the world’s most 
 powerful computers.
 
Avoid Fibonacci-style recursive programs, because they result in an exponential “explosion” of method calls.

[Application source code](https://github.com/AlbertHambardzumyan/recursion/blob/master/src/fibonacci_method)
