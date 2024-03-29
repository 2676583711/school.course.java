package  school.java.course;


public class RepeatMethod {

	private String name;
	private int age;
	
	@SuppressWarnings("unused")
	private RepeatMethod() {
 		
		 
		speak();
 	}
	
	public RepeatMethod(String name ) {
		this(name,36452);
		
		this.name = name;
		 
		
		speak(name,age);
	}

	public RepeatMethod(String name, int age) {
		this();
		
		this.name = name;
		this.age = age;
		
		speak(name,age);
	}



	public static void main(String[] args) {
		new RepeatMethod("tom");
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
