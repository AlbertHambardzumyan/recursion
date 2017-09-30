# Fractals

A *fractal* is a geometric figure that can be generated from a pattern repeated recursively. The figure is modified by
 applying the pattern to each segment of the original figure. We’ll look at a few such approximations in this section. 
 Although these figures had been studied before the 20th century, it was the mathematician Benoit Mandelbrot who in the
 1970s introduced the term “fractal,” along with the specifics of how a fractal is created and the practical 
 applications of fractals. Mandelbrot’s fractal geometry provides mathematical models for many complex forms found in
 nature, such as mountains, clouds and coastlines. Fractals have many uses in mathematics and science. They can be used
 to better understand systems or patterns that appear in nature (e.g., ecosystems), in the human body (e.g., in the 
 folds of the brain), or in the universe (e.g., galaxy clusters). Not all fractals resemble objects in nature. Fractals
 have a self-similar property—when subdivided into parts, each resembles a reduced - size copy of the whole. Many 
 fractals yield an exact copy of the original when a portion of the fractal is magnified—such a fractal is said to be
 strictly self-similar. 

As an example, let’s look at the strictly self-similar Koch Curve fractal. It’s formed by removing the middle third of
 each line in the drawing and replacing it with two lines that form a point, such that if the middle third of the 
 original line remained, an equilateral triangle would be formed. Formulas for creating fractals often involve removing
 all or part of the previous fractal image. This pattern has already been determined for this fractal—we focus here on
 how to use those formulas in a recursive solution.
 
We start with a straight line and apply the pattern, creating a triangle from the middle third. We then apply the 
 pattern again to each straight line. Each time the pattern is applied, we say that the fractal is at a new level, or 
 depth (sometimes the term order is also used). Fractals can be displayed at many levels—for instance, a fractal at 
 level 3 has had three iterations of the pattern applied. After only a few iterations, this fractal begins to look like
 a portion of a snowflake. Since this is a strictly self-similar fractal, each portion of it contains an exact copy of
 the fractal.
 
A similar fractal, the *Koch Snowflake*, is the same as the Koch Curve but begins with a triangle rather than a line. 
 The same pattern is applied to each side of the triangle, resulting in an image that looks like an enclosed snowflake.

### The “Lo Fractal”

We now demonstrate the use of recursion to draw fractals by writing a program to create a strictly self-similar fractal.
 We call this the “Lo fractal”. The base case, or fractal level of 0, begins as a line between two points, A and B. To
 create the next higher level, we find the mid- point C of the line. To calculate the location of point C, use the 
 following formula:
 ``` 
  xC = (xA + xB) / 2
  yC = (yA + yB) / 2
 ```
 
To create this fractal, we also must find a point D that lies left of segment AC and creates an isosceles right 
 triangle ADC. To calculate point D’s location, use the following formulas:
  ```
   xD = xA + (xC - xA) / 2 - (yC - yA) / 2
   yD = yA + (yC - yA) / 2 + (xC - xA) / 2
  ```
  
We now move from level 0 to level 1 as follows: First, add points C and D. Then, remove the original line and add 
 segments DA, DC and DB. The remaining lines will curve at an angle, causing our fractal to look like a feather. For 
 the next level of the fractal, this algorithm is repeated on each of the three lines in level 1. For each line, the 
 formulas above are applied.
 
[Application source code](https://github.com/AlbertHambardzumyan/recursion/tree/master/src/koch_curve_fractal)