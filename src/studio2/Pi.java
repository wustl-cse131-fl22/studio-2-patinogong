package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = 0;
		
		System.out.print("Please input the times: ");
		int times = in.nextInt();
		for (int i = 0; i <= times; i++ )
		{
			double y = 2*Math.random()-1;
			double x = 2*Math.random()-1;
		
			if ((x*x)+(y*y) <= 1) 
			{
				m = m+1;
			}
			
		}
		System.out.println(m);
		System.out.println(4.0*(m/(double)times));
	}

}
