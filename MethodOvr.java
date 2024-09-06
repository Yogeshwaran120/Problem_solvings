class A{
	void display() {
		System.out.println("A is called");
	}
}
class B extends A{
	void display() {
		System.out.println("B is called");
		super.display();
	}
}
public class MethodOvr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display();

	}

}
