# COMP 1451 Lab 8

This is an assignment from COMP 1451 - Software Development part-time course at BCIT that asked us to demonstrate the usage of an abstract class using Java.


##Important Objective

The objective of this lab was to simulate a company that contains all the different kinds of employees' information. The abstract class is the Employee class that has the generic data that works across all kinds of employees and it has an abstract method that is enforced on all the child classes. The method signature is defined in the child classes and in this case, it calculates the monthly earnings for hourly, salaried and commissioned employees.

All the employees are added to a Company ArrayList and as seen in the data package, all the employees have a different method definition as their monthly earnings are calculated differently. The abstract method from the Profile class is overridden by the child classes and the respective classes calculate the earnings as directed.

##Overall Impression
This lab assignment allows us to understand how an abstract class is different from a regular parent class from an inheritance hierarchy. If a child class is also abstract, the method passed from its parent class must be inherited by another child class until it has been implemented. This is to ensure certain behavior is enforced when any classes want to extend from an abstract parent class. I feel that it is very useful when writing a hierarhcy, the abstract method can determine whether a child class should extend from the abstract class. 
