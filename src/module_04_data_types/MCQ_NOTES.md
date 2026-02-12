# Java Data Types & Floating-Point Logic

### 1. Data Type Memory Sizes
Java allocates a specific number of bits for each primitive type:

| Type | Size (Bits) | Note |
| :--- | :--- | :--- |
| **byte** | 8 bits | Smallest integer type. |
| **char** | 16 bits | Larger than byte; stores Unicode characters. |
| **float** | 32 bits | Single-precision decimal. |
| **double** | 64 bits | Double-precision decimal (Default). |



---

### 2. Floating-Point Literals & Suffixes
In Java, any decimal number (e.g., `5.0`) is treated as a **double** by default.

* **The Error:** Assigning `5.0` directly to a `float` (e.g., `float f = 5.0;`) causes a **compiler error** because you are trying to fit a 64-bit double into a 32-bit float (possible data loss).
* **The Fix:** You must use the `f` or `F` suffix to indicate a float literal.
    * ❌ `float x = 5.0;` (Error)
    * ✅ `float x = 5.0f;` (Correct)

---

### 3. Variable Declaration Rules
Java requires a clear type for every variable. You cannot "mix and match" or leave types undefined in a single statement.
* **Rule:** Every variable must be explicitly declared with its specific type.
* **Correct:** `int a = 5; double b = 10.5;`
* **Incorrect:** Mixing types in a way that confuses the compiler in a single declaration line.

---

### 4. Summary Table: Default Types
| Literal | Default Type | Required Suffix for Others |
| :--- | :--- | :--- |
| `10` | `int` | `L` for long (`10L`) |
| `10.5` | `double` | `f` for float (`10.5f`) |