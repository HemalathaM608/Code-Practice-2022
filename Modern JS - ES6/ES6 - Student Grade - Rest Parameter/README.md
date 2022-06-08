ES6 - Student Grade - Rest Parameter

Problem Description:
Write a simple JavaScript program to calculate the average mark and to calculate the grade of a student. 
Pass the rest parameter prefixed with three dots (...) as an argument to implement the function calculateAverageMark() - calculateAverageMark(...args)
Calculate the average mark of the student and return it. 
Then, this average is used to determine the corresponding grade. 
Return the output with 2 decimal places.

Implement the  calculateStudentGrade() function to calculate the student grade based on the average mark.
The average mark returned by the function calculateAverageMark() is passed as argument to this function.
The grades are computed as follows:

Range         Grade
<50             F
<60             D
<70             C
<80             B
<90             A
<100            O

Note: You may verify the correctness of your function by invoking it from within console.log as shown in sample input and output

Sample Input and Output:
Sample Input1:
console.log(calculateAverageMark(80, 77, 88, 95, 68));
Sample Output1:
81.60

Sample Input2:
var averageMarks= calculateAverageMark(80, 77, 88, 95, 68);
console.log(calculateStudentGrade(averageMarks));
Sample Output2:
A
