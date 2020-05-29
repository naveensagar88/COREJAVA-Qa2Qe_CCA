/*Jeffy, who is going to complete the higher education in this year needs to create a simple application which accept the name of a person and welcome them with a message along with their name. She wants to read the data using the class "Scanner". Implement this scenario using Java.

Sample Input 1: 

Enter the name:

Johson

Sample Output 1:

Welcome Johnson

 

Sample Input 2: 

Enter the name:
Stain Polson

Sample Output 2:

Welcome Stain Polson
*/



package introductiontoJavaBasicsDatatypesWrappersClasses;

import java.util.Scanner;

public class Createapplicationformwelcom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;

		int age;

		String Gender;

		String City;


		System.out.println("Enter your name:");
		Scanner in=new Scanner(System.in);
		name=in.nextLine();
		//System.out.println("Welcome,"+name);




		System.out.println("Enter age:");
		age=Integer.parseInt(in.nextLine()); 
		//System.out.println("Age:"+age);


		System.out.println("Enter gender:");
		Gender=in.nextLine();
		//System.out.println("Your Gender"+Gender);

		System.out.println("Hailing from:");
		City=in.nextLine();
		//System.out.println("City:"+City);


		System.out.println("Welcome, "+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+Gender);
		System.out.println("City:"+City);
		}

		}