Population Census JSON

Objective:
To create a JSON for Population census with objects and arrays

Scenario:
ABC Census Company is maintaining database on the survey taken.

Application sends the details of schemes in the form of JSON
Help to create a JSON with the information provided.

Name            Datatype of value
Country         String
State           String
YearOfSurvey    Number
TotalPopulation String
AgeGroup        Object

AgeGroup- Object : 
Name            Datatype of value
0-14            Array
15-24           Array
25-44           Array
45-64           Array
Above65         Array

Array : 
Name            Datatype of value
male            Number
female          Number

You can assume any data for the mentioned JSON structure, provided it is matching the specified datatype
