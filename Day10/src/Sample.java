
public class Sample {

	public void shouldBeRun() {
		System.out.println("ok thanks.");
	}
	
	
	public static void main(String[] args) {
		
		Sample sample = new Sample();
		int c;
		try {
			c = 4 / 0;
			sample.shouldBeRun();
		} catch (ArithmeticException e) {
			c = -1;
		 } finally {
			 sample.shouldBeRun();
		 }
		
		
		
		
	}
	
}
