
public class exp2 {

	public static void main(String[] args) {
		String s="hello hi hello hi hello hi";
		int n=s.length();
		//System.out.println(n);
		//System.out.println(s.charAt(3));
		int count=0;
		/*for(int i=0;i<n;i++) {
			  if(s.charAt(i)=='l') {
				  count++;
			  }
		}*/
		//System.out.println(count);
		//System.out.println(s.indexOf("ho",10));
		//System.out.println(s.lastIndexOf("hi"));
		String[] arr=s.split(" ");
		String s1="hello";
		for(int i=0;i<arr.length;i++) {
			if(s1.equals(arr[i])) {
				count++;
			}
		}
		System.out.println(count);
}
}
