# COMP 1451 Lab 8

This is an assignment from COMP 1451 - Software Development part-time course at BCIT that asked us to demonstrate the usage of an abstract class using Java.


##Important Objective

The objective of this lab was to simulate a company that contains all the different kinds of employees' information. The abstract class is the profile that has the generic data that works across all kinds of employees and it has an abstract method that is enforced on all the classes that extends from this abstract class. The method signature is defined in the child classes and in this case, it calculates the monthly earnings for hourly, salaried and commissioned employees.

All the employees are added to a Company ArrayList and as seen in the data package, all the employees have a different method definition as their monthly earnings are calculated differently. The abstract method from the Profile class is overridden by the child classes and the respective classes calculate the earnings as directed.
