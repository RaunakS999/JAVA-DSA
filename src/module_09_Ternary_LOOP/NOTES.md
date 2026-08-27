# Ternary Operator

The ternary operator, also known as the conditional operator, is a shorthand way of writing an if-else statement with a single expression.

**Syntax:**
`condition ? expression1 : expression2`

* If the condition is true, the expression before the `:` (i.e., `expression1`) is evaluated and returned.
* If the condition is false, the expression after the `:` (i.e., `expression2`) is evaluated and returned.

### Example:

```java
int num = 4;
String result = (num % 2 == 0) ? "Even" : "Odd";
System.out.println("The number is " + result);

```

**Output:**

```text
Even

```

---

# Type Conversion

Type casting in Java is the process of converting one data type to another. It can be done automatically or manually.

Type Casting in Java is mainly of two types:

1. Widening or Implicit Type Casting
2. Narrow or Explicit Type Casting

---

## 1. Widening or Implicit Conversion

* Java allows automatic type conversion when a smaller data type is promoted to a larger data type.
* It is secure since there is no possibility of data loss.
* Both the data types must be compatible with each other: converting a string to an integer is not possible as the string may contain alphabets that cannot be converted to digits.

**Order:**

* `byte` -> `short` -> `int` -> `long` -> `float` -> `double`
* `char` -> `int`

### Example:

```java
int intValue = 42;
double doubleValue = intValue; // Implicit conversion

```

---

## 2. Explicit or Narrowing Conversion

* Sometimes, we need to convert a larger data type to a smaller one explicitly and it requires a cast operator.
* Narrowing Type Casting in Java is not secure as loss of data can occur due to a shorter range of supported values in lower data type.

### Example:

```java
double doubleValue = 42.0;
int intValue = (int) doubleValue; // Explicit conversion (casting)

```

---

> **Note:** Shorthand operators do implicit conversion.
> ```java
> byte b = 1;
> b = b + 2; // error, 2 is int (all non-float by default int) so can't store in byte
> b += 2;    // works perfectly as += did implicit conversion
> 
> ```
>
>
  # LOOPS


When we want to perform certain tasks again and again till a given condition.

**For e.g.:** Our daily routine, certain song listen again & again

Looping is a feature that facilitates the execution of a set of instructions repeatedly until a certain condition holds false.

**e.g.:** print 1 to 10,000 number

---

## Types of Loop

Categorized into two main types:

### 1. Entry Controlled

Check the loop condition before entering the loop body. If the condition is false initially, the loop body will not execute at all.

`for` and `while` loops are examples of entry-controlled loops as we check the condition first and then evaluate the body of the loop.

---

### a. for loop

When we know the exact number of times the loop is going to run, we use `for` loop.

#### Syntax:

```java
for (declaration, Initialization; Condition; Change) {
    // Body of the Loop (Statement(s))
}

```

#### Example:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i); // run 1 to 5
}

```

**Output:**

```text
1 2 3 4 5

```

---

### FLOW DIAGRAM

---

### Optional Expressions:

In loops, initialization, condition, & update are optional. Any or all of these are skippable. The loop essentially works based on the semicolon `;`.

```java
// Empty loop
for (;;) {}

// Infinite loop
for (int i = 0;; i++) {}

```

---

### Syntax tweaks

* Initialize the variable outside the loop.
* Multiple conditions.
* Increment or Decrement of variable inside loop body

---

### Infinite Loop

An infinite loop is a loop that continues executing indefinitely, and it doesn't have a condition that will terminate the loop naturally.

```java
for (;;) {
    System.out.println("This is an infinite loop");
}

```

In the above code there is no initialization, no condition, and no iteration expression, meaning it will run indefinitely unless explicitly terminated.

```java
for (;;);

```

This is another example of an infinite loop, but this time, there is no code or statements within the loop. It's just an empty loop that will run indefinitely.

As the loop has started but it never ends, you terminate it by `;` it never comes out of the loop and if you write any code after this loop, it will be unreachable because the loop never terminates.