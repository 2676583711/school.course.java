package cn.zhou;

public class Method1 {

	public static void main(String[] args) {
		
		 new Method1().panDuan('6');
		 
		 new Method1().course(1);
		 
		 int[]a={5,6,7,9,4,3,2,1,0,8};
		 new Method1().biDaXiao(a);

	}

	public  void panDuan(char c) { //判斷是否元音字母
		switch (c) {
		case 'a' :
			System.out.println(c+"是一个元音字母");
			break;
		case 'e':
			System.out.println(c+"是一个元音字母");
			break;
			
		case 'i':
			System.out.println(c+"是一个元音字母");
			break;
			
		case 'o':
			System.out.println(c+"是一个元音字母");
			break;
			
		case 'u':
			System.out.println(c+"是一个元音字母");
			break;
			
		case 'A':
			System.out.println(c+"是一个元音字母");
			break;
		case 'E':
			System.out.println(c+"是一个元音字母");
			break;
			
		case 'I':
			System.out.println(c+"是一个元音字母");
			break;
			
		case 'O':
			System.out.println(c+"是一个元音字母");
			break;
			
		case 'U':
			System.out.println(c+"是一个元音字母");
			break;
		default:
			System.out.println(c+"不是一个元音字母");
			break;
		}
	}

	public void course(int course) {  //判断成绩优异
		if(course <0 | course>100)  {
			System.out.println(course+"：分数输入错误");
			
		}else if(course >=60 &&course<=80){
			System.out.println(course+":及格");

		}else if(course >=80 &&course<90){
			System.out.println(course+":良好");

		}else if(course >=90 &course==100){
			System.out.println(course+":优秀");

		}else if (course<60){
			System.out.println(course+":不及格");
		}
		
	}

	public void biDaXiao(int[]a) {  //求10个数的最大值，平均值
		int max=a[0];
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			sum+=a[i];
		}
		System.out.println("最大值是:"+max+"\n平均值是："+sum/10);

	}

}
