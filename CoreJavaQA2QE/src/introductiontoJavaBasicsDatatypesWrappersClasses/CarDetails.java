/*Write a program to get details about a car and display it. 

Hint: Store the price in double. When displaying, display the price correct to 2 decimal places.

Sample Input 1:

Enter the car name:

amaze

Enter the car no:

3666

Enter the price:

870000.76



Sample Output 1:

Car name:amaze

Car no:3666

Price:870000.76 rs only

Sample Input 2:

Enter the car name:

Swift

Enter the car no:

7866

Enter the price:

550000

Sample Output 2:

Car name:Swift

Car no:7866

Price:550000.00 rs only*/

package introductiontoJavaBasicsDatatypesWrappersClasses;

import java.util.*;

public class CarDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int carno;

		double price;

		String carname;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the car name:");

		carname = in.nextLine();
		

		System.out.println("Enter the car no:");
		carno = in.nextInt();
		
		
		
		System.out.println("Enter the price:");

		price = in.nextDouble();
        
		 
		 System.out.println("Car name:" + carname);

System.out.println("Car no:" + carno); 
System.out.println("Price:" + String.format("%.2f", price) + " rs only");
		 
		
	}

}
