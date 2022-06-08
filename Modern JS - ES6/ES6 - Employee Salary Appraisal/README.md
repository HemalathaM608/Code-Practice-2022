ES6 - Employee Salary Appraisal

Objective:
To add scripting to the existing web page and work with JavaScript Es-6 features. The ES-6 concepts like class, object, getter and setter methods.

Problem Description:
Genteel Software Solution is one of the famous software companies. They plan to increase the salary of their employees based on their experience.
You being their software consultant have been approached to develop web application to implement the functionality to manage the salary of the employees.


Following are the files that contain code snippets

index.html

HTML for webpage (complete implementation is given for you). You only have to run this. No change needs to be done in this file.

script.js

Add your code to this file for the functions given.


Procedure to complete the exercise

Class

Properties

Methods

Employee

employeeId
employeeName
salary
experience

Include the getters and setters method for all the attributes.

Include a parameterized constructor of three arguments in the following order – employeeId, employeeName, salary,experience to initialize the values for the Employee properties.


In script.js, provide the implementation for the functions as per the requirements mentioned below

Class Employee

Template for Employee class is provided as part of the code skeleton. Add properties, constructor, setter and getter methods.

findIncrementPercentage( experience)

This method is used to calculate and set the incremented percentage of the salary of the employees.
If the range of experience is between 1 and 5 (both inclusive) then set the incrementPercentage as 15. 
If the range of experience is between 6 and 10 (both inclusive) then set the incrementPercentage as 30. 
If the range of experience is between 11 and 15 (both inclusive) then set the incrementPercentage as 45.

calculateIncrementSalary( incrementPercentage)

This method is used to calculate the incremented salary of the employee and return the same. Formula to calculate the incremented salary: 
incrementedSalary=salary+((salary*incrementPercentage)/100)

display()

On Clicking submit button, this function is invoked.

1. Get the employee id, employee name, salary and experience values.
2. Create an object for the Employee class
3. Invoke the findIncrementPercentage method to calculate the incremented percentage of the salary and return it.
4. Then invoke the calculateIncrementSalary method to calculate the incremented salary of the employee and return the same in the Employee class. 
5. Display the incremented salary in div tag with id as "result" as shown in the screenshot.
(Refer to screenshot)

Sample Screenshot 1:



Sample Screenshot 2:

