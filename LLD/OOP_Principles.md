# Object-Oriented Programming (OOP)

**Object-Oriented Programming (OOP)**:

- A programming paradigm based on objects.
- Helps ensure modularity, reusability, and maintainability.
- Four pillars:
  - **Encapsulation**: Bundling data and methods into a single unit (object), hiding internal details and providing a clear interface for interaction. This protects data integrity, promotes information hiding, and reduces the impact of changes in one part of the system on others.
  - **Abstraction**: Hiding implementation details and showing only essential features to the user.
  - **Inheritance**: Allowing a class to inherit properties and behaviors from another class.
  - **Polymorphism**: Enabling objects to take on many forms by overriding or overloading methods.

## Key Concepts:

### Classes and Objects:

  - **Class**: A blueprint for creating objects, defining their structure and behavior. It is a logical construct.
  - **Object**: An instance of a class. It is a physical entity that occupies space in memory.

### Constructors:

  - Special methods used for initializing objects.
  - A constructor is automatically invoked when an object of a class is created.
  - The constructor name must be the same as the class name.
  -  Java does not support static constructors. Static blocks are used for static initialization, where static variables or static resources need to be initialized before the class is used.
  - **Types of Constructors**:
    - **Default Constructor**: A constructor with no parameters. It initializes object members with default values.
    - **Parameterized Constructor**: A constructor that accepts arguments to initialize an object with specific values.

### Constructor Chaining:

  Constructor chaining in Java refers to the process of one constructor calling another constructor within the same class or in itssuperclass. This allows for reusing constructor code and avoiding redundancy in initialization tasks.

  ### Here's how constructor chaining works:

  1. **Using `this()` Keyword**:
  - Inside a constructor, the `this()` keyword is used to call another constructor of the same class.
  - This call must be the **first statement** in the constructor.

  2. **Using `super()` Keyword**:
  - Inside a constructor, the `super()` keyword is used to call a constructor of the superclass.
  - This call must also be the **first statement** in the constructor.


### Initialization Blocks:

  - **Instance Initialization Block**: These are blocks of code inside a class that are executed each time an object is created. They are executed **before** the constructor.
  - **Static Initialization Block**: These blocks are used to initialize **static variables** or perform tasks that need to occur only once when the class is loaded into memory. They are executed when the class is loaded, **before** any objects are created.

  **Syntax**:

  ```java
  class MyClass {
      // Instance Initialization Block
      {
          System.out.println("Instance Initialization Block executed.");
      }

      // Static Initialization Block
      static {
          System.out.println("Static Initialization Block executed.");
      }

      public MyClass() {
          System.out.println("Constructor executed.");
      }

      public static void main(String[] args) {
          MyClass obj = new MyClass(); // Static block runs once when the class is loaded
      }
  }
  ```
  **Output**:
  ``` 
      Static Initialization Block executed.
      Instance Initialization Block executed.
      Constructor executed.
  ```

### Access Modifiers:
  The following table shows the accessibility of members based on different access modifiers:

  | Modifier                          | Class | Package | Subclass (same pkg) | Subclass (diff pkg) | World (diff pkg & not subclass) |
  | --------------------------------- | ----- | ------- | ------------------- | ------------------- | ------------------------------- |
  | **public**                        | +     | +       | +                   | +                   | +                               |
  | **protected**                     | +     | +       | +                   | +                   |                                 |
  | **no modifier** (package-private) | +     | +       | +                   |                     |                                 |
  | **private**                       | +     |         |                     |                     |                                 |

### Static Keyword in Java:

  -  It is a **non-access modifier** that can be applied to variables, methods, blocks, and inner classes.
  - **Static Members**: Belong to the class, not to an instance. Can be accessed before any objects of the class are created.
  - **Static Methods**: 
    - Belong to the class and can be called without creating an object.
    - Can only access other static members and cannot access non-static members. On the other hand, non static methods can access static members.
    - Cannot use `this` or `super` keywords.
    - Can be overloaded (i.e., multiple static methods with the same name but different parameters). Method overloading is resolved at compile-time.
    - Cannot be overridden, as method resolution for static methods happens at compile-time (not runtime).
  - **Static Variables**: Shared by all instances of the class. Initialized once and retain the same value for all instances.
  - **Static Blocks**: Used to initialize static variables or perform one-time class-level setup when the class is loaded.
  - **Main Method**: `main()` is static so it can be called without creating an object of the class.
  - **Static in Interfaces**: Static methods in interfaces are not inherited by implementing classes or sub-interfaces.
  - **Static Inner Classes**: Declaring a static inner class means it has no reference to the outer class instance.

### Final Keyword in Java:
  - It is a **non-access modifier** applicable only to a variable, a method, or a class.
  - **Final Variables**: Once initialized, their value cannot be changed, making them constants.
  - **Final Methods**: Cannot be overridden by subclasses (Prevents Method Overriding).
  - **Final Classes**: Cannot be subclassed (Prevents Inheritance).

