# Java Functional Programming
Inspired by AmigosCode [Java Functional programming](https://www.youtube.com/watch?v=VRpHdSFWGPs) and [Learn Java Functional Programming with Lambdas & Streams](https://www.udemy.com/course/functional-programming-with-java/) 

[java.util.function](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html#package.description) is one of the most important Java package to code using Functional Programming.

In order to understand the concept of Functional Programming you should have a look at the ``programming paradigms``.

##Paradigms

They establish the rules and logic to develop programs.

Currently, most existing programming languages support:
* ``imperative paradigm`` (you write ``HOW`` to do)
* ``declarative paradigm`` (you write ``WHAT`` to do)
* both paradigms

The programming languages subdivide into paradigms mostly according to:
* ``code structures`` (how the programmers should write the code)
* ``execution models`` (how the computers proceed with the program execution)

###Imperative Paradigms

It presents as a central characteristic the ``definition of sequences of instructions``.

Imperative Paradigm has two popular derived paradigms:
* ``procedural paradigm``
* ``object-oriented paradigm``

The imperative paradigm got two sequential evolutions:

      imperative programming -> structured programming -> modular programming

``Structured programming`` defined that a subroutine has a single starting command and, preferably, a single exit point.

``Modular programming`` divided programs into modules with particular members:
``names``, ``procedures``, ``variables``, and ``submodules``.

###Procedural Paradigm

It focuses on dividing a program from a simple sequence of instructions to a collection of subroutines with particular instructions, structures, and variables.

Implementing subroutines demanded new instructions for developing programs:
* ``declaration`` typically defines its name and the required parameters  ``def sum(a,b){}``
* ``return`` instruction indicates the result of a subroutine ``return a+b``
* ``call``, instruction that triggers the execution of an already declared subroutine ``sum(1,2)``

Programming languages that support procedural programming are Basic, C, Pascal, and Python.

###Object-oriented Programming Paradigm

``Object-oriented`` focuses on ``data``, operations only come after.

The ``object-oriented programming paradigm`` was inspired by concepts from modular programming, and it is based on 3 main concepts:
* ``classes``meant as representations of things in the real world
```
class Rectangle {
}
```
* ``attributes`` meant as information stored in the context of a class 
```
  double width;
  double height;
```
* ``methods`` meant as procedures associated with a class
```
int area() {
 return width * height;
}
```
Object-oriented programming added new concepts for the imperative paradigm, such as ``abstraction``, ``encapsulation``, ``inheritance``, and ``polymorphism``.

Programming languages that support object-oriented programming are C++, PHP, ``Java``, and Python.

###Declarative Paradigms
It focuses on the definition of tasks that computer systems must accomplish.

Due to this characteristic of describing ``what to do instead of how to do`` something, program codes in the declarative paradigm naturally pose a higher abstraction level.

Two popular paradigms derive from the declarative paradigm are:
* ``functional paradigm``
* ``logic paradigm``

###Functional Paradigm
``Functional paradigm`` focuses on ``operations`` rather than data.

It considers that programs are compositions of multiple functions.
There are different categories of functions:
* ``first-class functions``, elementary functions that can be assigned to variables, passed as arguments to other functions, and returned as other functions result.
* ``pure functions``,  functions that follow the properties of:
  * ``transparency`` means that a function always returns the same result given the same input
  * ``lack of side effects`` means that a function does not cause any state mutation in the program, for example, printing some information or sending data through the network
* ``high-order functions``, functions receiving other functions as arguments, or returning a function as a result (or even both).

Programming languages that support functional programming are Haskell, Scala, and Kotlin.

###Logic Paradigm
It uses formal logic to solve a myriad of problems and relies on a knowledge base with several facts and rules to answer queries:
* ``facts`` represents specific relations among objects
* ``rules`` are predicates that describe a logical relation among facts. Rules have head and body, where generally ``head is an assertion``, and the ``body is a condition``
* ``queries`` consists of one or more logic expressions interleaved with logic operators

Programming languages that support logic programming are ASP, Datalog, and Prolog.