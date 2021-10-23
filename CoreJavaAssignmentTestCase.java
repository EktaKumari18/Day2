import java.util.Scanner;
public class CoreJavaAssignmentTestCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total bill:");
		int bill=sc.nextInt();
		int totalBill=0;
		int discount=0;
		if(bill==100)
		{
			System.out.println("You do shopping only for 100rs so you will get 5% discount");
			discount=(bill*5)/100;
			totalBill=bill-discount;
			System.out.println("You need to pay="+totalBill);
		}
		else
		{
			System.out.println("Choose Your Option");
			System.out.println("1.You are an employee of the store.");
			System.out.println("2.You are an affilate of the store.");
			System.out.println("3.You have been customer of a store for over 2 years.");
			System.out.println("4.You have Grocery item only.");

			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Congratulation you will get 30% of discount");
				discount=(bill*30)/100;
				totalBill=bill-discount;
				System.out.println("You need to pay="+totalBill);
				
			}
			else if(ch==2)
			{
				System.out.println("Congratulation you will get 10% of discount");
				discount=(bill*10)/100;
				totalBill=bill-discount;
				System.out.println("You need to pay="+totalBill);
			}
			else if(ch==3)
			{
				System.out.println("Congratulation you will get 5% of discount");
				discount=(bill*5)/100;
				totalBill=bill-discount;
				System.out.println("You need to pay="+totalBill);
			}
			else if(ch==4)
			{
				System.out.println("Sorry there is no discount on grocery item.");
				System.out.println("You need to pay="+bill);
			}
			else
			{
				System.out.println("Invalid Option");
			}

		}
	}

}

