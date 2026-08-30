# 1. CLASS THEORY - SWITCH

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

```java
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
        yield "Tue"; // 'yield' is used to return a value from a block
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