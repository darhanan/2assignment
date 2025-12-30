# Assignment 2 — Vehicle Management System (Java OOP)

## What this project shows
This small Java project demonstrates core OOP concepts:

- **Abstraction**: `Vehicle` is an abstract superclass.
- **Inheritance**: `Car`, `Motorcycle`, and `Truck` extend `Vehicle`.
- **Overriding**: each vehicle type implements its own `startEngine()` and `stopEngine()`.
- **Association (Driver)**: every vehicle can have a driver assigned, and the same driver can be used for multiple vehicles.

## Classes
- `Vehicle` (abstract)
- `Car`, `Motorcycle`, `Truck`
- `Driver`
- `Main` (runs the demo)

## How to run

From inside `src/`:
```bash
cd src
javac *.java
java Main
```

DARKHAN TYNYSHTYK