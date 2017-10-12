# Power Method

Write a recursive method *power(base, exponent)* that, when called, returns
 ``` 
  base^exponent
 ```
 
For example, power(3, 4) = 3 * 3 * 3 * 3. Assume that exponent is an integer greater than or equal to 1. 


##### Hint

The recursion step should use the relationship
 ``` text
  base^exponent = base · base^exponent – 1
 ```
 and the terminating condition occurs when exponent is equal to 1, because
 ``` text
  base^1 = base
 ```
 
Incorporate this method into a program that enables the user to enter the base and exponent.
