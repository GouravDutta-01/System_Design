# SOLID Principles 

## 1. Single Responsibility Principle (SRP)
- A class should have only one reason to change.
- Each class should have a single, well-defined responsibility.

## 2. Open/Closed Principle (OCP)
- Software entities (classes, modules, functions) should be open for extension but closed for modification.
- Design the system so new functionality can be added without altering existing code.
- Use interfaces or abstract classes to add new functionality.

## 3. Liskov Substitution Principle (LSP)
- Subtypes must be substitutable for their base types without altering the correctness of the program.
- Derived classes must not violate the expectations set by the base class.
- Avoid overriding methods in a way that breaks the functionality of the base class.

## 4. Interface Segregation Principle (ISP)
- No client should be forced to depend on methods it does not use.
- Design small, specific interfaces instead of a large, general-purpose interface.
- Split a large interface into smaller, more focused ones.

## 5. Dependency Inversion Principle (DIP)
- High-level modules should not depend on low-level modules; both should depend on abstractions.
- Rely on abstractions, not concrete implementations.
- Allows for decoupling, which means that code can remain intact even if implementation details change.

