import java.util.Scanner;
class Grade_calculate{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your marks :");
	System.out.println("Enter in Hindi :");
	int hindi=sc.nextInt();
	System.out.println("Enter in English :");
	int english=sc.nextInt();
	System.out.println("Enter in Math :");
	int math=sc.nextInt();
	System.out.println("Enter in Physics :");
	int physics=sc.nextInt();
	System.out.println("Enter in Chemistry :");
	int chemistry=sc.nextInt();
	int total_num=hindi+english+math+physics+chemistry;
	System.out.println("Total number is :"+total_num);
	float percentage=(total_num*100)/500;
	System.out.println("Your Percentage is :"+percentage);
	if(percentage>=80)
		System.out.println("Grade is A .");
	else if(percentage>=60)
		System.out.println("Grade is B .");
	else if(percentage>=33)
		System.out.println("Grade is C .");
	else {
		System.out.println("Sorry , Please try next time .");
	}
}
}