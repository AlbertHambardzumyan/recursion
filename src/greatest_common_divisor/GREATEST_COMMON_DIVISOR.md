# Greatest Common Divisor

The greatest common divisor of integers x and y is the largest integer that evenly divides into both x and y. Write a 
 recursive method *gcd* that returns the greatest common divisor of x and y. The gcd of x and y is defined recursively 
 as follows: 
 
 If y is equal to 0, then gcd(x, y) is x; otherwise, gcd(x, y) is gcd(y, x % y), where % is the remainder operator.

