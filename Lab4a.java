import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lab4a

{
 	public static void main (String[] args)
 	
 	{
 		Scanner keyboard = new Scanner(System.in);
 		System.out.println("What is your name?");
 		String name = keyboard.nextLine();
 		
 		boolean done = true;
 		int utils1 = 0;
 		int utils2 = 0;
 		int utils3 = 0;
 		
 		do
 		{
 			List<String> KekList = new ArrayList<String>();
 		
 			KekList.add("(1) - Buy people ice cream");
 			KekList.add("(2) - Steal ice cream from people");
 			KekList.add("(3) - Dream about people eating ice cream");
 			KekList.add("(4) - Die");
 		
 			for (int i = 0; i < KekList.size(); i++) 
 			{
 		
				System.out.println(KekList.get(i));
			
 			}
 		
 			System.out.println("What did you do? (Actions 1-4)");
 			int answer = keyboard.nextInt();
 			
 			switch (answer) 
 			{
 			case 1:
	    		System.out.println("How many people were affected?");
	    		int numpeople1 = keyboard.nextInt();
	    		utils1 = numpeople1 * 3;
	    		System.out.println("The total number of utils caused by this action is: " + utils1);
	    		break;
			case 2:
	    		System.out.println("How many people were affected?");
	    		int numpeople2 = keyboard.nextInt();
	    		utils2 = numpeople2 * -5;
	    		System.out.println("The total number of utils caused by this action is: " + utils2);
	    		break;
			case 3:
	   			System.out.println("How many people were affected?");
	    		int numpeople3 = keyboard.nextInt();
	    		utils3 = numpeople3 * 0;
	    		System.out.println("The total number of utils caused by this action is: " + utils3);
	    		break;
	   		case 4:
	   			System.out.println("You have died.");
	   			int totalutils = utils1 + utils2 + utils3;
	   			System.out.println("The total number of utils " + name + " has caused is: " + totalutils);
	   			
	   			if (totalutils == 0){
	   				System.out.println(name + "'s life was neutral.");
	   			}
	   			
	   			if (totalutils < 0){
	   				System.out.println(name + "'s life was morally bad. >:(");
	   			}
	   			
	   			if (totalutils > 0){
	   				System.out.println(name + "'s life was morally good. :^)");
	   			}
	   			
	   			done = false;
	   			break;
	   		}
 		
 		} while(done);
 		
 	}
 	
}