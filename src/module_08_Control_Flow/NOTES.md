# SHOP DISCOUNT QUESTION

`("%.0f", a * 0.95)`
Calculates 95% of `a` (or applies a 5% discount) and formats the result as a whole number with 0 decimal places, rounding to the nearest integer.

### Component Breakdown

* `a * 0.95`: Multiplies the value of variable `a` by 0.95.
* `%`: Begins the format specifier.
* `.0`: Specifies 0 decimal digits of precision after the decimal point.
* `f`: Specifies a floating-point number (`float` or `double`).

---

# CONTROL-FLOW STATEMENTS

Control Flow statements in programming control the order of execution of statements within a program. They allow you to make decisions, repeat actions, and control the flow of your code based on conditions.

## Types of Control Flow Statements

1. **Conditional or Decision Making statements** (`if-else` and `switch`)
2. **Looping statements** (`for`, `while`, and `do-while`)
3. **Branching statements** (`break` and `continue`)

---

## 1. Conditional Statements: If-else

The `if-else` statement allows you to execute a block of code conditionally. If the condition inside the `if` statement is true, the code inside the `if` block is executed; otherwise, the code inside the `else` block is executed.

### Syntax of if-else:

```java
int age = 30;
if (age > 18) {
    System.out.println("Adult"); // executes if condition is true
} else {
    System.out.println("Abhi chote ho"); // condition false
}

```

---

## If-Else-If Ladder

"If-Else-If" ladder consists of an `if` statement followed by multiple `else-if` statements. It is used to evaluate a condition using multiple statements. The chain of `if` statements are executed from the top-down.

It checks each `if` condition, and as soon as one of the `if` conditions yields true, it executes the statement inside that `if` block and skips the rest of the ladder. If none of the conditions evaluates to be true, then the program executes the statement of the final `else` block.

### Example:

```java
int number = 10;
if (number % 2 == 0) {
    System.out.println("Number is even.");
}
else if (number % 2 != 0) {
    System.out.println("Number is odd.");
}
else {
    System.out.println("Invalid input.");
}

```

**Output:**

```text
Number is even.

```

---

## If Ladder

"If" ladder consists of multiple `if` statements. It is used to evaluate a condition using multiple statements. The chain of `if` statements are executed from the top-down.

The program checks each `if` condition, and as soon as one of the `if` conditions yields true, it executes the statement inside that `if` block and still checks further conditions. If none of the conditions evaluates to be true, then the program executes the statement of the final `else` block.

### Example:

```java
int number = 10;
if (number > 0) {
    System.out.println("Number is positive.");
}
if (number < 20) {
    System.out.println("Number is less than 20.");
}
if (number % 2 == 0) {
    System.out.println("Number is even.");
}

```

**Output:**

```text
Number is positive.
Number is less than 20.
Number is even.

```