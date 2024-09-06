class C{
	int rollno;

public C(int rollno) {
		super();
		this.rollno = rollno;
		System.out.println(rollno);
	}
	
}
class Child extends C{
   String name;

public Child(int rollno, String name) {
	super(rollno);
	this.name = name;
	System.out.println(rollno);
	System.out.println(name);
	
}
   
}
public class WithAtri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child s1=new Child(101,"aaaa");
		

	}

}
