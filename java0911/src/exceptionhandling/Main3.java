package exceptionhandling;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args)  {
		
		// main에 throws를 만들면 예외가 발생한 경우 운영체제가 처리합니다.
		//main은 운영체제가 호출하기 때문입니다. 
		// 가급적 안하는 방향으로 !! 
		
		// 1-10까지 대기하면서 출력하기 
		for(int i = 1; i <= 10; i++) {			
			System.out.printf("i : %d\n", i);
			// 1초씩 대기		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				    System.out.printf("인터럽트 예외 발생\n");
				    System.out.printf("예외:%s\n", e.getMessage());
					e.printStackTrace();
				}
				//Scanner를 사용하는 경우 close()를 호출하지 않으면 
				//메모리 누수(leak)가 밸생한다고 경고가 보입니다.
				//이렇게 try안에서 만들면 자동으로 마지막에 close()를 호출하므로
				//경고가 발생하지 않습니다. 
				try(Scanner sc = new Scanner(System.in);) {
					sc.nextInt();
				}
		}

	}

}
