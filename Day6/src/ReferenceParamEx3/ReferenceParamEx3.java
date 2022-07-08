package ReferenceParamEx3;

public class ReferenceParamEx3 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4}; //배열 생성
		
		printArr(arr); //배열의 모든 요소를 출력 (1)
		sortArr(arr); //배열을 정렬 (3)
		printArr(arr); // 정렬 후 결과를 출력.(2)
		System.out.println("sum="+sumArr(arr)); //배열의 총합을 출력 (2)
	}
	
	static void printArr(int[]arr) { //배열의 모든 요소를 출력 (1)
		System.out.print("[");
		
		for(int i : arr) //배열 값를 하나씩 i에 넣어서 값이 없어질때까지
			System.out.print(i+","); // i, i, i 식으로 출력해라. 
		System.out.println("]"); // 결과값 [3,2,1,6,5,4]
	}
	
	static int sumArr(int[] arr) { //(2)
		int sum = 0; //sum 사용해야하니 0으로 만들어주고 변수 정의 해주고
		
		for(int i=0; i<arr.length; i++) //i의 기본값이 0이고 배열의 방 갯수 만큼 i를 더해서 출력해라.  
			sum += arr[i]; //모든 출력 값을 더해라. -> 3, 2, 1, 6, 5, 4 출력해서 더하기.
		return sum; //sum=21
	}
	
	static void sortArr(int[] arr) { //(2)
		for(int i=0; i<arr.length-1; i++) //
			for(int j=0; j<arr.length-1-i; j++)
				if(arr[j] > arr[j+1]) { //i = 0, j = 0 대입. -> arr[0]>arr[1] -> 3>2
					int tmp = arr[j]; // 231654 (1)
										// 213654 (2)
					arr[j] = arr[j+1]; //213654(3) 3-4번째 자리 비교햇는데 똑같아서.)
					arr[j+1] = tmp;		//213564 (4) 4와 5번째 자리 비교. 65였으니 바꾸기. 
				}						//213546 (5) 5와 6번째 자리 비교.
	}
										//반복문 과정이 이해가 안되면 if문을 빠져나와서 sysout하기. 
}
