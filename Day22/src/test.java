
     
    	public class test {
    	    public static void main(String[] args) {
    	     


    			System.out.println(1);
    			System.out.println(2);
    			
    			try {
    				System.out.println(3);
    				System.out.println(0/0); 									// 예외 발생
    				System.out.println(4); 										// 실행 안됨.
    			} catch (ArithmeticException ae) {
    				ae.printStackTrace();										//어떻게 발생했는지 봐라
    				System.out.println("예외메세지 : " + ae.getMessage());			//에러 이름 내놔라
    			}
    			
    			System.out.println(6);
    	    		}

    	    	
    	    }
    	