

Gang of Four design patterns

[![Actions Status](https://github.com/denims/design-patterns/workflows/Run%20all%20the%20test%20cases/badge.svg)](https://github.com/denims/design-patterns/actions)

Some notes related to pattern given below

# Creational

## Builder

Fluent builder - returning same instance from all the methods so that the methods can be chained.

Use of recursive generics for inheriting a builder.

Builder facade - Multiple builders for complex objects. Combines builder and facade pattern.

## Factory

Static factory method → Not a pattern. Create an object in a wholesome manner without using constructor. Create some static methods rather than creating the object using constructor. Used in case where same number of params and same type are required but the values will need different things.

Factory idiom → Create a separate factory class that accepts a type parameter, switches through it and creates the required object.

Factory method → Factory pattern. An abstract factory class with multiple functionalities. The method creation logic will be abstract and will be implemented by the implementation of the factory.

Abstract factory → Pattern. An interface that has methods to return a group of similar objects.