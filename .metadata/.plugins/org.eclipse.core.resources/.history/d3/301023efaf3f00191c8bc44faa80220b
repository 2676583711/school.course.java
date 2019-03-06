package  school.java.course;


public class RepeatMethod {

	private String name;
	private int age;
	
	@SuppressWarnings("unused")
	private RepeatMethod() {
		super();
		
		speak();
 	}
	
	

	public RepeatMethod(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
		speak(name,age);
	}



	public static void main(String[] args) {
		new RepeatMethod("tom",54);
	}
	
	
	public void speak( ){
		System.out.println("my name is no arguments");
	}
	
	public void speak(String name){
		System.out.println("my name is "+name);
	}
	
	public void speak(String name,int age){
		System.out.println("my name is "+name+","+age);
	}
	
}
