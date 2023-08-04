
public class Person {

	
	String name;
	int age;
	
	public void eat(String sr) {
		System.out.println(sr+"밥을 먹는다");
	}
	
	
	public void showInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
	}
	
	public static void main(String[] args) {
		
	Person person = new Person();
	person.age = 20;
	person.name="이강인";
	person.showInfo();
	Person person2 = new Person();
	person.age = 30;
	person.name="손흥민";
	person.showInfo();
	Person person3 = new Person();
	person.age = 70;
	person.name="김민재";
	person.showInfo();
	
		
		
	}
}
