import java.util.Objects;

public class exp1 {
  String name;
	exp1(String name){
		this.name=name;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		exp1 other = (exp1) obj;
		return Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		String s="java";
		String s1="java";
		String a=new String("java");
		String b=new String("java");
		//s=s.concat("script");
		System.out.println(s==s1);
		System.out.println(a==b);
		//obj creation
		exp1 e=new exp1("java");
		exp1 e1=new exp1("java");
		System.out.println(e.equals(e1));

	}

}
