1. Why do we need OOP?

Object Oriented Programming makes a program easier to understand how it works by bundling together data and behavior into objects that interact with one another in a way that mimics real-world entities.

2. What problem does it solve?

Objects can be written and maintained independently of other objects. Also, an object's methods can access private data from its internal implementation while keeping that data hidden from the outside world. 
It also allows for code re-use by allowing software developers to use objects that already exist,  in their own program. Lastly, if an object is problematic, the object can easily be removed from the program instead of having to rewrite the entire program.

3. What are the 3 main OOP approaches?

The three main Object Oriented Programming approaches are encapsulation, inheritance, and polymorphism.

4. What is encapsulation?

Encapsulation is the idea of being able to bundle information inside a single construct, and also being able to hide and restrict access to that information.

5. What is inheritance?

Inheritance is the concept in Object Oriented Programming that allows new classes to inherit the fields and methods of existing classes.

6. What is an abstract class? 

An abstract class is essentially a blueprint for a subclass. It cannot be instantiated, but it enforces methods and fields to be used by a subclass. 
Unlike interfaces, with abstract classes, you can declare fields that are not static and final, and define public, protected, and private concrete methods.

7. What is an abstract method?

An abstract method is a method in a parent class that must be implemented in a subclass unless that subclass is an abstract class.

8. What is a constructor?

A constructor is a method created by the programmer that is invoked to create objects from the class blueprint. A constructor has no return type. 
It is usually used in a way that allows for assigning information to  class fields within an object, or to do specific behaviors when creating an object.

9. What is a default constructor, and why do we need them?

A default constructor is a method that is used to create an object when there is no constructor provided by the programmer. Default constructors have no parameters and do not assign any fields from the class blueprint. 
They allow for the initialization of an object when a constructor is not explicitly defined.

10. What modifiers do you know? 

There is the public modifier, the private modifier, the protected modifier, and the default or no modifier.

11. What are the differences between them?

The public modifier allows for access from all classes everywhere. The private modifier allows for access only within its own class. The protected modifier allows for access within its own package and subclasses everywhere. 
Lastly the default modifier or no modifier only allows access within its own package.

12. What do you know about the Object class? 

The Object class is at the top of the class hierarchy. All classes have Object as a superclass. The Object class is what defines how objects interact and share information with one another.

13. How is the hashCode method connected with equals? 

The equals method compares two objects together to see if they are the same object. If the equals method is overridden to redefine how two objects are equal to each other, then the hashcode method must also be overridden. 
This is because if two objects are considered equal by the equals method, then their hash codes must also be equal.

14. What is the difference between Overloading and Overriding?

Overloading is when two or more methods have the same name, but take different parameters or a different number of parameters. Overriding is when two or more methods have the same name and the same parameters, but different behavior. 
