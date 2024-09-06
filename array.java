package twoDarray;

public class array {

	public static void main(String[] args) {
		int arr[][]= {{10,20,70},{30,40,50},{50,67,45}};//100 120 162
       // System.out.println(arr.length);
        //System.out.println(arr[0][2]);
		int sum=0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
		        max=Math.max(max, sum);
			}
			 sum=0;
		}
		System.out.println(max);
	}

}
