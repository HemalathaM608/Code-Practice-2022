ES6 - Car Price - Default Parameter

Problem Description:
Write a simple JavaScript program to calculate the price of a car, inclusive of tax and to calculate the resell price of a car based on the car's age. 
The function taxRate() is given already in code template. This function will apply 15% tax on car's price and return the same. 

Implement the calculateCarCost() function with car's 'price' and 'tax' as parameters.
It returns the total price (totalPrice = price + tax), as shown in the sample output. 
Use the function taxRate() in the parameter list to apply value to its second parameter - the default parameter. 
The second parameter tax will make use of the first parameter price (price is sent to taxRate() as parameter).

Implement the calculateResellPrice() function with 'price' and 'carAge' as parameters.
Calculate an estimate for the price of a used vehicle in the dealership, based on the price and carAge and return the same, as shown in the sample output. 
Assign carAge parameter - the default parameter, with a default value of '1'. 

if carAge is '1' then return 80% of the original price as the estimate. 
if carAge is '5' then return 70% of the original price as the estimate.  
if carAge is '10' then return 60% of the original price as the estimate. 
if carAge is '15' then return 50% of the original price as the estimate. 

Note: You may verify the correctness of your function by invoking it from within console.log as shown in sample input and output

Sample Input and Output:
Sample Input1:
console.log(calculateCarCost(100000))
Sample Output1:
115000

Sample Input2:
console.log(calculateCarCost(100000, 10000))
Sample Output2:
110000

Sample Input3:
console.log(calculateResellPrice(1000))
Sample Output3:
800

Sample Input4:
console.log(calculateResellPrice(1000,5))
Sample Output4:
700
