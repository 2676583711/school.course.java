public class Outer { // 外部类
	/*
	 * 测试内部类
	 */
	public int o1 = 10; // // 外部类的成员变量

	public class In1 { // 成员内部类,public 级别
		public int i1 = 10;

		public void in1() { // public级别成员内部类的成员方法

			System.out.println("public级别成员内部类的成员方法,外部类的成员变量o1=" + o1);
		}
	}

	private class In2 { // 成员内部类,private级别

		public int i1 = 10; // private级别成员内部类的成员变量,

		public void in2() { // private级别成员内部类的成员方法
			System.out.println("private级别成员内部类的成员方法");
		}

	}

	public void out() { // 外部类的成员方法

		class Inner1 { // 方法内部类，不能添加修饰符

			public void in1() { // 方法内部类的成员方法

			}

		}
	}

}
