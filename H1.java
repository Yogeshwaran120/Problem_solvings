import java.util.*;
public  class H1 {
	private static final HashMap<Integer,String> map =new HashMap<>();
	  static{ map.put(1,"I");
      map.put(5,"V");
      map.put(9,"IX");
      map.put(10,"X");
      map.put(40,"XL");
      map.put(50,"L");
      map.put(90,"XC");
      map.put(100,"C");
      map.put(400,"CD");
      map.put(500,"D");
      map.put(900,"CM");
      map.put(1000,"M");
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.print(Rom(n));
	}
public static String Rom(int n) {
	 StringBuilder r=new StringBuilder();
	 for(Integer i:map.keySet()) {
		 while(n>=i) {
			r.append(map.get(i));
			n-=i;
		 }
	 }
	 return r.toString();
 }
}
