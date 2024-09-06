import java.util.ArrayList;

public class LeftRo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		ArrayList<Integer> arrli=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			arrli.add(arr[i]);	
		}
		for(int k=0;k<3;k++) {
			arrli.add(arrli.remove(0));
			
		}
		System.out.println(arrli);
		

	}

}
