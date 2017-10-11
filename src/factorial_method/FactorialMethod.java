package factorial_method;

public class FactorialMethod {

    // recursive method factorial (assumes its parameter is >= 0)
    static long factorial(long number) {
        if (number <= 1) return 1; // test for base case. base cases: 0! = 1 and 1! = 1
        else // recursion step
            return number * factorial(number - 1);
    }
}
