// Multiline Variable for Salary and Annual Salary
int salary = 100000, annualSalary = 1000000;

/* 
 * Increment Salary by 10%. Note use of arithmatic operators add (+), 
 * multiplication Operator (*) and Division Operator (/)
 */
int increment = salary * 10/100; 
salary = salary + increment;

// Displaying Annual Salary Text and Vriable
System.out.println("Annual Salary " + annualSalary);

// Displaying Increment and new Salary using multi text and variable
System.out.println("Increment = " + increment + " New Salary " + salary);

// Displaying Old Salary, Increment and New Salary In Multi Line
System.out.println("Old Salary = " + (salary-increment) + "\nIncrement = " + increment + "\nNew Salary " + salary);
