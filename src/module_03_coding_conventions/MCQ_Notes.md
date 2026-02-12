
### 1. Variable Naming Rules
In Java, identifiers (variables, methods, classes) follow strict naming conventions:
* **Valid Start:** Must begin with a letter (A-Z or a-z), an underscore `_`, or a dollar sign `$`.
* **Subsequent Characters:** Can include digits `0-9`.
* **Case Sensitivity:** `num` and `Num` are different variables.

| Valid | Invalid | Reason |
| :--- | :--- | :--- |
| `num1` | `1num` | Cannot start with a digit. |
| `_value` | `num@` | `@` is an invalid character. |
| `$price` | `NUM#` | `#` is an invalid character. |



---

### 2. Class Naming (PascalCase)
Java classes follow **PascalCase** convention to distinguish them from variables and methods.
* **Rule:** The first letter of every word must be capitalized.
* **Example:** `MyFirstClass`, `UserAccount`, `DataStructure`.

---

### 3. Reserved Keywords
Keywords are reserved by Java for specific functions and **cannot** be used as identifiers (variable names).
* **Example:** `void` is a return type meaning "no value."
* **Error:** `int void = 10;` will result in a **compilation error** because `void` is a reserved keyword.

---

### 4. What is a Variable?
A **Variable** is a named storage location in the computer's memory (RAM).
* It acts as a container for data.
* Each variable has a specific **data type** (like `int`, `double`, or `String`) that determines the size and layout of that memory.



---
# NOTES

### String Escaping
To include a double quote `"` inside a string, use the escape character: `\"`

### Type Operations & Concatenation
The behavior of the `+` operator depends on the data types:

* **int + int** = `int` (Mathematical addition)
* **int + string** = `string` (Concatenation)
* **string + string** = `string` (Concatenation)

> **Concatenation:** The operation of joining multiple character strings.

---

### Naming Conventions

#### Camel Case
* **Usage:** Variables and Methods.
* **Rule:** 1st letter lower case, subsequent words upper case (for readability).
* **Example:** `int isUserAuth = 0;`

#### Pascal Case
* **Usage:** Classes.
* **Rule:** 1st letter of every word is capital.
* **Example:** `MyClass`

#### Snake Case
* **Usage:** Often used in Python or Database fields.
* **Rule:** Using underscores `_` to differentiate letters/words.
* **Example:** `user_auth_status`

#### Kebab Case
* **Usage:** Common in HTML and CSS.
* **Rule:** Using a dash `-`.
* **Example:** `user-auth-button`