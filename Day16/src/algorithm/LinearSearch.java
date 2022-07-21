package algorithm;

public class LinearSearch {

	public static void main(String[] args) {
		
		int i = 0;
		int arr[] = {4, 2, 3, 5, 1};
		
		for (i = 0; i<arr.length; i++) {
			if (arr[i] == 5) {
				System.out.println("찾는 값은" + i + "번째에 있습니다.");
				break;
			} 
			
			} if (i==arr.length) {
				System.out.println("찾는 값이 없습니다.");
		}
		
		
	}
	
}
	




