class A{
	void display() {
		System.out.println("welcome to VSB");
	}
}
class Sub extends A {
	void display1() {
		System.out.println("Balsamy");
	}
}
public class SingleInherExp extends Sub{
	void display2() {
		System.out.println("vishnu");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInherExp s1=new SingleInherExp();
		s1.display();
		s1.display1();
		s1.display2();
		
		

	}
}


