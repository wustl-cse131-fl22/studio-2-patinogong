package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//get the variables
		System.out.print("Please input the totalSimulations: ");
		int totalSimulations = in.nextInt();
		System.out.print("Please input the startAmount: ");
		double startAmount = in.nextDouble();
		System.out.print("Please input the winChance: ");
		double winChance = in.nextDouble();
		System.out.print("Please input the winLimit: ");
		double winLimit = in.nextDouble();
		double newMoney = startAmount; 
		for (int i = 0; i <= totalSimulations; i++)
		{
			while (startAmount > 0 && startAmount < winLimit)
			{ 
				if (Math.random() >=  winChance)
				{
					startAmount += 1;
				}
				else
				{
					startAmount -= 1;
				}
			}
			if (startAmount == winLimit)
			{
				System.out.println("success");
			}
			else
			{
				startAmount = newMoney;
				System.out.println("ruin");
			}
			
		}

	}

}
