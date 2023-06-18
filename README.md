# Programming-with-a-purpose
1.Strings and command-line arguments. Write a program HelloGoodbye.java that takes two names as command-line arguments and prints hello and goodbye messages as shown below (with the names for the hello message in the same order as the command-line arguments and with the names for the goodbye message in reverse order).

2. Integers and booleans. Write a program RightTriangle that takes three int command-line arguments and determines whether they constitute the side lengths of some right triangle.

The following two conditions are necessary and sufficient:
  - Each integer must be positive.
  - The sum of the squares of two of the integers must equal the square of the third integer

3. Floating-point numbers and the Math library. The great-circle distance is the length of the shortest path between two points (x1,y1) and (x2,y2) on the surface of a sphere, where the path is constrained to be along the surface.
Write a program GreatCircle.java that takes four double command-line arguments x1, y1, x2, and y2—the latitude and longitude (in degrees) of two points on the surface of the earth—and prints the great-circle distance (in kilometers) between them. Use Haversine formula

where r=6,371.0 is the mean radius of the Earth (in kilometers).

4. Type conversion. Several different formats are used to represent color. For example, the primary format for LCD displays, digital cameras, and web pages—known as the RGB format—specifies the level of red (R), green (G), and blue (B) on an integer scale from 0 to 255. The primary format for publishing books and magazines—known as the CMYK format—specifies the level of cyan (C), magenta (M), yellow (Y), and black (K) on a real scale from 0.0 to 1.0.
Write a program CMYKtoRGB.java that converts from CMYK format to RGB format using these mathematical formulas:
white = 1−black
red = 255×white×(1−cyan)
green = 255×white×(1−magenta)
blue = 255×white×(1−yellow)
Your program must take four double command-line arguments cyan, magenta, yellow, and black; compute the corresponding RGB values, each rounded to the nearest integer; and print the RGB values.

Loops:
1. Generalized harmonic numbers. Write a program GeneralizedHarmonic.java that takes two integer command-line arguments n and r and uses a for loop to compute the nth generalized harmonic number of order r, which is defined by the following formula:
H(n,r)=1/1^r+1/2^r+⋯+1/n^r.

2. Band matrices. Write a program BandMatrix.java that takes two integer command-line arguments n and width and prints an n-by-n pattern like the ones below, with a zero (0) for each element whose distance from the main diagonal is strictly more than width, and an asterisk (*) for each entry that is not, and two spaces between each 0 or *.

3. Random walk. A Java programmer begins walking aimlessly. At each time step, she takes one step in a random direction (either north, east, south, or west), each with probability 25%. She stops once she is at Manhattan distance r from the starting point. How many steps will the random walker take? This process is known as a two-dimensional random walk.

Write a program RandomWalker.java that takes an integer command-line argument r and simulates the motion of a random walk until the random walker is at Manhattan distance r from the starting point. Print the coordinates at each step of the walk (including the starting and ending points), treating the starting point as (0, 0). Also, print the total number of steps taken.

4. Random walkers. Write a program RandomWalkers.java that takes two integer command-line arguments r and trials. In each of trials independent experiments, simulate a random walk until the random walker is at Manhattan distance r from the starting point. Print the average number of steps.

