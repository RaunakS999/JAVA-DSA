
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