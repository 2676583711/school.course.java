public class TestInterface implements Animal3 {

	public TestInterface() {
		super();

		shout();
		run();
	}

	@Override
	public void shout() {
		System.out.println("ths dog is shoutting....pi=" + pi);

	}

	@Override
	public void run() {
		System.out.println("ths dog is running....");

	}

	public static void main(String[] args) {
		TestInterface t = new TestInterface();
		// System.out.println("new TestInterface().pi=" + new
		// TestInterface().pi);

		System.out.println("t.pi=" + t.pi);

		t.kindOf("wu gui");

		// t.age(12);
	}

}

interface Animal2 {

	void shout();

	void run();
}

interface Animal3 extends Animal2 {
	// �սӿڼ̳�Animal2�ӿ�

	double pi = 3.14;

	default void kindOf(String k) {
		System.out.println("the dog kind of:" + k);
	}

	static void age(int age) {
		System.out.println("the dog age=" + age);
	}
}