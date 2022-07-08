package Day6_8;

public class ConstructorTest {

	public static void main(String[] args) { //main에서부터 시작
		
		Data d1 = new Data1(); //data1에서는 생성자가 없어도 디폴트 생성자를 만듬. 
		Data2 d2 = new Data2(); //data2에서는 생성자가 있기때문에 디폴트가 만들어지지 않음. -> 이대로 쓰고싶으면 data2에 디폴트 생성자를 쓴다.
	}
} //compile error발생. data2의 경우 생성자가 있으면 자바가 만들어주질 않아서 에러가 난것. 
//-> 기본생성자가 컴파일러에 의해 추가되는 경우는 따로 생성자가 없을때다. 
