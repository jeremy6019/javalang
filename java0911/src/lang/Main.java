package lang;

public class Main {

	public static void main(String[] args) {
		
		//userVO 클래스의 객체를 생성하고 속성을 설정한 수 내용을 출력 
		UserVO man = new UserVO(); 
		
		//속성을 설정 
		man.setNum(1);		
		man.setName("김기범");
		man.setAge(45);
		
		// 내용을 출력 
	   System.out.printf("번호: %d\t이름: %s\t나이: %d세\n",
			   man.getNum(), man.getName(), man.getAge());
  
	   //매개변수가 있는 생성자를 이용해서 객체를 생성하고 속성을 설정 
	   UserVO man1 = new UserVO(1, "김기범 ", 45); 
	   UserVO man2 = new UserVO(2, "이은영 ", 39); 
	   
	   
	   
	   //객체의 모든 속성 확인하기 
	   //데이터를 표현하는  클래스를 만들 떄는 toString()을 오버라이딩 하고 
	   //확인할 때는 아래처럼 이름 만으로 확인 
	   //toString()메소드를 디버깅을 위한 메소드라고도 합니다. 
	   System.out.printf("%s\n", man1);
	   System.out.printf("%s\n", man2);
	   
	   //UserVO 인스턴스를 생성 
	   UserVO man3 = new UserVO(3, "김윤서", 10);
	   // man3가리키고 있는 곳의 참조를 man4에 복사 
	   UserVO man4 = man3;
	   //man4	가 자신의 num을 31로 변경    
	   man4.setNum(31);
	   //man3를 출력 -man3의 num도 31로 변경되어 있습니다.  
	  System.out.printf("%s\n",man3);
	
	  UserVO man5 = man3.clone(); 
	  System.out.printf("man3:%s\n", man3);
	  System.out.printf("man5:%s\n", man5);
	 //man5가 num을 변경 
	  man5.setNum(77);
	  System.out.printf("man3:%s\n", man3);
	  System.out.printf("man5:%s\n", man5);
	  
	  UserVO man6 = man3.clone();
	  System.out.printf("%b\n", man6 == man3);  //내용을 비교하지 않기 때문에 false
	  System.out.printf("%b\n", man6.equals( man3));  //내용을 비교해서 true 
	  
	}

}
