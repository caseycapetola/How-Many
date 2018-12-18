import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @author Casey Capetola
 *
 */
public class HowMany 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter how many times you would like to roll the die: ");
		int rolls = Integer.parseInt(user.nextLine());
		int roll = 0;
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
		int fiveCount = 0;
		int sixCount = 0;
		
		for(int i=0; i < rolls; i++)
		{
			roll = rand.nextInt(6) + 1;
			System.out.printf("\nYou rolled a %d.", roll);
			System.out.print(" Press enter to roll again.");
			user.nextLine();
			
			if(roll == 1)
			{
				oneCount++;
			}
			else if(roll == 2)
			{
				twoCount++;
			}
			else if(roll == 3)
			{
				threeCount++;
			}
			else if(roll == 4)
			{
				fourCount++;
			}
			else if(roll == 5)
			{
				fiveCount++;
			}
			else
			{
				sixCount++;
			}
		}
		
		System.out.printf("\nYou rolled a \"1\" %d times.", oneCount);
		System.out.printf("\nYou rolled a \"2\" %d times.", twoCount);
		System.out.printf("\nYou rolled a \"3\" %d times.", threeCount);
		System.out.printf("\nYou rolled a \"4\" %d times.", fourCount);
		System.out.printf("\nYou rolled a \"5\" %d times.", fiveCount);
		System.out.printf("\nYou rolled a \"6\" %d times.", sixCount);

	}

}
