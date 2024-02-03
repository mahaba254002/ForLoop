# Data Types

## Primitive Data Types
- They basic data types that store simple values directly. They are predefined by the Java language and are not objects. There are eight primitive types in Java:

1. byte: Represents a signed 8-bit integer value.
2. short: Represents a signed 16-bit integer value.
3. int: Represents a signed 32-bit integer value.
4. long: Represents a signed 64-bit integer value.
5. float: Represents a 32-bit floating-point value.
6. double: Represents a 64-bit floating-point value.
7. char: Represents a single character using 16 bits.
8. boolean: Represents a boolean value, which can be either true or false.

## Reference Data Types
- They are non-primitive types that store references (memory addresses) to objects. 
- They include :
  1. classes 
  2. arrays 
  3. interfaces. 

- Reference types are created using the new keyword or by assigning the value of an existing object to a variable.

- Are stored on the heap and can have dynamic size. 
- They are pass-by-reference, meaning that when you assign a reference type to another variable or pass it as a method argument, you're actually passing a copy of the reference, not the underlying object itself.

### Differences

1. Storage: Primitive types store their values directly, while reference types store references (memory addresses) to objects. Primitive types are stored on the stack, while objects (reference types) are stored on the heap.

2 Size: Primitive types have a fixed size depending on their type, while objects (reference types) have a dynamic size based on the data they contain.

3. Default Values: Primitive types have default values if not explicitly initialized. For example, int defaults to 0, boolean defaults to false, and so on. Reference types (objects) have a default value of null if not explicitly assigned to an object.

4. Assignment and Comparison: Primitive types are compared and assigned by value. When you assign a primitive type to another variable or pass it as a method argument, a copy of the value is created. Reference types are compared and assigned by reference. When you assign a reference type to another variable or pass it as a method argument, you're passing a copy of the reference (memory address), not the underlying object itself.

5. Wrapper Classes: Java provides wrapper classes (e.g., Integer, Float, etc.) to represent primitive types as objects. These wrapper classes allow performing additional operations on primitive types, such as using them in collections or invoking methods on them. However, they introduce some overhead due to the object representation.

6. Mutability: Primitive types are immutable, meaning their values cannot be changed once assigned. Reference types can be mutable, allowing you to modify the state of the underlying object.

7. Operator Support: Primitive types support various operators directly, such as arithmetic, logical, and relational operators. Reference types (objects) don't support these operators directly; instead, you need to use methods defined on the objects themselves to perform operations.