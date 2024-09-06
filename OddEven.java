
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="arulmurugan";
		int len=name.length();
		System.out.println("Character at odd position");
		for(int i=0;i<len;i++) {
			System.out.print(name.charAt(i));
			i++;
		}
		System.out.println();
		System.out.println("Character at even position");
		for(int i=1;i<len;i++) {
			System.out.print(name.charAt(i));
			i++;
		}

	}

}
