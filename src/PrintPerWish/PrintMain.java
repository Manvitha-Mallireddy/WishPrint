package PrintPerWish;

import java.util.Scanner;

public class PrintMain {

	public static void main(String[] args) {
		PrintFunc1 pf1=new PrintFunc1();
		PrintFunc2 pf2=new PrintFunc2();
        Scanner sc=new Scanner(System.in);
        System.out.println("What do you wish to print if want Good Morning type 1 or type 2 for Good Evening");
        int n=sc.nextInt();
        if(n==1)
        {
        	pf1.display();
        }
        else
        {
        	pf2.display();
        }
	}

}
