/*Tom went to a movie with his friends in a multiplex theatre and during break time he bought pizzas, puffs, and cool drinks. Consider   the following prices : 

Rs.100/pizza

Rs.20/puffs

Rs.10/cooldrink

Generate a bill for What Tom has bought.



Sample Input 1:

Enter the no of pizzas bought

10

Enter the no of puffs bought

12

Enter the no of cool drinks bought

5



Sample Output 1:

Bill Details

No of pizzas

10

No of puffs

12

No of cool drinks

5

Total price

1290

ENJOY THE SHOW!!!*/

package introductiontoJavaBasicsDatatypesWrappersClasses;

import java.util.Scanner;

public class Billgeneration {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int perpizza = 100;
		int perpuff = 20;
		int percooldrink = 10;


System.out.println("Enter the no of pizzas bought");
Scanner in=new Scanner(System.in);
int pizzas=in.nextInt();
int pizzastotal=pizzas*perpizza;




System.out.println("Enter the no of puffs bought");
int puffs=in.nextInt();
int puffstotal=puffs*perpuff;



System.out.println("Enter the no of cool drinks bought");
int cooldrinks=in.nextInt();
int cooldrinkstotal=cooldrinks*percooldrink;



int Sum = pizzastotal+puffstotal+cooldrinkstotal;



System.out.println("Bill Details");
System.out.println("No of pizzas\n"+pizzas);
System.out.println("No of puffs\n"+puffs);
System.out.println("No of cool drinks\n"+cooldrinks);
System.out.println("Total price\n" + Sum);
System.out.println("ENJOY THE SHOW!!!");

}

}