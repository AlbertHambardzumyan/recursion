# Towers of Hanoi

We present a problem whose recursive solution demonstrates the elegance of recursion, and whose iterative solution may 
 not be as apparent.

The *Towers of Hanoi* is one of the classic problems every budding computer scientist must grapple with. Legend has it
  that in a temple in the Far East, priests are attempting to move a stack of golden disks from one diamond peg to 
  another. The initial stack has 64 disks threaded onto one peg and arranged from bottom to top by decreasing size. The
  priests are attempting to move the stack from one peg to another under the constraints that exactly one disk is moved
  at a time and at no time may a larger disk be placed above a smaller disk. Three pegs are provided, one being used
  for temporarily holding disks. Supposedly, the world will end when the priests complete their task, so there’s little
  incentive for us to facilitate their efforts.
 
![towers of hanoi](https://github.com/AlbertHambardzumyan/recursion/blob/master/doc/towers-of-hanoi.png "Towers of Hanoi")
 
Let’s assume that the priests are attempting to move the disks from peg 1 to peg 3. We wish to develop an algorithm
 that prints the precise sequence of peg-to-peg disk transfers. If we try to find an iterative solution, we’ll likely
 find ourselves hopelessly “knotted up” in managing the disks. Instead, attacking this problem recursively quickly
 yields a solution. Moving n disks can be viewed in terms of moving only n – 1 disks (hence the recursion) as follows:
 
 1. Move n – 1 disks from peg 1 to peg 2, using peg 3 as a temporary holding area. 
 2. Move the last disk (the largest) from peg 1 to peg 3.
 3. Move n – 1 disks from peg 2 to peg 3, using peg 1 as a temporary holding area.
 
The process ends when the last task involves moving n = 1 disk (i.e., the base case). This task is accomplished by
  moving the disk, without using a temporary holding area.
 
Our application solves the Towers of Hanoi, given the total number of disks (in this case 3), the starting peg, the 
 ending peg, and the temporary holding peg as parameters. The base case occurs when only one disk needs to be moved 
 from the starting peg to the ending peg. In the recursion step, moves disks - 1 disks from the first peg (sourcePeg)
 to the temporary holding peg (tempPeg). When all but one of the disks have been moved to the temporary peg, the 
 largest disk from the start peg to the destination peg. Finishes the rest of the moves by calling the method 
 solveTowers to recursively move disks - 1 disks from the temporary peg (tempPeg) to the destination peg 
 (destinationPeg), this time using the first peg (sourcePeg) as the temporary peg. In main calls the recursive 
 solveTowers method, which outputs the steps to the command prompt.
 
### Complexity of the Towers of Hanoi
The algorithm twice calls `Move n-1 disks`, and each of these twice calls `Move n-2 disks`. And so on, until the base
 case is reached. There are `n` stages and the number of calls is doubled at each stage. Thus, the total number of calls
 is `2^n - 1`. This results in a big O of O(2^n) for a Towers of Hanoi, which is also known as EXPONENTIAL GROWTH.
  
[Application source code](https://github.com/AlbertHambardzumyan/recursion/tree/master/src/towers_of_hanoi)