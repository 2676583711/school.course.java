public class Outer { // �ⲿ��
	/*
	 * �����ڲ���
	 */
	public int o1 = 10; // // �ⲿ��ĳ�Ա����

	public class In1 { // ��Ա�ڲ���,public ����
		public int i1 = 10;

		public void in1() { // public�����Ա�ڲ���ĳ�Ա����

			System.out.println("public�����Ա�ڲ���ĳ�Ա����,�ⲿ��ĳ�Ա����o1=" + o1);
		}
	}

	private class In2 { // ��Ա�ڲ���,private����

		public int i1 = 10; // private�����Ա�ڲ���ĳ�Ա����,

		public void in2() { // private�����Ա�ڲ���ĳ�Ա����
			System.out.println("private�����Ա�ڲ���ĳ�Ա����");
		}

	}

	public void out() { // �ⲿ��ĳ�Ա����

		class Inner1 { // �����ڲ��࣬����������η�

			public void in1() { // �����ڲ���ĳ�Ա����

			}

		}
	}

}
