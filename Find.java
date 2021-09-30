package simply;

import java.util.ArrayList;

public class Find {
	// Find the number which appears only 1 time in the array.
	//Try using different methods to solve this problem.
	//Input: arr[] = { 20, 10, 30, 10, 30} 
	// Output: 20 
	// In the given array all element appear two times except 20 which appears once.
	public static void main(String args[]){
		
		System.out.println("To find number which appears only 1 time");
		int arr[]= {20, 10, 30, 10, 30};
		System.out.println("Method1");
		method1(arr);
		System.out.println("Method2");
		method2(arr);
		
	}
	public static void method1(int[] arr) {
		
		int flag=0;
		
		for(int i=0;i<arr.length;i++) {
			int j=0;
				
			for(j=0;j<arr.length;j++) {
				if(j!=i) {
					if(arr[j]!=arr[i]) {
						flag=1;
					}
					else {
						flag=0;
						break;
					}
					
				}
				
			}
			if(flag==1) {
				System.out.println(arr[i]);
			}
		}
		
	}
	
	public static void method2(int[] arr) {
		
		ArrayList<Integer> arrli= new ArrayList<Integer>(6);
		
		for(int i=0;i<arr.length;i++) {
			
			arrli.add(arr[i]);
			
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(arrli.lastIndexOf(arrli.get(i))==arrli.indexOf(arrli.get(i))) {
				System.out.println(arrli.get(i));
			}
		}
            
	}

}
