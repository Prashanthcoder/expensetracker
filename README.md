# Expense Track

Simple command-line expense tracker in Java

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![Version](https://img.shields.io/badge/version-0.1.0-blue)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

## What the project does

`Expense Track` is a minimal, educational command-line application for recording and viewing simple expenses. It demonstrates basic Java concepts (classes, lists, input/output) and provides a tiny interactive UI for adding expenses, listing them, and showing the total.

## Why this is useful

- Lightweight example for beginners learning Java IO and collection usage.
- Small, focused codebase suitable for learning, testing, or extending into a larger budgeting tool.

## Key features

- Add an expense with a title and amount.
- View expense history.
- Show total expenditure.

## Getting started

Prerequisites

- JDK 11 or later installed.

Build and run (from repository root)

```bash
# compile
javac -d out src/*.java

# run
java -cp out Main
```

Usage

When you run the program it presents a simple menu:

1. Add expense
2. View expenses
3. Show total
4. Exit

Example session (user input shown after prompts):

```
Enter the choice user choose between these only
1. Add expense

2. view expenses

3. show total 

4. Exit
1
Enter the expense  title and its expense you wann add
Coffee
2.5
The new expense added.
```

Project structure

- `src/Expense.java` — simple `Expense` model (title, amount)
- `src/ExpenseTracker.java` — holds `ArrayList<Expense>` and operations
- `src/Main.java` — interactive CLI entrypoint

See source files for implementation details.

## Where to get help

- Open an issue in this repository for bugs or questions.
- For quick questions, add a short note in the repository's Discussions (if enabled) or ping the maintainers.

## Contributing

Contributions are welcome. Please see `CONTRIBUTING.md` for guidelines on filing issues and submitting pull requests.

## Maintainers

- Current maintainer: Repository owner (see project settings for contact)

## License

This project is available under the terms of the `LICENSE` file in this repository.
