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
