//Send me your mails iraindolf@yahoo.com and www.oasiswebsoft.com

import java.util.Scanner; //This package allows the user to input

public class determinant

{

public static void main ( String [] args )

{

//Creating a new method for the Scanner Input called dataInput
Scanner dataInput = new Scanner(System.in);

//declaring variables , using an integer type

int var1;
int var2;
int var3;
int var4;
int result;

//Output statements 
System.out.print("Enter the first number on row one,column one: ");
var1 = dataInput.nextInt();
System.out.print("Enter the second number on row one,column two: ");
var2 = dataInput.nextInt();
System.out.println(" ");
System.out.print("Enter the first number on row two,column one: ");
var3 = dataInput.nextInt();
System.out.print("Enter the second number on row two,column two: ");
var4 = dataInput.nextInt();
System.out.println(" ");

result = determinant(var1,var2,var3,var4);

System.out.println ("The determinant of this 2 by 2 matrix is " + result + " ." );


}

//Simple method

public static int determinant ( int a,int b,int c, int d )

{

int e;

//simple algorithms simply work and I love it

 e = a * d - b * c ; //algorithm for calculating the determinant of a two by two sized matrix.

return e;

}

}
