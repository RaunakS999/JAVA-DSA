# 5. Check if a Number is Strong

`Easy`

---

## Description

A number is called a strong number if the sum of the factorial of its digits is equal to the number itself. Write a program that accepts a number and checks if it is a strong number.

* If `n` is a strong number, print `"Yes"`.
* Otherwise, print `"No"`.

---

## Input Format

* The input consists of a single positive integer `n`.

---

## Output Format

* Print `"Yes"` if `n` is a strong number, otherwise `"No"`.
* For JavaScript: Return the result instead of printing.

---

## Examples

### Example 1:

**Sample Input:**

```text
145

```

**Expected Output:**

```text
Yes

```

---

### Example 2:

**Sample Input:**

```text
123

```

**Expected Output:**

```text
No

```

---

---

# 6. Check if a Number is Automorphic

`Easy`

---

## Description

A number is called an Automorphic number if its square ends with the number itself.

**For example:**

* `25` is Automorphic because: $25^2 = 625$. The last two digits are `25` (which matches the number itself).

Write a program that accepts a positive integer `n` and checks whether it is an Automorphic number.

* If `n` is an Automorphic number, print `"Yes"`.
* Otherwise, print `"No"`.

---

## Input Format

* The input consists of a single positive integer `n`.

---

## Output Format

* Print `"Yes"` if `n` is an Automorphic number, otherwise print `"No"`.
* For JavaScript: Return the result instead of printing.

---

## Examples

### Example 1:

**Sample Input:**

```text
5

```

**Expected Output:**

```text
Yes

```

---

---

# 7. Single Digit Sum of Digits

Sum of Digits until the number becomes a single digit.

---

## Examples

### Example 1:

**Input:**

```text
6758

```

**Output:**

```text
8

```

**Explanation:**


$$6 + 7 + 5 + 8 = 26$$

$$2 + 6 = 8$$

---

---

# 10. Check if a Number is a Harshad (Niven) Number

`Medium`

---

## Description

Write a program to check whether a given positive integer is a Harshad number or not. A number is called a Harshad number if it is divisible by the sum of its digits.

**For example:**

* `18` is a Harshad number because the sum of its digits ($1 + 8 = 9$) divides $18$ exactly ($18 \pmod 9 == 0$).

---

## Examples

### Example 1:

**Sample Input:**

```text
18

```

**Expected Output:**

```text
Yes

```

---

### Example 2:

**Sample Input:**

```text
19

```

**Expected Output:**

```text
No

```

---

---

# 12. Abundant Number Checker

`Medium`

---

## Description

An Abundant Number is a number for which the sum of its proper divisors (divisors excluding the number itself) is greater than the number. Your task is to write a program to determine if a given number is an Abundant Number. Return `"Yes"` or `"No"`.

---

## Examples

### Example 1:

**Sample Input:**

```text
12

```

**Expected Output:**

```text
Yes

```

---

### Example 2:

**Sample Input:**

```text
10

```

**Expected Output:**

```text
No

```

---

---

# 13. Check if a Number is a Neon Number

`Easy`

---

## Description

Write a Java program that checks if a given number is a Neon number. A Neon number is a number where the sum of the digits of the square of the number is equal to the number itself.

---

## Input Format

The input contains a single integer `N`, representing the number to be checked.

---

## Output Format

Print `Yes` if `N` is a Neon Number; otherwise, print `No`.

---

## Examples

### Example 1:

**Sample Input:**

```text
9

```

**Expected Output:**

```text
Yes

```

---

### Example 2:

**Sample Input:**

```text
10

```

**Expected Output:**

```text
No

```

---

---

# 14. Validate ISBN Number

`Hard`

---

## Description

An ISBN-10 (International Standard Book Number) consists of 10 digits. Your task is to write a function to determine whether a given ISBN-10 number is valid or not.

**Rules:**

* Multiply each digit of the ISBN-10 by its position value ($1$ for the first digit, $2$ for the second digit, and so on, up to $10$ for the last digit). Sum these products.
* If the total sum is divisible by $11$, the ISBN-10 is considered valid. Otherwise, it is invalid.

---

## Examples

### Example 1:

**Sample Input:**

```text
306406152

```

**Expected Output:**

```text
false

```

---

### Example 2:

**Sample Input:**

```text
1234567890

```

**Expected Output:**

```text
false

```

---

---

# 15. Repeat Hello

---

## Description

Write a program that repeatedly prints `"Hello"` until the user provides incorrect input using a `do-while` loop.

---

## Example 1

**Flow:**

```text
Hello
Press 1 to repeat
1
Hello
Press 1 to repeat
0
Program Exits

```

---

---

# 16. Calculator

---

## Description

Write a program to create a choice-based calculator using a `do-while` loop. The program should repeatedly prompt the user to choose an operation and perform the corresponding calculation until the user chooses to exit.

---

## Example 1

**Flow:**

```text
Choose an operation:
Addition
Subtraction
Multiplication
Division
Exit

Enter your choice: 1
Enter the first number: 10
Enter the second number: 5

Sum = 15

```

---

---

# 17. Guess the Number

---

## Description

Write a program that generates a random number `target` in the range of $1\text{--}100$ and asks the user to guess what the number is.

* If user's guess is equal to `target`, print `"Congrats."`
* If user's guess is higher than `target`, print `"Too high, try again."`
* Else print `"Too low, try again."`

The program should use a loop that repeats until the user correctly guesses the random number.

---

## Example 1

**Flow:**

```text
Guess the number
23
Too low, try again
67
Too high, try again
40
Congrats.
Program exits.

```