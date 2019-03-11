/*
 * 实验 static 代码块
 */
public class Person {

	static {
		System.out.println("person.static code");
	}

	public static void main(String[] args) {
									
		Test t = new Test();  // 运行结果：person.static code
		Test t2 = new Test(); // test.static code
		


	}

}

///***********************************/**************//*/**/*/*/*/*/*/

class Test {
	static {

		System.out.println("test.static code");
	}
}