# The Observer Pattern

## 1. Description
  
* it is used to send notifications when something happen (e.g. the state of one object changed)
* two types of abstractions: Subject (WeatherData), Observer (CurrentConditionsDisplay)
* the Subject holds a list with all of its Observers. Each Observer has a reference to the concrete Subject.
  The Subject doesn't know the concrete Observer implementations.
* it is a one to many relationship between Subject and Observers. When Subject's state changes, it
  notifies the Observers.



## 2. Design Principles
* Strive for loosely coupled designs between objects that interact 
  - the subject knows nothing about the concrete observer
  - observers can be added and removed on the fly (because of the list)
  - the subject doesn't need to be changed when new observers are added (because of the list)
  - subject & observer can be reused independently of each other
 
## 3. Class Diagram
![Observer](https://github.com/work-filip-ghimpeteanu/DesignPatterns/raw/master/observer/src/main/resources/Observer.png)
