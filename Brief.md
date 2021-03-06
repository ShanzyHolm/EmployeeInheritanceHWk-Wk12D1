Inheritance Lab.

Your task is to model and create a system to store information for employees of a large development company. You should use TDD, inheritance, packages and abstract classes for this.


x -- Create an abstract Employee parent class in a package called staff.
x -- Employee will have a name, NI number and salary.
x -- Create Getters for all properties.
x -- Add a method named raiseSalary with takes in a parameter of type double to increment the salary.
x -- Add a method called payBonus which returns 1% of the employees salary.
Don't worry about testing just now until you create the subclasses.


x -- Create a subclass of Employee called Manager in a package called management.
x -- Create a class for Manager.
x -- Add a property to store the department name in a property called deptName.
x -- Create a constructor that includes all the parameters needed for Employee and deptName.
x -- Add a getter method for deptName.
x -- Test all methods including raiseSalary and payBonus


x -- Create subclasses of Employee: Developer and DatabaseAdmin in a package called techStaff.
x -- Create 2 new classes for Developer and DatabaseAdmin.
x -- These should take in the same parameters as Employee and pass them to Employee constructor.
x -- Again test all methods for both classes.


x -- Create a subclass of Manager called Director in the management package.
x -- Add a private property to store a double value budget.
x -- Create a constructor for Director that includes the parameters needed for Manager and the budget parameter.
x -- Create a getter method for this property.
x -- Test all methods.



Extensions

Prevent unwanted values
Prevent a negative value for the raiseSalary method.
Allow the user to change the Employees name and prevent a null value from being entered.
x -- Override the payBonus in director to return 2% of their salary.