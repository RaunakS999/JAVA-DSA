# 7.  Sum of Even and Odd Numbers in a Range

`Easy`

---

## Description

Write a program that accepts two integers `start` and `end` as input and calculates:

1. The sum of all even numbers within the range `[start, end]` (inclusive).
2. The sum of all odd numbers within the range `[start, end]` (inclusive).

If `start` is greater than `end`, swap the values before calculating the sum.

---

## Input Format

* The first line contains an integer `start` (Lower bound of range).
* The second line contains an integer `end` (Upper bound of range).

---

## Output Format

* Print the sum of even numbers first.
* Print the sum of odd numbers next.
* For JavaScript: Return an array containing two numbers—the sum of even numbers first, followed by the sum of odd numbers.

---

## Examples

### Example 1:

**Sample Input:**

```text
1
5

```

**Expected Output:**

```text
6
9

```

---

### Example 2:

**Sample Input:**

```text
2
10

```

**Expected Output:**

```text
30
25

```


#   11. Calculate Power of a Number

`Easy`

---

## Description

Write a program that accepts two integers, `a` and `b`, as input and calculates the value of `a` raised to the power of `b` ($a^b$). For example, if $a = 2$ and $b = 3$, the result is $8$ (since $2^3 = 8$).

---

## Input Format

* The first line contains an integer `A` (Base number).
* The second line contains an integer `B` (Exponent).

---

## Output Format

* Print the value of `A^B`.
* For JavaScript: Return an ans instead of printing.

---

## Examples

### Example 1:

**Sample Input:**

```text
2
3

```

**Expected Output:**

```text
8

```

---

### Example 2:

**Sample Input:**

```text
5
0

```

**Expected Output:**

```text
1

```



# 13. Find Number of Integers with Exactly X Divisors

`Medium`

---

## Description

Given an integer `n`, your task is to find how many integers from 1 to `n` have exactly `x` divisors. An integer is said to have exactly `x` divisors if the total count of numbers that divide it evenly is equal to `x`.

---

## Examples

### Example 1:

**Sample Input:**

```text
10
4

```

**Expected Output:**

```text
3

```

---

### Example 2:

**Sample Input:**

```text
20
6

```

**Expected Output:**

```text
3

```

---

---

# 14. Finding Prime Factors of a Number

`Hard`

---

## Description

Write a program to find and print all the prime factors of a given number. A prime factor is a factor that is a prime number. If the number is `0` or `1`, print `No prime factors`.

---

## Input Format

The input consists of a single integer `N`.

---

## Output Format

Print each prime factor on a new line. If `N = 0` or `N = 1`, print `"No prime factors"`.

---

## Examples

### Example 1:

**Sample Input:**

```text
60

```

**Expected Output:**

```text
2
2
3
5

```

---

### Example 2:

**Sample Input:**

```text
45

```

**Expected Output:**

```text
3
3
5

```

---

---

# 15. Sum of Even-Indexed Fibonacci Numbers

`Easy`

---

## Description

Write a Java program that calculates the sum of Fibonacci numbers at even indices up to the `2n`-th Fibonacci number for a given positive integer `n`. The program should output the sum of Fibonacci numbers at indices `2, 4, 6, ..., 2n`.

---

## Examples

### Example 1:

**Sample Input:**

```text
4

```

**Expected Output:**

```text
33

```

---

### Example 2:

**Sample Input:**

```text
7

```

**Expected Output:**

```text
609

```