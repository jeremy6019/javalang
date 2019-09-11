package lang;

//번호, 이름, 나이를 저장하기 위한 DTO클래스 
public class UserVO {
    
	//필요한 속성 선언 
	private int num; 
	private String name;
	private int age;
	
  
	//매개변수가 없는 생성자 	
	public UserVO() {
		super();		
	}
	
    //매개변수가 있는 생성자 
	public UserVO(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	
	//접근자 메소드 
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	//데이터를 복제해주는 메소드 
	public UserVO clone() {
	    //새로운 인스턴스를 생성 
		UserVO other = new UserVO(); 
		//데이터들을 복사 
		other.num = this.num;
		other.name = this.name;
		other.age = this.age;
		
		//새로 만들어지 데이터를 리턴 
		return other; 
	}
	
	//내용을 비교해주는 메소드 
	public boolean equals(UserVO other) {
		if(this.num != other.num) {
			return false;
		}  else if(this.age != other.age) {
			return false;
		}  
		return true;
	}
	
	
	
}
