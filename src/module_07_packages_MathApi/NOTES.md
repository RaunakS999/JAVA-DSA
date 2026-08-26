# Package

## Math API

### Creating a new package

* `package` statement should be the first line in the java code file
* Used to group a similar set of classes (code management)
* Default Library package imported by default in every Java class:
* `java.lang.*` - this class contains math package



---

### Math Functions (Present inside `java.lang`)

* `abs(int a)` - Returns the unsigned value
* `floor(double a)` - Returns the nearest lower whole number
* `ceil(double a)` - Returns the nearest higher whole number
* `sqrt(double a)` - Returns the square root of the given number
* `cbrt(double a)` - Returns the cube root of the number
* `pow(double a, double b)` - Returns a raised to the power of b
* `round(double a)` - Returns the rounded off value
* `max(double a, double b)` - Returns the greater between a and b
* `min(double a, double b)` - Returns the smaller between a and b

## COMMON MISTAKE
 1.
* Use f method for 2 decimal places
 * `System.out.printf("%.2f", CI2)`;: Formats and prints the value rounded to 2 decimal places.
 * Note: %.2f already performs rounding automatically during printing

2.
* `Math.round(CI * 100.0) / 100.0;`: A mathematical technique to round a floating-point number to 2 decimal places:

* Multiplies by 100.0 (shifts the decimal point 2 places to the right).

* Math.round() rounds it to the nearest integer.

* Divides by 100.0 (shifts the decimal point back 2 places).

3. `System.out.printf("%.2f \n", C);:`

* printf stands for "print formatted".

 * %.2f specifies a floating-point number formatted to exactly 2 decimal places.

* \n outputs a newline character.

4. `float C = (float)(2 * Math.PI * r)`;
* Computes circumference ($C = 2\pi r$).Math.PI is a double ($64$-bit). Multiplying it with r results in a double expression, so an explicit cast (float) is mandatory to store it into a float ($32$-bit) variable.



