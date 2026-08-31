# 1. CLASS THEORY - SWITCH _ DO WHILE

### Traditional Switch Statement

```java
int day = 2;
switch (day) {
    case 1: {
        System.out.println("MON");
        break;
    }
    case 2: {
        System.out.println("TUE");
        break;
    }
    case 3: {
        System.out.println("WED");
        break;
    }
    default: {
        System.out.println("wrong");
    }
}

```

---

### Modern Switch Expressions (Java 14+)

#### Arrow Syntax & Multiple Labels:

```java Class notes
int day = 3;
switch (day) {
    case 1 -> System.out.println("mon");
    case 2, 3 -> System.out.println("tue");
}

```

#### Switch Expression with `yield` & Default Case:

```java
String dayname = switch (day) {
    case 1 -> "mon";
    case 2 -> {
        System.out.println("hello");
        yield "Tue"; // 'yield' is used to return a value from a block (when multiple line are used to write code)
    }
    case 3 -> "wed";
    default -> "wrong"; // Default case is compulsory in switch expressions to cover all paths
};
System.out.println(dayname);

```

---

# NOTES

## while loop

The `while` loop is used when the number of iterations is not known, but the terminating condition is known.
The loop is executed until the given condition evaluates to `false`.

### Syntax:

```java
// initialization
while (condition) {
    // Body of the loop
    // Updation
}

```

### Example:

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

```

**Output:**

```text
0 1 2 3 4

```

---

---

### Condition Behavior:

* `while` always expects a boolean expression that evaluates to `true` to enter. If you initially provide a condition expression that evaluates to `false` (not the literal constant `false`), it will neither give a syntax error nor enter the loop body:
```java
int i = 0;
while (i > 9) { // False condition, but valid syntax (no syntax error)
    System.out.println(i);
}

```


* If you pass the literal boolean value `false` directly, Java detects unreachable code and throws a compile-time syntax error:
```java
while (false) { // Compile-time syntax error: Unreachable statement
    System.out.println("Hello LOLU");
}

```

     # do-while Loop

The `do-while` loop is like the `while` loop except that the condition is checked after evaluation of the body of the loop. Thus, the `do-while` loop is an example of an **exit-controlled loop**.

This loop runs at least once irrespective of the test condition, and at most as many times the test condition evaluates to true.

### Syntax:

```java
// Initialization;
do {
    // Body of the loop (Statement(s))
    // Updation;
} while (Condition);

```

### Example:

```java
int i = 1;
do {
    System.out.println("Hii");
    i++;
} while (i < 3);

```

**Output:**

```text
Hii
Hii

```

---



The code inside the `do-while` loop will be executed in the first step. Then after updating the loop variable, we will check the necessary condition; if the condition satisfies, the code inside the `do-while` loop will be executed again. This will continue until the provided condition is not true.

---

### Infinite do-while Loop

```java
int i = 0;
do {
    i++;
} while (i > -1);

```

There will be no output for the above code also, the code will never end. Value is initialized to `0` then incremented by `1` so it can never be `-1`, hence the loop will never end.

---

# Switch Statements

* EXAMPLE CASE USE

```java
if (day == 1)
```

* `==` operator is comparison
* `day` is variable
* `1` is constant

This type of pattern uses `switch case` (one side variable and another side is constant).

> **New JAVA 14+ version:**
> Use `->` arrow instead of `:` colon to remove `break`.

The switch statement is a control flow statement that allows you to select one of many code blocks to be executed based on the value of an expression. In simple words, the Java switch statement executes one statement from multiple conditions.

---

### Syntax

```java
switch (expression) {
    case x:
        // code block
        break;
    case y:
        // code block
        break;
    default: // optional
        // code block to be executed if no cases match
}

```

---

### Example

```java
char ch = 'a';
switch (ch) {
    case 'a':
        System.out.println("Vowel");
        break;
    case 'e':
        System.out.println("Vowel");
        break;
    case 'i':
        System.out.println("Vowel");
        break;
    case 'o':
        System.out.println("Vowel");
        break;
    case 'u':
        System.out.println("Vowel");
        break;
    default:
        System.out.println("Consonant");
}

```

**Output:**

```text
Vowel

```

---

### Important Points about Java's switch statement:

* **No variables:** The case value must be a literal or constant.
* **No duplicates:** No two cases should be of same value. Otherwise, a compilation error is thrown.
* **Allowed Types:** `int`, `byte`, `short`, `char`, `String`, and enum types. Primitives are allowed with their wrapper types (`Character`, `Byte`, `Short`, `Integer`).
* **Optional Break Statement:** Break statement is optional. If a case is matched and there is no break statement mentioned, subsequent cases are executed until a break statement or end of the switch statement is encountered (fall-through condition).
* **Optional default case:** Default case value is optional. The default statement is meant to execute when there is no match between the values of the variable and the cases. It can be placed anywhere in the switch block.

---

### Multiple Cases Combined with Commas

```java
char ch = 'a';
switch (ch) {
    case 'a', 'e', 'i', 'o', 'u':
        System.out.println("Vowel");
        break;
    default:
        System.out.println("Consonant");
}

```

---

## Fall-Through Statement

A fall-through statement occurs when there is no `break` statement at the end of a case block. When a case block does not have a `break` statement, the code execution continues to the next case block, even if the condition for that case is not met. This behavior is known as **fall-through**.

### Example:

```java
int number = 2;
switch (number) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    case 3:
        System.out.println("Three");
    default:
        System.out.println("Default");
}

```

**Output:**

```text
Two
Three
Default

```

*It executed the code for case 2, then continued to case 3, and finally to the default block.*

---

## Arrow Switch

```java
int number = 2;
switch (number) {
    case 1 -> System.out.println("One");
    case 2 -> System.out.println("Two");
    case 3 -> System.out.println("Three");
    default -> System.out.println("Default");
}

```

It simplifies code and eliminates the need for explicit `break` statements.

---

## yield Keyword

`yield` keyword is used in combination with the new switch expression introduced in Java 12 to return a value from a switch expression.

It allows you to specify the value to be returned from a particular case block in the switch expression.

```java
int dayOfWeek = 3;
String dayName = switch (dayOfWeek) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    default -> "Unknown";
};
System.out.println("Day of the week is: " + dayName);

```

Using explicit `yield`:

```java
int dayOfWeek = 3;
String dayName = switch (dayOfWeek) {
    case 1: yield "Monday";
    case 2: yield "Tuesday";
    case 3: yield "Wednesday";
    case 4: yield "Thursday";
    case 5: yield "Friday";
    default: yield "Unknown";
};
System.out.println("Day of the week is: " + dayName);

```

**Output:**

```text
Day of the week is: Wednesday

```

