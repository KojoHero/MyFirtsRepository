package org.codescopelessons;
import java.util.Scanner;
public class array_pratice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		//Take 20 integer inputs from user and print the following:
			//number of positive numbers
			//number of negative numbers
			//number of odd numbers
			//number of even numbers
			//number os 0.
		int posNums=0;
		int negNums=0;
		int oddNums=0;
		int evenNums=0;
		int zeros=0;
		int [] a = new int [20];
		System.out.println("enter your numbers");
		
		for (int i=0; i<20;i++) {
			a[i]=s.nextInt();
			
			if (a[i]>0)
				posNums++;
			else if (a[i]<0)
				negNums++;
			else if (a[i]==0)
				zeros++;
			if (a[i]%2==0)
				evenNums++;
			else if (!(a[i]%2==0))
				oddNums++;
		}
		System.out.println("the number of positive numbers are "+posNums);
		System.out.println("the number of negative numbers are "+negNums);
		System.out.println("the number of odd numbers are "+oddNums);
		System.out.println("the number of even numbers are "+evenNums);
		System.out.println("the number of Zeros are "+zeros);
	}

}
