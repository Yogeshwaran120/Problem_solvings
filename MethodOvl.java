import java.util.Scanner;

class Student{
	void getdetails()
{
	String name;
	int rollno;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	name=sc.next();
	System.out.println("Enter your rollno");
	rollno=sc.nextInt();
	System.out.println(name+" "+rollno);
	
}
}
class Staff extends Student{
	void getdetails() {
		super.getdetails();
		String name,desi;
		int empid;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your designation");
		desi=sc.next();
		System.out.println("Enter your empid");
		empid=sc.nextInt();
		System.out.println(name+" "+desi+" "+empid);
	}
}
class Admin extends Staff{
	void getdetails() {
		super.getdetails();
		String name;
		int phno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your phoneno");
		phno=sc.nextInt();
		System.out.println(name+" "+phno);
		
		
	}
}
public class MethodOvl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a1=new Admin();
		a1.getdetails();
		
	}

}
