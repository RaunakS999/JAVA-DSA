# Operators

Operators can be easily defined as characters that represent an operation. These symbols perform different operations on several variables and values.

**Example:**
`5 + 6 = 11`
Here, `5` and `6` are the operands, and `+` is called the operator.

---

## Categories of Operators

* **Unary operators:** Perform an action with a single operand.
* **Binary operators:** Perform actions with two operands.

---

## Types of Operators

### 1. Arithmetic Operators

Arithmetic operators can be divided into two categories:

#### Binary Operators

* `+` (Addition)
* `-` (Subtraction)
* `*` (Multiplication)
* `/` (Division: `int / int` will always yield `int`)
* `%` (Modulo: Returns remainder after dividing two numbers; works reliably with `int`, but floating-point division produces precision-related ambiguity)

**Special Powers of `/` and `%` by Powers of 10:**

* `/` : Used to reduce the number by 1 digit (e.g., `123 / 10 = 12`).
* `%` : Used to get the last digit(s) of a number (e.g., `123 % 10 = 3`).

#### Unary Operators

* **Increment Operator (`++`):** Increases the value by 1.
* **Decrement Operator (`--`):** Decreases the value by 1.
* `+`, `-`, and `!` are also unary operators (e.g., `-5`, `+5`).

#### Rules for Increment and Decrement:

* **Cannot be applied to constants:**
```java
int c = ++10; // compile-time error

```


* **Nesting of both operators is not allowed:**
```java
int a = 10;
int b = ++(++a); // compile-time error [++11]

```


* **Cannot be operated over `final` variables:**
```java
final int a = 10;
int b = ++a; // compile-time error

```


* **Cannot be applied to `boolean` types:**
```java
boolean a = false;
a++; // compile-time error

```



---

### 2. Relational Operators

Used to check the relations between two operands. They return a boolean value (`true` or `false`) by comparing the two operands.

* `>` : Greater Than
* `<` : Less Than
* `>=` : Greater Than or Equal To — Checks if one operand is either greater than or equal to the other.
* `<=` : Less Than or Equal To — Checks if one operand is either less than or equal to the other.
* `==` : Equal To — Checks if two operands are equal.
* `!=` : Not Equal To — Checks if two operands are not equal.

---

### 3. Logical Operators

Combine multiple conditional statements. There are three types of logical operators in Java:

* **Logical AND Operator (`&&`):**
* Returns `true` when both conditions under evaluation are true; otherwise returns `false`.
* **Example:**
```java
if (a > b && a < c) {
    System.out.println("Maximum: " + a);
}

```




* **Logical OR Operator (`||`):**
* Returns `true` if any one of the given conditions is true; otherwise returns `false`. Returns `false` if and only if both conditions under evaluation are false.
* **Example:**
```java
if (a > b || a < c) {
    System.out.println("Max: " + a);
}

```




* **Logical NOT Operator (`!`):**
* Accepts a single value as an input and returns the inverse of the same. This is a unary operator.
* **Example:**
```java
if (!(a < b)) {
    System.out.println("Max: " + a);
}

```





---

### 4. Shorthand (Compound Assignment) Operators

The assignment operator can be combined with other operators to build a shorter version of the statement: `+=`, `-=`, `*=`, `/=`, `%=`.

* **Example:**
  `a = a + 5` can be written as `a += 5`.

> **Note:** Do not confuse shorthand operators with assignment followed by a unary sign:
> * `a += 5` (Adds 5 to `a`)
> * `a = +5` (Assigns positive 5 to `a`)
> * `a = -5` (Assigns negative 5 to `a`)
>
>