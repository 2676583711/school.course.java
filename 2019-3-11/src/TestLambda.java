public class TestLambda {

	/*
	 * lambda���ʽ�����Ű���
	 * 
	 * lambda���ʽ��Խӿ�
	 * �K��Ҫ��ӿڣ�ֻ����һ�����󷽷�
	 * 
	 * �ŵ㣺����Ҫ��ʾ�Ķ�����ʵ�ֽӿ��ˣ����ٴ�����
	 * 
	 * ȱ�㣺�涨�ӿ�ֻ����һ�����󷽷�������ʹ��lambda���ʽ
	 * 
	 */
	public static void main(String[] args) {

		say(() -> System.out.println("no arguments interface"));

	}

	public static void say(a a) {
		a.say();
	}

}

interface a {
	public void say();
}