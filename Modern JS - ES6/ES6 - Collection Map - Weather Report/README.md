ES6 - Collection Map - Weather Report

Objective:
To add scripting to the existing web page and work with JavaScript Es-6 feature - the ES-6 collections concept.

Problem Description:
As part of weather forecasting application, you are provided with an html page to obtain input for a city and its temperature. Using the ES-6 collections, add records into the Map and search for a record based on key. 

Following are the files that contain code snippets

index.html

HTML for webpage (complete implementation is given for you). You only have to run this. No change needs to be done in this file.

script.js

Add your code to this file for the functions given.


Procedure to complete the exercise

In script.js, provide the implementation for the functions as per the requirements mentioned below 
addRecords(city, temperature)

A Map defined as weatherMap is provided as part of code skeleton.
Here, addRecords method should add the city and its corresponding temperate  into weatherMap.
In weatherMap,  city should be considered the key & temperature, the value. 

weatherReport( )

On Clicking submit button, this function is invoked.
1. Get the city and temperature values.
2. Invoke addRecords method and pass the city and temperature as parameters. 
3. Display the message "Weather Report added successfully." in the div tag with id result1. 
(Refer to screenshot)

searchReport( )

On Clicking Get Temperature submit button, this function is invoked.
Get the search input  value. 
Based on this input, get the corresponding temperature from the map and display it in the div tag with id "result2". 
Output should be displayed as "Temperature of <<city>> : <<Temperature>> 
(Refer to screenshot)


Screenshots

Screenshot 3:
