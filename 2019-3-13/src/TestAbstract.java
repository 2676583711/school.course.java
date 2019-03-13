import java.io.IOException;
import java.io.InputStream;

abstract class Animal {

	public abstract void shout();

	public void say(int i) {

		System.out.println("i=" + i);
	}
}

class Dog extends Animal {

	@Override
	public void shout() {
		System.out.println("cmd");
	}

}

// errors:The type Animal cannot be a
// superinterface of Cat; a superinterface must
// be an interface

// 抽象类只能使用extends关键字继承实现,不能想接口interface一样使用implements关键字实现
// class Cat implements Animal {
// public void shout() {
// System.out.println("speak english ");
// }
//
// }

public class TestAbstract {
	public static void main(String[] args) {

		Dog d = new Dog();
		d.shout();
		d.say(150);

		try {
			Process process = Runtime.getRuntime().exec(
					"C:/Program Files/Git/git-bash.exe");
			 
			process.waitFor();

			// 下面两个可以获取输入输出流
			InputStream errorStream = process.getErrorStream();
			InputStream inputStream = process.getInputStream();

			 inputStream.read("git status".getBytes());
			 
			 inputStream.close();
			 errorStream.close();
			 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// new Animal(); // errors:Cannot instantiate the type Animal

	}

}
