package day17;

	import java.util.ArrayList;
	
	public class Exam2 extends Thread {

		 
	    int seq;

	    public Exam2(int seq) {
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
	    	ArrayList<Thread> threads = new ArrayList<>();
	        for (int i = 0; i < 10; i++) {  // 총 10개의 쓰레드를 생성하여 실행한다.
	            Thread t = new Exam1(i);
	            t.start();
	            threads.add(t);
	        }
	        
	        for(int i =0; i<threads.size(); i++) {
	        	Thread t = threads.get(i);
	        	try {
	        		t.join();
	        	} catch(Exception e) {
	        	}
        	}
	        System.out.println("main end.");  // main 메소드 종료
	    }
	}

