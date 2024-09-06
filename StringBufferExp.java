
public class StringBufferExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Govi@n0$da689raj8a";
		StringBuilder digit=new StringBuilder();
		StringBuilder chara=new StringBuilder();
		StringBuilder letter=new StringBuilder();
		for(int i=0;i<name.length();i++) {
			if(Character.isDigit(name.charAt(i))) {
				digit.append(name.charAt(i));
			}else if(Character.isLetter(name.charAt(i))){
				letter.append(name.charAt(i));
			}
			else {
				chara.append(name.charAt(i));
			}
		}
		System.out.println(digit);
		System.out.println(chara);
		System.out.println(letter);


	}

}
