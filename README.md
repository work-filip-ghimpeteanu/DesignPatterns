# This implements the Design Pattern exposed in the Head First Design Pattern book


## 1. The Factory Pattern
__|a|__ Comes in two flavors: Factory Method & Abstract Factory

__|b|__ Factory Method
  * delegates creation of an Product (e.g. Pizza) to its subclasses
  * uses an abstract method __create()__ to do this
  * in the PizzaStore example uses the Dependency Inversion principle to decouple
    from creation of pizzas and from the actual pizza types:
      - Pizza abstraction = decouples from concrete pizza type
      - Factory Pattern = decouple from the creation of pizza

__|e|__ Two types of abstraction: Product (Pizza), Creator (PizzaStore)

__|d|__ Design Principles
* Program to an interface, not an implementation (e.g. Pizza -> CheesePizza)
* Depend on abstractions. Do not depend upon concrete classes (Dependency Inversion)