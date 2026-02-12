# Module 5: Scanner API & User Input mcq

### 1. Scanner Initialization
To capture user input, you must instantiate the Scanner class using the standard input stream.
* **Syntax:** `Scanner sc = new Scanner(System.in);`
* **Key Part:** `System.in` represents the keyboard input.

---

### 2. Reading Input Methods
The Scanner API provides specific methods for different primitives.

| Method | Returns | Use Case |
| :--- | :--- | :--- |
| `nextInt()` | `int` | Reading whole numbers. |
| `next().charAt(0)` | `char` | Reading a single character. |
| `next()` | `String` | Reading a single word (token). |
| `nextLine()` | `String` | Reading an entire sentence. |



---

### 3. The Character Input Workaround
Java does not have a direct `nextChar()` method. To read a `char`:
1. `next()`: Reads the input as a **String**.
2. `charAt(0)`: Extracts the **first character** from that string.
* **Example:** `char ch = sc.next().charAt(0);`

---

### 4. Common Input Exceptions
If the user provides input that is incompatible with the requested type, Java triggers an error.

* **Exception:** `InputMismatchException`
* **Scenario:** Calling `nextInt()` but the user types "ABC" or `10.5`.



---

### 💡 Quick Summary
* **Integer Input:** `nextInt()`
* **Character Input:** `next().charAt(0)`
* **Object Declaration:** `Scanner sc = new Scanner(System.in);`
* **Error Handling:** Watch for `InputMismatchException`.

# NOTES

### Java Scanner & Char Operations

**Scanner Initialization:**
`Scanner sc = new Scanner(System.in);`

**Scanner Methods:**
* **Primitives:** `nextByte()`, `nextShort()`, `nextInt()`, `nextLong()`, `nextFloat()`, `nextDouble()`, `nextBoolean()`
* **Reading Char Data:** `next().charAt(0);`

**Character Handling:**
* To assign or compare a `char`, use `==` and put characters inside single quotes: `' '`.
* **Utility:** `Character.toLowerCase(c)` converts a character to lowercase.



---

### The `nextLine()` Problem & Buffer
If we try to read a **String** after reading an **Integer, Double, or Float**, Java does not give us a chance to input anything for the string variable.

**The Solution:**
1. After taking an integer input, call `sc.nextLine()` to consume the newline character (`\n`) left in the input buffer.
2. Then, prompt the user to enter the string using a second `nextLine()`.



---

### Escape Sequences
The backslash `\` is a special symbol used for escape sequences. They must be inside double quotes:

| Sequence | Description |
| :--- | :--- |
| `\n` | Next Line (Newline) |
| `\b` | Backspace |
| `\t` | Tab |
| `\"` | Double Quote |
| `\'` | Single Quote |
| `\\` | Backslash |

> **Note:** You cannot use `+ \n +` directly. Use `"\n"` because it is part of a string.

---

### Logic with `Character.isLetter(c)`
Using the NOT operator `!` flips the boolean result:

* **If c is a letter:** `Character.isLetter(c)` is `true` → `!true` is `false` → The `if` block is **skipped**.
* **If c is NOT a letter:** `Character.isLetter(c)` is `false` → `!false` is `true` → The `if` block **runs**.