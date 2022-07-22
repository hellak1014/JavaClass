package day17;

public class Exam1 extends Thread {

	 
	    int seq;

	    public Exam1(int seq) {
	        this.seq = seq;
	    }

	    public void run() {
	        System.out.println(this.seq + " thread start.");  // 쓰레드 시작
	        try {
	            Thread.sleep(1000);  // 1초 대기한다.
	        } catch (Exception e) {
	        }
	        System.out.println(this.seq + " thread end.");  // 쓰레드 종료 
	    }

	    public static void main(String[] args) {
	        for (int i = 0; i < 10; i++) {  // 총 10개의 쓰레드를 생성하여 실행한다.
	            Thread t = new Exam1(i);
	            t.start();
	        }
	        System.out.println("main end.");  // main 메소드 종료
	    }
	}

//thread클래스를 상속했기 때문에 start메소드 실행시 run메소드가 수행된다. thread클래스는 start실행시 run메소드가 수행되도록 내부적으로 동작한다. 
