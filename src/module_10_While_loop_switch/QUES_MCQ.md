5. Check if a Number is Strong Easy

Description A number is called a strong number if the sum of the factorial of its digits is equal to the number itself.
Write a program that accepts a number and checks if it is a strong number. . If n is a strong number, print "Yes". .
Otherwise, print "No".

Input Format . The input consists of a single positive integer n.

Output Format . Print "Yes" if n is a strong number otherwise "No". . For Javascript : Return the result instead of
printing.

Examples 1:
Sample Input:

145

Expected Output:
Expected Output :

Yes

Examples 2:
Sample Input:

123

Expected Output :

No

6. Check if a Number is Automorphic Easy

Description A number is called an Automorphic number if its square ends with the number itself. For example: . 25 is
Automorphic because:
25^2=625 . The last two digits are 25 (which matches the number itself). Write a program that accepts a positive integer
n and checks whether it is an Automorphic number. . If n is an Automorphic number, print "Yes". . Otherwise, print "No".

Input Format . The input consists of a single positive integer n.

Output Format . Print "Yes" if n is an Automorphic number otherwise print "No". . For Javascript : Return the result
instead of printing.

Examples 1:
Sample Input:

5

7.       Single Digit Sumof Digits until the number becomes single digit.
         Example 1: 
            Input: 6758 
                Output: 8 
                Explanation:
              6+7+5+8= 26
                  2+6=8

    10. Check if a Number is a Harshad (Niven) Number

        Medium DIFFICULTY

Description Write a program to check whether a given positive integer is a Harshad number or not. A number is called a
Harshad number if it is divisible by the sum of its digits. For example, 18 is a Harshad number because the sum of its
digits (1+8 = 9) divides 18 exactly (18 % 9 == 0).

Examples 1:
Sample Input:

18

Expected Output:

Yes

Examples 2:
Sample Input:

19

Expected Output:

No


12.   Abundant Number Checker
      Medium

Description
An Abundant Number is a number for which the sum of its proper divisors (divisors excluding the number itself) is greater than
the number. Your task is to write a program to determine if a given number is an Abundant Numbers. Return "Yes" or "No".

Examples 1:
Sample Input:

12

Expected Output :

Yes

Examples 2:
Sample Input:

Sample Input:

10

Expected Output :

No

13.         Check if a Number is a Neon Number
Easy

Description
Write a Java program that checks if a given number is a Neon number. A Neon number is a number where the sum of the digits
of the square of the number is equal to the number itself.

Input Format
The input contains a single integer N, representing the number to be checked. N

Output Format
Print Yes if N is a Neon Number; otherwise, print No. Yes

Examples 1:
Sample Input:

9

Expected Output :
Yes

Examples 2:
Sample Input:

10

Expected Output :

No


14.  Validate ISBN Number  ########## IMP
Hard

Description
An ISBN-10 (International Standard Book Number) consists of 10 digits. Your task is to write a function to determine whether a
given ISBN-10 number is valid or not. Rules: . Multiply each digit of the ISBN-10 by its position value (1 for the first digit, 2 for the
second digit, and so on, up to 10 for the last digit). Sum these products. . If the total sum is divisible by 11, the ISBN-10 is
considered valid. Otherwise, it is invalid.

Examples 1:
Sample Input:

306406152

Expected Output :

false

Examples 2:
Sample Input:

1234567890

Expected Output:

false