# The Factory Pattern

## 1. Description
__[a]__ comes in two flavors: Factory Method & Abstract Factory
__[b]__ two types of abstraction: Product (Pizza), Creator (PizzaStore)
__[c]__ it encapsulates the creation of objects

## 2. Factory Method
* delegates creation of an Product (e.g. Pizza) to its subclasses
* uses an abstract method __create()__ to do this
* the PizzaStore example uses the Dependency Inversion principle to decouple
  from creation of pizzas and from the actual pizza types:
    - Pizza abstraction = decouples from concrete pizza type
    - Factory Pattern = decouple from the creation of pizza
      
## 3. Abstract Factory
* used when we want to create a family of related products (e.g. Ingredients)
* each product is created via a __create()__ method
* we have an abstract product family factory and each concrete factory
  implements the products specific to that concrete factory (e.g. NY, Chicago ingredients)

## 4. Design Principles
* Program to an interface, not an implementation (e.g. Pizza -> CheesePizza)
* Depend on abstractions. Do not depend upon concrete classes (Dependency Inversion)

## 5. Class Diagram
![Factory](https://github.com/work-filip-ghimpeteanu/DesignPatterns/raw/master/factory/src/main/resources/Factory.png)
