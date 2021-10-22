import java.util.Scanner;
public class PlayerMain 
{
	public static Player p1;
	public static PlayerBO pb1;
	public static void main(String[] args)
	{		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of the players:"); //Taking the Input
		int n= sc.nextInt();
		pb1= new PlayerBO();
		String[] playerlist = new String[n]; //To store the details of the Player
		for(int i=0;i<n;i++)
		{

			System.out.println("Enter player "+(i+1)  + " details:");
			System.out.println();
	
			System.out.println("Enter Player name:");
			sc.nextLine();
			String sp = sc.nextLine();
	
			System.out.println("Enter Country name:");
			String c = sc.next();
	
			System.out.println();
			System.out.println("Enter skill:");
			String sk = sc.next();
			
			String as = sp + " " + c + " " +sk+ " ";
			playerlist[i]=as;
			p1= new Player();
			p1.setName(sp);
			p1.setCountry(c);
			p1.setSkill(sk);
		}
		
		System.out.println("Menu:");
		System.out.println("1.View details"); 
		System.out.println("2.Filter players with skill");
		System.out.println("3.Exit");
		int choice = sc.nextInt();

		switch(choice) {
		  case 1:
		    pb1.viewDetails(playerlist);
		    break;
		  case 2:
		    System.out.println("Enter the Skill");
		    String b = sc.next();
		    pb1.printPlayerDetailsWithSkill(playerlist,b);
		    break;
		  case 3:
		    break;
		}


	}
}
