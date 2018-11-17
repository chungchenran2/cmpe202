# Java Lambda Design Pattern Lab

The Java design pattern I had chosen for Lab 9 is the decorator pattern. The respective example for this pattern is wrapping a String with two decorations. In the original version there were two concrete decorator classes called ConcreteDecoratorA and ConcreteDecoratorB, each adding their own decoration. In Tester the ConcreteComponent object has to be wrapped by ConcreteDecoratorA then ConcreteDecoratorB. Then we call operation() for the outer Decorator object and it will return the decorated String.

For the Lambda implementation I created a single concrete decorator class called ConcreteDecorator. In this class I defined an interface called BehaviorGenerator with the abstract String method addedBehavior. In the constructor of the ConcreteDecorator I assigned two lambda expressions to two BehaviorGenerator instances. In the operation() method I get the String "Hello World!" then call each BehaviorGenerator instance to wrap their respective Strings to "Hello World!". So there is only one ConcreteDecorator needs to be called to get two decorations.

