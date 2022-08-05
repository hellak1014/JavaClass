package Hash;

import Hash.Input;
public class Output {

	public static void main(String[] args) {
		
		int[] arrS = {15, 13, 1050, 60, 80, 8, 78};
		int[] arrH = new int[11];
		
		Input inputs = new Input();
		int[] arr = inputs.Inputs(arrS, arrH);
		
		int x = 1050;
		int k = x;
		k = k % 11;
		
		while(arrH[k] != 0) {
			if(arrH[k] == x) {
				System.out.println(x + "저장위치는" + k + "번째에 있습니다.");
				break;
			}else {
				k = (k+1)%11;
			}
		}
		
		if (arrH[k] == 0) {
			System.out.println("찾는 값이 없습니다.");
		}

	}

}
