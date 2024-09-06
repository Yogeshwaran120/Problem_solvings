import java.util.Scanner;

public class ExcepExp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		try {
			age=sc.nextInt();
			validateAgeInfo(age);
		}catch(validateAge e) {
			System.out.println(e.getMessage());
		}

	}
	private static void validateAgeInfo(int age) throws validateAge{
		if(age<0) {
			
		}
		
	}
	

}
