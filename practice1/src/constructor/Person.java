package constructor;

public class Person {
 String name;
 float height;
 float weight;
 
  public Person() { }  // 자바 컴파일러가 자동으로 제공하는 디폴트 생성자
  					   // 디폴트 생성자 직접 추가
 
 //---------------------------------------------------------------
 
 public Person(String pname) {	// 사람 이름을 매개변수로 입력받아서 
	 name = pname;				// Person클래스를 생성하는 생성자
 }
 
// public Person(float pheight) {
//	 height = pheight;
// }
 
 //public Person(float pweight) {
//	 weight = pweight;
// }
 
 
//---------------------------------------------------------------
 
 
}

