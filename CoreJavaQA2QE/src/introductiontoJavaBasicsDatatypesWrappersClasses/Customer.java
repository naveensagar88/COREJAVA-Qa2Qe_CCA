/*Help Mr.Ben who is a programmer, in developing a registration form on console. 

Customers will not just input data, but also view the details once he/she finishes the registration. 



Sample Input 1:

Enter your name:Jany

Enter age:25

Enter gender:Female

Hailing from:Mexico

 

Sample Output 1:

Welcome, Jany

Age:25

Gender:Female

City:Mexico*/


package introductiontoJavaBasicsDatatypesWrappersClasses;



import java.util.*;

class Customer

{

public static void main(String arr[])

{

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