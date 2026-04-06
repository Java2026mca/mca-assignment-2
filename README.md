# Assignment 2 — OOP Concepts

![Autograder](../../actions/workflows/autograder.yml/badge.svg)

**MCA | Object-Oriented Programming with Java**

---

## Questions

| # | Topic | File |
|---|-------|------|
| Q01 | Bank Account (Encapsulation) | `src/q01/Main.java` |
| Q02 | Palindrome Check | `src/q02/Main.java` |
| Q03 | Animal Inheritance (Abstract Class) | `src/q03/Main.java` |
| Q04 | Shape Interface (area + perimeter) | `src/q04/Main.java` |
| Q05 | Exception Handling — Division by Zero | `src/q05/Main.java` |
| Q06 | Queue using LinkedList | `src/q06/Main.java` |
| Q07 | Box — Constructor Chaining | `src/q07/Main.java` |
| Q08 | Calculator — Method Overloading | `src/q08/Main.java` |
| Q09 | Custom Exception (InvalidAgeException) | `src/q09/Main.java` |
| Q10 | Multilevel Inheritance (Person→Employee→Manager) | `src/q10/Main.java` |

---

## How to Submit

1. Open the question file — read the `// TODO` comment
2. Write your solution inside `main()` (you may add helper classes above it)
3. Test locally, then push
4. Go to **Actions tab** → latest run → expand each question to see result

---

## Checking Results

| Symbol | Meaning |
|--------|---------|
| ✅ PASS | Correct output |
| ❌ FAIL | Wrong output — expected vs got is shown |

---

## Local Testing

```bash
javac src/q03/Main.java
printf "3\nDog Bruno\nCat Luna\nCow Ganga\n" | java -cp src/q03 Main
```

---

**Rules:** Edit `src/qXX/Main.java` only. Keep class name as `Main`. No extra print statements.
