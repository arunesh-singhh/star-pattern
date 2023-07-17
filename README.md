# star-pattern

Triangle Star Pattern
Problem Description: You are given with an input number N, then you have to print the given
star pattern corresponding to that number N.

For example if N=4
Pattern output : 

             *
             **  
             ***  
             ****  
How to approach?
1. Take N as input from the user.  
2. Figure out the number of rows, (which is N here) and run a loop for that.  
3. Now, figure out how many columns are there in ith row and run a loop for that within this.  
4. Now, figure out “What to print?” in a particular (row, column). Here we have to print “*”.
   
Pseudo code for the given problem:
input=N
i=1
While i is less than or equal to N:
 j=1
 While j is less than or equal to i:
 print(“*”)
 Increment j by 1
 Increment i by 1
 Add a new line here

❏ Let us dry run the Code for N=4  
● i=1(<=4)  
➔ j=1(<=1), so print ”*”  
➔ j=2 (>1), move out of the inner loop with a new line  
● i=2(<=4)  
➔ j=1 (<=2), so print “*”  
➔ j=2 (<=2), so print “*”  
➔ j=3(>2), move out of the inner loop with a new line  
● i=3(<=4)   
➔ j=1(<=3), so print “*”  
➔ j=2(<=3), so print “*”  
➔ j=3(<=3), so print “*”  
➔ j=4(>3), move out of the inner loop with a new line  
● i=4(<=4)  
➔ j=1(<=4), so print “*”  
➔ j=2(<=4), so print “*”   
➔ j=3(<=4), so print “*”  
➔ j=4(<=4), so print “*”   
➔ j=5(>4), move out of the inner loop with a new line  
● i=5(>4), move out of the loop  
So , final output:  
                *  
                **  
                ***  
                ****  
