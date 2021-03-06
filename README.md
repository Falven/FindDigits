# FindDigits

Given an integer, N
N
, traverse its digits (d
d
1,d
d
2,...,d
d
n) and determine how many digits evenly divide N
N
 (i.e.: count the number of times N
N
 divided by each digit d
d
i has a remainder of 0
0
). Print the number of evenly divisible digits.

Note: Each digit is considered to be unique, so each occurrence of the same evenly divisible digit should be counted (i.e.: for N=111
N
111
, the answer is 3
3
).

Input Format

The first line is an integer, T
T
, indicating the number of test cases. 
The T
T
 subsequent lines each contain an integer, N
N
.

Constraints 
1≤T≤15
1
T
15
 
0<N<109
0
N
10
9
Output Format

For every test case, count and print (on a new line) the number of digits in N
N
 that are able to evenly divide N
N
.

Sample Input

2
12
1012
Sample Output

2
3
Explanation

The number 12
12
 is broken into two digits, 1
1
 and 2
2
. When 12
12
 is divided by either of those digits, the calculation's remainder is 0
0
; thus, the number of evenly-divisible digits in 12
12
 is 2
2
.

The number 1012
1012
 is broken into four digits, 1
1
, 0
0
, 1
1
, and 2
2
. 1012
1012
 is evenly divisible by its digits 1
1
, 1
1
, and 2
2
, but it is not divisible by 0
0
 as division by zero is undefined; thus, our count of evenly divisible digits is 3
3
.
