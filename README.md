# Decimal to Binary Calculator

This is a simple Android application that converts decimal numbers to binary. The app features a calculator-style UI built using Material Design components, allowing users to input decimal digits and convert them with a single tap.

---

## ✨ Features

- Simple and clean calculator interface.
- Input digits using on-screen buttons.
- Delete last digit (`x` button).
- Clear input (`C` button).
- Convert decimal to binary (`=` button).
- Designed with Material Components for a modern look.

---

## 📱 UI Layout

The UI is structured using a `RelativeLayout`, containing:

- A title (`TextView`)
- Two display fields:
  - `solution_Ans`: for current input
  - `result_Ans`: for binary output
- A `LinearLayout` with nested rows of `MaterialButton`s (digits 0–9, clear, delete, equal, etc.)

---

## 🧠 How It Works

1. Users tap number buttons to build a decimal number.
2. Pressing `=` triggers a conversion:
   - The decimal number is parsed as an integer.
   - It is then converted to binary using either a manual method or Java's built-in `Integer.toBinaryString()`.
3. The binary result is displayed in the `result_Ans` field.
4. Pressing `C` clears both fields, and `x` removes the last character from input.

---

## 🙋‍♂️ Future Improvements

1. Implement + button for multi-digit addition.

2. Enable D-B button for explicit decimal-to-binary conversion.

3. Add support for binary-to-decimal mode.

4. Improve input validation and error handling.

---

## 🔧 Code Overview

### MainActivity.java

- Implements `View.OnClickListener` to handle all button events.
- Uses `TextView` to display input and result.
- Button initialization is done using a helper method (`assignId()`), which attaches listeners dynamically.
- Conversion logic is handled in `result(String d)`.

### Example Conversion Logic:
```java
String result(String d) {
    int v = Integer.parseInt(d);
    return Integer.toBinaryString(v);
}


