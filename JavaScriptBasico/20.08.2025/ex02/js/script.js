a = parseFloat(prompt("Input the first number:"));
b = parseFloat(prompt("Input the second number:"));
c = parseFloat(prompt("Input the third number:"));
d = parseFloat(prompt("Input the fourth number:"));
e = parseFloat(prompt("Input the fifth number:"));

operations = prompt("Choose an operation: 1-Addition 2-Multiplication 3-Subtraction 4-Division")
addition_op = a+b+c+d+e
multiplication_op = a*b*c*d*e
subtraction_op = a-b-c-d-e
division_op = a/b/c/d/e


if (operations == 1)
    alert(addition_op);
else if(operations == 2)
    alert(multiplication_op);
else if(operations == 3)
    alert(subtraction_op);
else if(operations == 4)
    alert(division_op);