ES6 - Collection Set - E-sale

Objective:
To add scripting to the existing web page and work with JavaScript Es-6 features like class, object , getter methods and collection.

Problem Description:
As part of a simple billing application, you are provided with an html page to obtain inputs for item number, item name, price & quantity. Using the ES-6 collections, add every item object into a Set and iterate through it to find the total cost to be paid. On adding each item object into Set, it must also get added to the table as a new record. Refer to the screenshot. 

Following are the files that contain code snippets

index.html

HTML for webpage (complete implementation is given for you). You only have to run this. No change needs to be done in this file.

script.js

Add your code to this file for the functions given.


Procedure to complete the exercise


Class

Properties

Methods

Item

itemNumber
itemName
price
quantity	
Include constructor with properties and getter methods for Item properties



In script.js, provide the implementation for the functions as per the requirements mentioned below 
Class Item 

Template for Item class is provided as part of the code skeleton. Add properties, constructor and getter methods.

addItem(itemNumber, itemName, price, quantity)

A set defined as itemList is provided as part of code skeleton.
addItem method should create object for Item class by using constructor  and add the Item object into the set.

display()

On Clicking submit button, this function is invoked.
1. Get the item number, item name, price and quantity values.
2. Invoke addItem method by passing the itemNumber, itemName, price and quantity.
3. Iterate the itemList set and calculate the total cost of the items added into itemList, display the cost in div tag with id as "result2".
4. Iterate the itemList and display the item details in div tag with id result1. 
(Refer to screenshot)

Example:
consider item 1 : itemNumber=2233, itemName=mobile, price=6000, quantity=1
consider item 2 : itemNumber=2234, itemName=headset, price=1500, quantity=2
Cost Per item = price* quantity;
item1 cost : 6000*1 => 6000
item2 cost : 1500*2 => 3000
total cost = 6000+3000 => 9000


Screenshot 1:

Screenshot 2:
