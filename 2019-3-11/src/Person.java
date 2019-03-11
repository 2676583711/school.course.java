import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 实验 static 代码块
 */
public class Person {

	static {
		System.out.println("person.static code");
	}

	public static void main(String[] args) {

		Test t = new Test(); // 运行结果：person.static code
		Test t2 = new Test(); // test.static code

		System.out.println("current system properties:"
				+ System.getProperties().toString());

		try {
			BufferedWriter os = new BufferedWriter(new FileWriter(new File(
					"system_properties.txt"), true));

			// os.write(System.getProperties().toString());
			// os.write(Runtime.getRuntime().toString());
			os.flush();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			//
			Runtime.getRuntime().exec("eclipse.exe");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}

// /***********************************/**************//*/**/*/*/*/*/*/

class Test {
	static {
		System.out.println("test.static code");
	}
}
