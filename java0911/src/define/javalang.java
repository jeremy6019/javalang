package define;

public class javalang {

	/*
        
        ** java.lang 패키지 
        => java의 기본 패키지 
        => 이패키지는 import하지 않아도 import java.lang;있는 것으로 간주 
        
        1. java.lang.Object 클래스 
        => 자바의 최상위 클래스 
        => 자바의 모든 클래스는 이클래스로부터 상속을 받습니다. 
        => 이클래스에 있는 모든 메소드는 자바의 모든 클래스에 있습니다. 
        => 생성자가 있기는 하지마 실제 이클래스의 객체는 생성할 일이 거의 없기 떄문에 실제 사용은 
            거의 안함 
        => java의 모든 클래스에 공통된 메소드를 만들기 위해서 제공되는 클래스 
        => String tostring(): 객체를 문자열로 만들어서 리턴하는 메소드 
	        기본적으로는 클래스이름과@해시코드 형태로 문자열을 만들어서 리턴 
	        출력하는 메소드에 객체이름을 기재하면 이 메소드의 결과가 출력되는 것입니다. 
	        System.out.printf("%s\n","Hello World"); //Hello World 가 출력 
	        실제로는 "Hello World".toStrion()의 결과 입니다. 
        
           대다수의 클래스가 이메소드를 오버라이디앻서 자신이 저장한 내용이나 다른 것들을 리턴하기도 합니다. 
        
      =>Object clone(); 이메소드는 객체를 복제하기 위해 제공하는 메소드 
          클래스에서 오버라이딩 해서 사용  
          참조형은 =를 가지고 대입하게 되면 참조가 복사됩니다.
          참조를 복사하게 되면 한쪽의 변화가 다른쪽에 영향을 주게 됩니다. 
           한 쪽의 변화가 다른족에 영향을 주지 않도록 하기 위 \해서는 복제해서 사용해야 합니다.
           이때 사용하는 메소드가 clone입니다. 
      
      => boolean equals(Object object): 다른 객체와 내용이 같은지 비교하고자 할 때 사용하는 메소드 
	      클래스에서 오버라이딩해서 사용 
	      참조형은 ==를 통해서 비교하면 참조가 같은지 비교합니다 
	      따라서 내용이 같은지 비교하고자 할때 이 메소드를 오버라이딩해서 사용 
	  
	  =>int hashCode(): 해시코드를 정수로 리턴해주는 메소드 
		  hash: 데이터를 저장하기 위한 주소를 결정하는 방법
		  hashCode:주소에 해당하는 코드 
		  객체를 구별하기 위해 사용하는 코드입니다. 
		  16진수 형태로 나타냅니다. 
		  
	  =>Class getclass():클래스의 종류를 리턴하는 메소드
	      일반개발자가 사용하는 경우는 드물고IDE를 만들때 사용 
	      
	     String x = 10; 
	     Eclipse는 에러표시를 해줍니다. 
	     10.getClass()를 호출해서 이클래스와 String이 어떤 관계인지 확인하고 에러 표시를 한 것입니다. 
	     
	  => void finalize():객체가 소멸될때 호출되는 메소드 
	     객체가 소멸될 때 어떤일을 하고자 하면 이 메소드를 오버라이딩합니다. 
	  
	  => 스레드 관련 메소드: 중요 
		  void wait(): 스레드의 실행을 중지 상태로 만들어서 대기 상태로 만드는 메소드 
		  void notify():  wait()중인 스레드 1개를 깨워서 동작시키는 메소드 
		  void notifyAll(): wait()중인 모든 스레드를 깨워서 동작시키는 메소드 
		  이 메소드들은 생산자와 소비자 문제를 해결하는데 사용하는 메소드들입니다. 
	  
  ** 여러 개의 속성을 묶어서 하나의 데이터를 표현하기 위한 클래스 - DTO(Data Transfer Object - Variable Object)
      => 	번호, 이름, 나이를 표현하기 위한 클래스 
           데이터를 표현하기 위한 클래스는 속성을 private로 만들고 getter & setter(접근자 메소드)를 이용해서 속성을 사용 
	       //번호, 이름, 나이를 저장하기 위한 DTO클래스 
public class UserVO {
    
	//필요한 속성 선언 
	private int num; 
	private String name;
	private int age;
	
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

}
   =>위 클래스의 경우 속성의 값들을 채우기 위해서 매번 여러개의 setter메소드를 호출해야 합니다.
   이런 경우에는 매개변수를 받는 생성자를 생성해서 이문제를 해결 
   이 때 주의할 점은 새로운 생성자를 만들면 기존에 제공되는 매개변수가 없는 생성자가 없어져버리므로 
   매개변수 없는 생성자를 추가할 것인가를 생각해 봐야 합니다.
  => 기존 클래스에 생성자를 추가   	  
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
	 =>UserVO클래스의 내용을 확인하고자 할 때 여러 번의 getter메소드를 호출해야 합니다. 
	 각 속성의 값이 필요하다면 getter를 호출해서 사용하는 것이 맞지만 모든 속성의 값을 확인해 보기 위해서 매번 getter를
	 호출하는 것은 자원의 낭비가 될 수 있습니다. 
	 이런 경우에는 toString()을 재정의해서 출력하는 메소드에 객체이름만 대입해서 출력하는 것이 효율적입니다.  
	 이 메소드도 거의 모든 경우에 오버라이딩을 하기 때문에  자동으로 만드는 기능을 제공  
	
	 @Override
	public String toString() {
		return "UserVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	 =>0개 이상의 데이터를 저장한 것을 =을 이용해서 다른 곳에 복사하면 내부 데이터는 복사되지 않고 
	 가리키고 있는 참조만 복사만 됩니다. 복사본이 내부 데이터를 변경하면 원본의 내부 데이터도 변경됩니다. 
	 복사해야할 작업이 많은 경우에는 clone 메소드를 재정의 해서 복제를 해주는 것이 좋습니다. 
	 =>clone 메소드 만들기 
	 public 자신의 클래스자료형 clone(){ 
	    자신의 클래스 자료형 변수 = new 생성자(); //새로운 인스턴스를 생성 
	    변수.속성 = this.속성 ; // 데이터들을 하나하나 복사합니다. 
	    
	    return 변수;
	  }
	  => 이렇게 한번만 데이터를 복사해 주는 것을 얕은 복사(weak copy)라고 하고 
	      속성이 0개 이상의 데이터로 만들어진 경우 재귀적으로 다시 복제를 하면 이 때는 깊은 복사(deep copy)라고 합니다. 
	 
       => clone()메소드 추가 
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
	
	    =>0개 이상의 데이터를 가진 데이터들의 내용 비교 
	    ==은 데이터를 비교하는 연산자인데 1개의 데이터인 경우들은 저장하고 있는 
	    데이터를 비교하는데 0개이상의 데이터를 가진 것들은 참조를 비교합니다. 
        0개 이상의 데이터를 가진 데이터들 끼리 내용이 같은지 비교할 때는 equals메소드를 재정의해서 필요한 
        속성이 같은지 비교하면 됩니다. 
        
        =>equals 메소드 
        public boolean equals(자신의 자료형 변수명 ){
            if(this.속성 != 변수명.속성){
                return false;
             }
             return true;
             
        }
        
     ** Object 클래스의 사용 
     => 상위 클래스의 참조형 변수에 하위 클래스의 인스턴스 참조를 대입할수 있다. 
     => java의 모든 클래스는 Object클래스로부터 상속받습니다. 
      
     메소드의 매개변수가 Object로 되어있으면 어떤 데이터든지 대입할 수 있습니다. 
     메소드의 return type이 Object이면 반드시 강제 형 변환을 해서 사용해야 합니다. 
     
     ** Wrapper Class 
     => 1개만 저장하는 자료형 -> 0개이상의 자료를 저장하는 자료형 
     => 기본형과 참조형은 데이터를 저장하는 방법도 다르고 읽는 방법도 다르기때문에 서로 호환되지 않습니다
          동일한 알고리즘을 사용하는 메소드를 만들려고 할 때  데이터의 종류가 가본형과 참조형으로 다르다면 데이터의 종류가
          다른 문제때문에  2개이상의 메소드를 구현해야 합니다.
     => 기본형을 사용하지 않고 모두 참조형만 사용한다면 매개변수를 Object로 만들어서 모든 데이터를 받아 들이도록
          할 수 있습니다. 최근에 많이 사용되는 언어들은  value(값)와 reference(참조)이런 형태로 분류하지 않고 모두 
          데이터의 참조를 저장하도록 합니다. 
      => 문자열을 숫자로 만들때 사용 
     
        boolean -> Boolean 
        byte -> Byte 
        short -> Short 
        char -> Character 
        int -> Integer
        long -> Long 
        float -> Float 
        double -> Double 
        
        1. 기본형을 Wrapper class의 인스턴스로 변경 
        new WrapperClass(기본형데이터)
        
        int x =10; 
        Integer i = new Integer(x); 
        
        2. Wrapper Class데이터를 기본형으로 변경하기 
        자료Value()메소드를 호출하면 자료형으로 리턴됩니다. 
        
        x=i.intValue(); 
        
        3. 문자열을 Wrapper Class의 데이처로 변경하기 
        static 메소드로 parse자료형(문자열) 
        
        String str = "101020"; 
        
        int su = Integer.parseInt(str);
        
        4. 숫자데이터를 String으로 변경하기 
        => 숫자데이터 + ""  // 숫자데이터와 문자데이터가 +로연산하면 문자열 결합을 합니다. 
        => WrapperClass.toString()
        
        5. Auto Boxing 과 Auto Unboxing 
        => java1.5버전부터는 기본형 데이터를 Wrapper Class에 바로 대입해도 가능 
        Integer i = 10; // Integer i = new Integer(10);로 변경해서 실행  
        
        => Wrapper Class의 데이터를 기본형 변수에 바로 대입해도 가능 
        int x = i; // int x = i.intValue();로 변경해서 실행  
        
     ** java.math.BigInteger와 java.math.BigDecimal 
     =>큰 정수나 숫자를  저장하기 위한 클래스 
     =>int나 double을 가지고 길이가 긴 숫자를 저장하기 어렵기 때문에 문자열 형태로 저장하고 잇다가 
     연산을 할때 숫자로 변경해서 작업을 수행하도록 해주는 클래스 
     int는 21억 정도밖에 저장을 못합니다. 
     float 과 double은 숫자의 정밀도에 한계가 있습니다. 
     => Oracle 데이터베이스와 java연동을 할때 자료형을 설정하시 않으면 숫자는 Bigdecimal로 전달됩니다. 
     =>BigDecimal은 숫자를 문자열 형태로 생성자에 대입받아서 인스턴스를 생성하고 +대신에 add메소드를 
        이용해서 더하기를 합니다. 
         
        
               
        
      
         
         
         
 */
	  
}
